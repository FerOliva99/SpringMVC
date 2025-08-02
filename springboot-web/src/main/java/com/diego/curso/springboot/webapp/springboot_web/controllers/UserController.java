package com.diego.curso.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/detailsModel")
    public String details(Model model) {
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("name", "Diego");
        model.addAttribute("lastname", "Martinez");
        model.addAttribute("age", "25");
        return "details";
    }

    @GetMapping("/detailsMap")
    public String detailsMap(Map<String, Object> map) {
        map.put("title", "Hola Mundo Spring Boot");
        map.put("name", "Diego");
        map.put("lastname", "Martinez");
        map.put("age", "25");
        return "details";
    }

}
