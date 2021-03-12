package io.tpd.dadjokes.jokes;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class DadJokesRepositoryMemImpl implements DadJokesRepository {

    private List<DadJoke> IN_MEMORY_JOKES = List.of(
            new DadJoke("""
                    I only know 25 letters of the alphabet.
                    I don't know y."""),
            new DadJoke("""
                    What happens when you put your hand in a blender?
                    You get a hand shake.
                    """),
            new DadJoke("""
                    If you think swimming with dolphins is expensive, you should
                     try swimming with sharks.
                    It cost me an arm and a leg!""")
    );

    @Override
    public List<DadJoke> getDadJokes() {
        return IN_MEMORY_JOKES;
    }
}
