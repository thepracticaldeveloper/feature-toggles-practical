package io.tpd.dadjokes.jokes;

import java.util.List;
import java.util.stream.Collectors;

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
            var dadJokes = dadJokesRepository.getDadJokes(
                    appConfiguration.premiumJokesPermission()
            );
            return appConfiguration.dadJokesV2Enabled() ?
                    ResponseEntity.ok(dadJokes) :
                    ResponseEntity.ok(mapToV1(dadJokes));
        } else {
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).build();
        }
    }

    private List<DadJoke> mapToV1(final List<DadJokeV2> dadJokes) {
        return dadJokes.stream().map(j2 -> new DadJoke(j2.joke()))
                .collect(Collectors.toList());
    }
}
