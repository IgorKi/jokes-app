package com.igorkiv.spring5jokesapp.controllers;

import com.igorkiv.spring5jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeControllers {
    private final JokeService jokeService;

    public JokeControllers(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"","/"})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
