package com.duoc.RopaStore.model;


import lombok.AllArgsConstructor;
import lombok.Data;


@Data //getters y setter desde lombok
@AllArgsConstructor //constructor con parametros para inyectar datos a repository
public class Producto {

    private Long id;

    private String nombre;
    private String marca;
    private Double precio;

    private String talla;
    private String color;
    private String categoria;
    private Integer stock;

    
}
