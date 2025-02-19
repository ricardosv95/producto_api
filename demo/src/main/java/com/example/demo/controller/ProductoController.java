package com.example.demo.controller;

import com.example.demo.domain.Producto;
import com.example.demo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> obtenerTodos(){
        return productoService.obtenerTodos();
    }

    @PostMapping
    public Producto guardar(@RequestBody Producto producto){
        return productoService.guardar(producto);
    }

}
