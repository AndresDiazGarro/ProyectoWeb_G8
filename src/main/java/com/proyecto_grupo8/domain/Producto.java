package com.proyecto_grupo8.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    String nombre;
    String descripcion;
    double precio;
    String categoria;

    public Producto() {
    }

    public Producto(Long idProducto, String nombre, String descripcion, double precio, String categoria) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
    }

    
    
}
