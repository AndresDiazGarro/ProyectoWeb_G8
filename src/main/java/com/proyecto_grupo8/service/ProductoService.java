package com.proyecto_grupo8.service;

import com.proyecto_grupo8.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    public List<Producto> getProductos();
    
    public Producto getProducto(Producto producto);
    
    public void save(Producto producto);
    
    public void delete(Producto producto);
    
}
