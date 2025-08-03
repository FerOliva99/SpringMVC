package com.diego.curso.springboot.webapp.springboot_web.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import java.util.Map;

//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.curso.springboot.webapp.springboot_web.models.User;
import com.diego.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("name", "Diego");
        body.put("lastname", "Martinez");
        body.put("age", "25");
        return body;
    }

    @GetMapping("/detailsUser")
    public User detailsUser() {
        User usuario = new User("Diego", "Martinez", 25);
        return usuario;
    }

    @GetMapping("/detailsUserDto")
    public UserDto detailsUserDto() {
        UserDto userDto = new UserDto();
        User usuario = new User("Diego", "Martinez", 25);
        userDto.setUser(usuario);
        userDto.setTitle("Prueba pasando un DTO");
        return userDto;
    }

    @GetMapping("/detailsUsers")
    public List<User> listUsers() {
        User usuario1 = new User("Karen", "Melgar", 26);
        User usuario2 = new User("Diego", "Oliva", 25);
        // User usuario3 = new User("Oscar", "Hernandez", 35);

        /*
         * List<User> usuarios = new ArrayList<>();
         * usuarios.add(usuario1);
         * usuarios.add(usuario2);
         * usuarios.add(usuario3);
         * return usuarios;
         */

        List<User> usuarios = Arrays.asList(usuario1, usuario2);
        return usuarios;
    }
}
