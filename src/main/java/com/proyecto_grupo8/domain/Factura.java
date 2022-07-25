package com.proyecto_grupo8.domain;

import java.io.Serializable;
import java.sql.Date;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "factura")
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numFactura; // llave primaria factura
    private Long cedula; // llave primaria cliente
    private Long idProducto; // llave primaria producto
    private Long numTarjeta; // llave primaria tarjeta
    String codDescuento;
    String metodoPago;
    int subtotal;
    int descuento;
    int total;
    String nombre;
    String apellidos;
    int telefono;
    String direccion;
    String titulo;
    String descripcion;
    double precio;
    String categoria;
    String titularTerjeta;
    Date fechaExpiracion;

    public Factura() {
    }

    public Factura(Long cedula, Long idProducto, Long numTarjeta, String codDescuento, String metodoPago, int subtotal, int descuento, int total, String nombre, String apellidos, int telefono, String direccion, String titulo, String descripcion, double precio, String categoria, String titularTerjeta, Date fechaExpiracion) {
        this.cedula = cedula;
        this.idProducto = idProducto;
        this.numTarjeta = numTarjeta;
        this.codDescuento = codDescuento;
        this.metodoPago = metodoPago;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.total = total;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.titularTerjeta = titularTerjeta;
        this.fechaExpiracion = fechaExpiracion;
    }
    
    
}
