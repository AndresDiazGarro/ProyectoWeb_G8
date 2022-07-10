package com.proyecto_grupo8.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Data
@Entity
@Table(name="reserva")
public class Reserva implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numReserva;
    String tipoMesa;
    int cantPersonas;
    Date diaReserva;
    Time horaReserva;

    public Reserva() {
    }

    public Reserva(String tipoMesa, int cantPersonas, Date diaReserva, Time horaReserva) {
        this.tipoMesa = tipoMesa;
        this.cantPersonas = cantPersonas;
        this.diaReserva = diaReserva;
        this.horaReserva = horaReserva;
    }
    
    
}
