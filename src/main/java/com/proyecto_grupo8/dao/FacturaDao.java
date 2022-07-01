package com.proyecto_grupo8.dao;

import com.proyecto_grupo8.domain.Factura;
import org.springframework.data.repository.CrudRepository;

public interface FacturaDao extends CrudRepository<Factura, Long>{
    
    
}
