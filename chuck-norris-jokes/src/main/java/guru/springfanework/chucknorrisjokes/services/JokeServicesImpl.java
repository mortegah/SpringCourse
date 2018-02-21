package guru.springfanework.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServicesImpl implements JokeServices {

    @Override
    public String getRandomJoke() {
       return new ChuckNorrisQuotes().getRandomQuote();
    }
}
