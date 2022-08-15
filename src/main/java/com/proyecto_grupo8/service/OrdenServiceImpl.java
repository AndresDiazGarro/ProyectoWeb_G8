package com.proyecto_grupo8.service;

import com.proyecto_grupo8.dao.OrdenDao;
import com.proyecto_grupo8.domain.Orden;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrdenServiceImpl implements OrdenService{
    
    @Autowired
    private OrdenDao ordenDao;

    @Override
    @Transactional(readOnly = true)
    public List<Orden> getOrdenes() {
        return (List<Orden>)ordenDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Orden getOrden(Orden orden) {
        return ordenDao.findById(orden.getNumOrden()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Orden orden) {
        ordenDao.save(orden);
    }

    @Override
    @Transactional
    public void delete(Orden orden) {
        ordenDao.delete(orden);
    }
    
}
