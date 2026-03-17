package com.example.demo.service;

import com.example.demo.model.Producto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.List;

@Service
public class ProductoService {

    private final List<Producto> productos = List.of(
        new Producto("1", "Laptop",  1200.0),
        new Producto("2", "Mouse",     25.0),
        new Producto("3", "Teclado",   75.0)
    );

    public Flux<Producto> obtenerTodos() {
        return Flux.fromIterable(productos);
    }

    public Mono<Producto> obtenerPorId(String id) {
        return Flux.fromIterable(productos)
                   .filter(p -> p.getId().equals(id))
                   .next();
    }
}