package io.tpd.dadjokes.jokes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record DadJokesResponse(@JsonProperty("jokes") List<DadJoke> dadJokes) {
}
