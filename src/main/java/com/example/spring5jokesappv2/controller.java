package com.example.spring5jokesappv2;

import com.example.spring5jokesappv2.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rejaul.reaj
 * @since 11/17/21
 */
@Controller
public class controller {

    private final JokesService jokesService;

    public controller(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("Joke", jokesService.getJoke());
        return "index";
    }
}