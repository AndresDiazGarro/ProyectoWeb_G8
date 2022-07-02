package com.proyecto_grupo8.service;

import com.proyecto_grupo8.domain.Tarjeta;
import java.util.List;

public interface TarjetaService {
    
    public List<Tarjeta> getTarjetas();
    
    public Tarjeta getTarjeta(Tarjeta tarjeta);
    
    public void save(Tarjeta tarjeta);
    
    public void delete(Tarjeta tarjeta);
    
}
