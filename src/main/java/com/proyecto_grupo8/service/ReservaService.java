package com.proyecto_grupo8.service;

import com.proyecto_grupo8.domain.Reserva;
import java.util.List;

public interface ReservaService {
    
    public List<Reserva> getReservas();
    
    public Reserva getReserva(Reserva reserva);
    
    public void save(Reserva reserva);
    
    public void delete(Reserva reserva);
    
}
