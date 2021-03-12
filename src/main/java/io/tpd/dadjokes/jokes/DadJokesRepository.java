package io.tpd.dadjokes.jokes;

import java.util.List;

public interface DadJokesRepository {

    List<DadJokeV2> getDadJokes(boolean includePremium);
}
