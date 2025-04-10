package com.example.msproducto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @GetMapping
    public String hello() {
        return "Hola desde el microservicio de productos";
    }
}
