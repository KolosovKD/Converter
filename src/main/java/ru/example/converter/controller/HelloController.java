package ru.example.converter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    static String helloName = "dummy";

    @GetMapping("/hello")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="dummy") String name, Model model) {
        helloName = name;
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/bye")
    public String bye(Model model) {
        model.addAttribute("name", helloName);
        return "bye";
    }

}
