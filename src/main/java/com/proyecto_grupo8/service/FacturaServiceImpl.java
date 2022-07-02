package com.proyecto_grupo8.service;

import com.proyecto_grupo8.dao.FacturaDao;
import com.proyecto_grupo8.domain.Factura;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FacturaServiceImpl implements FacturaService{
    
    @Autowired
    private FacturaDao facturaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Factura> getFacturas() {
        return (List<Factura>)facturaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Factura getFactura(Factura factura) {
        return facturaDao.findById(factura.getNumFactura()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Factura factura) {
        facturaDao.save(factura);
    }

    @Override
    @Transactional
    public void delete(Factura factura) {
        facturaDao.delete(factura);
    }
    
}
