package io.tpd.dadjokes.jokes;

import com.fasterxml.jackson.annotation.JsonProperty;

public record DadJoke(@JsonProperty("joke") String joke) {
}
