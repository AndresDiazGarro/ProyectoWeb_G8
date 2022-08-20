package com.proyecto_grupo8.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name="reserva")
public class Reserva implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="num_reserva")
    private Long num_reserva;
    @Column (name="nombre")
    String nombre;
    @Column (name="apellidos")
    String apellidos;
    @Column (name="cedula")
    Long cedula;
    @Column (name="telefono")
    String telefono;
    @Column (name="cant_personas")
    int cant_personas;
    @Column (name="dia_reserva")
    Date dia_reserva;
    @Column (name="hora_reserva")
    String hora_reserva;

    public Reserva() {
    }

    public Reserva(String nombre, String apellidos, Long cedula, String telefono, int cant_personas, Date dia_reserva, String hora_reserva) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.telefono = telefono;
        this.cant_personas = cant_personas;
        this.dia_reserva = dia_reserva;
        this.hora_reserva = hora_reserva;
    }


  
    
    
    
}
