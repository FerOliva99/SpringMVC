package com.diego.curso.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/detailsModel")
    public String details(Model model) {
        System.out.println("Peticion a /detailsMap");
        logger.info("LOG: Peticion a /detailsModel");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("name", "Diego");
        model.addAttribute("lastname", "Martinez");
        model.addAttribute("age", 25);
        model.addAttribute("email", null);
        return "details";
    }

    @GetMapping("/detailsMap")
    public String detailsMap(Map<String, Object> map) {
        System.out.println("Peticion a /detailsMap");
        logger.info("LOG: Peticion a /detailsMap");
        map.put("title", "Hola Mundo Spring Boot");
        map.put("name", "Diego");
        map.put("lastname", "Martinez");
        map.put("age", 17);
        map.put("email", "diegoliva1999@gmail.com");
        return "details";
    }

}
