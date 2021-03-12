package io.tpd.dadjokes.jokes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class DadJokesRepositoryMemImpl implements DadJokesRepository {

    private List<DadJokeV2> IN_MEMORY_JOKES = List.of(
            new DadJokeV2("""
                    I only know 25 letters of the alphabet.
                    I don't know y.""", true),
            new DadJokeV2("""
                    What happens when you put your hand in a blender?
                    You get a hand shake.
                    """, false),
            new DadJokeV2("""
                    If you think swimming with dolphins is expensive, you should
                     try swimming with sharks.
                    It cost me an arm and a leg!""", true)
    );

    @Override
    public List<DadJokeV2> getDadJokes(boolean includePremium) {
        return includePremium ? IN_MEMORY_JOKES :
                IN_MEMORY_JOKES.stream().filter(j -> !j.premium())
                        .collect(Collectors.toList());
    }
}
