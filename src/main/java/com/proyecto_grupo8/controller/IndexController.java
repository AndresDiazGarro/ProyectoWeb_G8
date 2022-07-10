package com.proyecto_grupo8.controller;

import com.proyecto_grupo8.domain.Factura;
import com.proyecto_grupo8.domain.Producto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.proyecto_grupo8.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@Slf4j
public class IndexController {

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ejecutando el sistema de Restaurante Hoja de Palma");
        return "index";
    }
}
