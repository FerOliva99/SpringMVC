package com.diego.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.curso.springboot.webapp.springboot_web.models.dto.ParamDto;
import com.diego.curso.springboot.webapp.springboot_web.models.dto.ParamDtoMix;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("api/params")
public class RequestParamController {

    @GetMapping("/foo2")
    public ParamDto foo2(
            @RequestParam(required = false, defaultValue = "Hola desde request param [defaultValue]", name = "mensaje") String message) {
        ParamDto param = new ParamDto();
        // param.setMessage(message != null ? message : "*Hola*");
        param.setMessage(message);
        return param;
    }

    @GetMapping("/foo")
    public ParamDto foo(
            @RequestParam(required = false, defaultValue = "Hola desde request param [defaultValue]", name = "mensaje") String message) {
        ParamDto param = new ParamDto();
        // param.setMessage(message != null ? message : "*Hola*");
        param.setMessage(message);
        return param;
    }

    @GetMapping("/bar")
    public ParamDtoMix bar(@RequestParam String text, @RequestParam Integer code) {
        ParamDtoMix param = new ParamDtoMix();
        param.setMessage(text);
        param.setCode(code);
        return param;
    }

    @GetMapping("/request")
    public ParamDtoMix request(HttpServletRequest request) {
        Integer code = 10;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
            System.out.println("Ocurrio una excepcion al convertir el numero y se deja por defecto el numero 10");
        }

        ParamDtoMix params = new ParamDtoMix();
        params.setCode(code);
        params.setMessage(request.getParameter("message"));
        return params;
    }

}
