package com.proyecto_grupo8.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class IndexController {
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizamos MVC");
        
        return "index";
    }
    
}
