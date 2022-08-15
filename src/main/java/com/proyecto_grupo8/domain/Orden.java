package com.proyecto_grupo8.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "orden")
public class Orden implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numOrden; // llave primaria factura
    String codDescuento;
    String nombre;
    String apellidos;
    String telefono;
    String direccion;
    int cedula;
    String titularTarjeta;
    String fechaExpiracion;
    int cvc;
    int numTarjeta;

    public Orden() {
    }

    public Orden(String codDescuento, String nombre, String apellidos, String telefono, String direccion, int cedula, String titularTarjeta, String fechaExpiracion, int cvc, int numTarjeta) {
        this.codDescuento = codDescuento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cedula = cedula;
        this.titularTarjeta = titularTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.cvc = cvc;
        this.numTarjeta = numTarjeta;
    }
    
    
}
