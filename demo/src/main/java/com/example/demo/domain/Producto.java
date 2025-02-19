package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double precio;


    public Producto(){
    }

    public Producto(String nom, Double pre){
        this.nombre = nom;
        this.precio = pre;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public Double getPrecio(){
        return precio;
    }

    public void setPrecio(Double pre) {
        this.precio = pre;
    }
}
