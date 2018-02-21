package guru.springfanework.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServicesImpl implements JokeServices {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServicesImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getRandomJoke() {
       return chuckNorrisQuotes.getRandomQuote();
    }
}
