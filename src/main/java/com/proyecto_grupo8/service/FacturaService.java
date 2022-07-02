package com.proyecto_grupo8.service;

import com.proyecto_grupo8.domain.Factura;
import java.util.List;

public interface FacturaService {
    
    public List<Factura> getFacturas();
    
    public Factura getFactura(Factura factura);
    
    public void save(Factura factura);
    
    public void delete(Factura factura);
    
}
