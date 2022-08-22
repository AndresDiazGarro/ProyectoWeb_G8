package com.proyecto_grupo8.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MenuController {

    @GetMapping("/menu")
    public String abrirMenu(Model model) {
        model.addAttribute("menu");
        return "/menu/menu";
    }

}
