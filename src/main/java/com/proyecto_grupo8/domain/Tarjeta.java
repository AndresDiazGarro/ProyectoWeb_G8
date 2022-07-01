package com.proyecto_grupo8.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name="tarjeta")
public class Tarjeta implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numTarjeta;
    String titularTerjeta;
    Date fechaExpiracion;

    public Tarjeta() {
    }

    public Tarjeta(String titularTerjeta, Date fechaExpiracion) {
        this.titularTerjeta = titularTerjeta;
        this.fechaExpiracion = fechaExpiracion;
    }
    
    
}
