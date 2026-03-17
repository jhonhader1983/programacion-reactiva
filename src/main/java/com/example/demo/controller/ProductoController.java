package com.example.demo.controller;

import com.example.demo.model.Producto;
import com.example.demo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService service;

    @GetMapping
    public Flux<Producto> listar() {
        return service.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Mono<Producto> obtenerUno(@PathVariable String id) {
        return service.obtenerPorId(id);
    }
}