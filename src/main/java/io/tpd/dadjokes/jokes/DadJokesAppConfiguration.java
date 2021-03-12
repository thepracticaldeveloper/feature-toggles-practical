package io.tpd.dadjokes.jokes;

import org.springframework.stereotype.Component;

import no.finn.unleash.Unleash;

@Component
public class DadJokesAppConfiguration {

    private final Unleash unleash;

    public DadJokesAppConfiguration(final Unleash unleash) {
        this.unleash = unleash;
    }

    public boolean dadJokesFunctionalityEnabled() {
        return unleash.isEnabled("DadJokesFunctionalityToggle");
    }

    public boolean dadJokesV2Enabled() {
        return unleash.isEnabled("DadJokesModelV2Toggle");
    }

}
