package com.example.demo.service;

import com.example.demo.domain.Producto;
import java.util.List;

public interface ProductoService {
    List<Producto> obtenerTodos();
    Producto guardar(Producto producto);
    Producto buscarPorId(Long id);
    void eliminar(Long id);
}
