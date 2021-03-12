package io.tpd.dadjokes.jokes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record DadJokesResponseV2(@JsonProperty("jokes") List<DadJokeV2> dadJokes) {
}
