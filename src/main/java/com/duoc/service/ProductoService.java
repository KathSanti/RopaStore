package com.duoc.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.duoc.model.Producto;
import com.duoc.repository.ProductoRepository;

import lombok.RequiredArgsConstructor;


@Service
//Constructor con lombok para inyectar respository
@RequiredArgsConstructor 
public class ProductoService {

    private final ProductoRepository productoRepository;

    // Método que cumple con la rúbrica: Ordenar y presentar
    public List<Producto> obtenerCatalogoOrdenadoPorPrecio() {

       //traemos la lista estatica del repositorio 
        List<Producto> catalogoBruto = productoRepository.obtenerTodos();
          //esta lista la toma la stream y lo convierte en datos dinamicos
         // de menor a mayor precio usando 
        return catalogoBruto.stream()
                //comparator analiza los elementos y sorterd los ordena mediante la referencia de metodo

                .sorted(Comparator.comparing(Producto::getPrecio))
                .collect(Collectors.toList()); 
                //collet empaqueta los elementos procesados y ordenados y los retorna a la lista 
    }
    
}
