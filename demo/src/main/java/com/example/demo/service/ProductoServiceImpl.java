package com.example.demo.service;

import com.example.demo.domain.Producto;
import com.example.demo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    //@Override
    public List<Producto> obtenerTodos(){
        return productoRepository.findAll();
    }

    //@Override
    public Producto guardar(Producto producto){
        return productoRepository.save(producto);
    }

    //@Override
    public Producto buscarPorId(Long id){
        return productoRepository.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    //@Override
    public void eliminar(Long id){
        productoRepository.deleteById(id);
    }
}
