package com.proyecto_grupo8.dao;

import com.proyecto_grupo8.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
