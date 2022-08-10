package com.proyecto_grupo8.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="tarjeta")
public class Tarjeta implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="num_tarjeta")
    private Long numTarjeta;
    String titularTarjeta;
    String fechaExpiracion;
    int cvc;

    public Tarjeta() {
    }

    public Tarjeta(String titularTarjeta, String fechaExpiracion, int cvc) {
        this.titularTarjeta = titularTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.cvc = cvc;
    }
}
