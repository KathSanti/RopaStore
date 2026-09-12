package com.duoc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.duoc.model.Producto;

@Repository
public class ProductoRepository {

    // base de datos temporal en memoria
    private List<Producto> catalogo;

    public ProductoRepository() {
        catalogo = new ArrayList<>();
        // datos de prueba usando el AllArgsConstructor de Lombok
        catalogo.add(new Producto(1L, "Polera Básica", "Nike", 15990.0, "M", "Blanco", "Poleras", 50));
        catalogo.add(new Producto(2L, "Jeans Slim Fit", "Levi's", 45990.0, "42", "Azul", "Pantalones", 30));
        catalogo.add(new Producto(3L, "Chaqueta Cuero", "Zara", 89990.0, "L", "Negro", "Chaquetas", 15));
        catalogo.add(new Producto(4L, "Zapatillas Running", "Adidas", 65990.0, "40", "Gris", "Calzado", 20));
        catalogo.add(new Producto(5L, "Polerón con Capucha", "Puma", 29990.0, "S", "Rojo", "Polerones", 40));
    }

    // Metodo para obtener la lista completa
    public List<Producto> obtenerTodos() {
        return catalogo;
    }

}