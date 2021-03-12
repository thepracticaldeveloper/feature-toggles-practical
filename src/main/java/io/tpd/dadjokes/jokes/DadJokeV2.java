package io.tpd.dadjokes.jokes;

import com.fasterxml.jackson.annotation.JsonProperty;

public record DadJokeV2(@JsonProperty("joke") String joke,
                        @JsonProperty("premium") boolean premium) {
}
