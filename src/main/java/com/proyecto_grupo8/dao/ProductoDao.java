package com.proyecto_grupo8.dao;

import com.proyecto_grupo8.domain.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long>{
    
}
