package com.duoc.RopaStore.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.RopaStore.model.Producto;
import com.duoc.RopaStore.service.ProductoService;

import lombok.RequiredArgsConstructor;


@RestController 
@RequestMapping ("/api/productos")
@RequiredArgsConstructor//para inyectar service
public class ProductoController {

    private final ProductoService productoService;

    @GetMapping("/catalogo")
    // ResponseEntity envuelve la respuesta para incluir el código de estado HTTP y los datos
    public ResponseEntity<List<Producto>> mostrarCatalogo() {
        //Obtiene los datos de service que vienen ordenados 
        List<Producto> catalogoOrdenado = productoService.obtenerCatalogoOrdenadoPorPrecio();
        // Retorna un HTTP 200 (ok) y Spring Boot convierte automáticamente la lista a JSON para el cliente
        return ResponseEntity.ok(catalogoOrdenado);
    }


    
}
