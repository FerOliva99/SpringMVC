package com.diego.curso.springboot.webapp.springboot_web.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.diego.curso.springboot.webapp.springboot_web.models.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/list")
    public String list(ModelMap model) {
        // List<User> users = Arrays.asList(/* usuario1, usuario2, usuario3 */);
        // List<User> users = Arrays.asList(usuario1, usuario2, usuario3);
        model.addAttribute("title", "Lista en Thymeleaf");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        User usuario1 = new User("Karen", "Melgar", 26);
        User usuario2 = new User("Diego", "Oliva", 25, "prueba2@prueba2.com");
        User usuario3 = new User("Oscar", "Hernandez", 35);

        /*
         * List<User> users = Arrays.asList(usuario1, usuario2, usuario3);
         * return users;
         */
        return Arrays.asList(usuario1, usuario2, usuario3);
    }

}
