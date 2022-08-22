package com.proyecto_grupo8.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class RecetasController {
    
    @GetMapping("/recetas")
    public String abrirRecetas(){
        return "recetas/recetas";
    }
    
    @GetMapping("/receta_pizza")
    public String receta_pizza(){
        return "recetas/receta_pizza";
    }
    
    @GetMapping("/receta_spaghetti")
    public String receta_spaghetti(){
        return "recetas/receta_spaghetti";
    }
    
    @GetMapping("/receta_pescado")
    public String receta_pescado(){
        return "recetas/receta_pescado";
    }
    
    @GetMapping("/receta_hamburguesa")
    public String receta_hamburguesa(){
        return "recetas/receta_hamburguesa";
    }
    
    @GetMapping("/receta_patacones")
    public String receta_patacones(){
        return "recetas/receta_patacones";
    }
    
    @GetMapping("/receta_hot_dog")
    public String receta_hot_dog(){
        return "recetas/receta_hot_dog";
    }
    
}
