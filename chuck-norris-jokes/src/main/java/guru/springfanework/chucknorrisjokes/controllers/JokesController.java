package guru.springfanework.chucknorrisjokes.controllers;


import guru.springfanework.chucknorrisjokes.services.JokeServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeServices jokeServices;

    public JokesController(JokeServices jokeServices) {
        this.jokeServices = jokeServices;
    }

    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke", jokeServices.getRandomJoke());
        return "chucknorris";

    }
}
