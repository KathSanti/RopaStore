package com.duoc.RopaStore.service;

import com.duoc.RopaStore.model.Producto;
import com.duoc.RopaStore.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> obtenerCatalogoOrdenado() {

        return productoRepository.findAll()
                .stream()
                .filter(Producto::isDisponible)
                .sorted(Comparator.comparing(
                        Producto::getNombre
                ))
                .collect(Collectors.toList());
    }
}
