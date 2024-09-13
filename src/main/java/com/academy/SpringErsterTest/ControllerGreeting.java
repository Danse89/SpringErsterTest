package com.academy.SpringErsterTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerGreeting {


    @GetMapping("/greeting")
    public String greeting(Model model) {
        return "greeting";
    }

}
