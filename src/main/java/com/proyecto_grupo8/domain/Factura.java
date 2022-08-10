package com.proyecto_grupo8.domain;

import java.io.Serializable;
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
    String metodoPago;
    String codDescuento;
    int subtotal;
    int descuento;
    int total;
    
    @JoinColumn(name="cedula", referencedColumnName = "cedula")
    @ManyToOne
    private Cliente cliente;
    
    @JoinColumn(name="num_tarjeta", referencedColumnName = "num_tarjeta")
    @ManyToOne
    private Tarjeta tarjeta;
    
    @JoinColumn(name="id_producto", referencedColumnName = "id_producto")
    @ManyToOne
    private Producto producto;

    public Factura() {
    }

    public Factura(String metodoPago, String codDescuento, int subtotal, int descuento, int total) {
        this.metodoPago = metodoPago;
        this.codDescuento = codDescuento;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.total = total;
    }

    public Factura(String metodoPago, String codDescuento, int subtotal, int descuento, int total, Cliente cliente, Tarjeta tarjeta, Producto producto) {
        this.metodoPago = metodoPago;
        this.codDescuento = codDescuento;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.total = total;
        this.cliente = cliente;
        this.tarjeta = tarjeta;
        this.producto = producto;
    }
    
    
    
}
