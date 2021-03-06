package com.example.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String main (){
        return "index";
    }

    @GetMapping("/home")
    public String home (ModelMap modelMap){
        List <String> names = new ArrayList<>();
        names.add("Armen");
        names.add("Vzgo");
        names.add("Vaxo");
        modelMap.addAttribute("name",names);
        return "home";
    }
}
