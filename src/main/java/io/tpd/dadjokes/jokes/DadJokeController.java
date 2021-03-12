package io.tpd.dadjokes.jokes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jokes")
public class DadJokeController {

    private final DadJokesRepository dadJokesRepository;
    private final DadJokesAppConfiguration appConfiguration;

    public DadJokeController(final DadJokesRepository dadJokesRepository, final DadJokesAppConfiguration appConfiguration) {
        this.dadJokesRepository = dadJokesRepository;
        this.appConfiguration = appConfiguration;
    }

    @GetMapping
    public ResponseEntity getDadJokes() {
        if (appConfiguration.dadJokesFunctionalityEnabled()) {
            return ResponseEntity.ok(new DadJokesResponse(dadJokesRepository.getDadJokes()));
        } else {
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).build();
        }
    }
}
