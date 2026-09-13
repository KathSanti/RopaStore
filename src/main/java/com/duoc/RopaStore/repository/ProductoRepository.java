package com.duoc.RopaStore.repository;

import com.duoc.RopaStore.model.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoRepository {

    private final List<Producto> productos = new ArrayList<>();

    public ProductoRepository() {
        productos.add(new Producto(
                1L, "Polera básica", 9990,
                "Poleras", true
        ));

        productos.add(new Producto(
                2L, "Jeans clásico", 24990,
                "Pantalones", true
        ));

        productos.add(new Producto(
                3L, "Chaqueta de mezclilla", 39990,
                "Chaquetas", true
        ));

        productos.add(new Producto(
                4L, "Polerón con capucha", 29990,
                "Polerones", false
        ));
    }

    public List<Producto> findAll() {
        return new ArrayList<>(productos);
    }
}
