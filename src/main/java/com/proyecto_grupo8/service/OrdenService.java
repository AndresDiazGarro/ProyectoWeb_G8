package com.proyecto_grupo8.service;

import com.proyecto_grupo8.domain.Orden;
import java.util.List;

public interface OrdenService {
    
    public List<Orden> getOrdenes();
    
    public Orden getOrden(Orden orden);
    
    public void save(Orden orden);
    
    public void delete(Orden orden);
    
}
