package com.proyecto_grupo8.service;

import com.proyecto_grupo8.dao.TarjetaDao;
import com.proyecto_grupo8.domain.Tarjeta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TarjetaServiceImpl implements TarjetaService{
    
    @Autowired
    private TarjetaDao tarjetaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Tarjeta> getTarjetas() {
        return (List<Tarjeta>)tarjetaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Tarjeta getTarjeta(Tarjeta tarjeta) {
        return tarjetaDao.findById(tarjeta.getNumTarjeta()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Tarjeta tarjeta) {
        tarjetaDao.save(tarjeta);
    }

    @Override
    @Transactional
    public void delete(Tarjeta tarjeta) {
        tarjetaDao.delete(tarjeta);
    }
    
}
