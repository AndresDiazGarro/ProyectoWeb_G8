package com.proyecto_grupo8.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="factura")
public class Factura implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numFactura;
    String codDescuento;
    String metodoPago;
    int subtotal;
    int descuento;
    int total;

    public Factura() {
    }

    public Factura(String codDescuento, String metodoPago, int subtotal, int descuento) {
        this.codDescuento = codDescuento;
        this.metodoPago = metodoPago;
        this.subtotal = subtotal;
        this.descuento = descuento;
    }
    
    
}
