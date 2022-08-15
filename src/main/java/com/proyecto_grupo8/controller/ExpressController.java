package com.proyecto_grupo8.controller;

import com.proyecto_grupo8.domain.Cliente;
import com.proyecto_grupo8.domain.Orden;
import com.proyecto_grupo8.domain.Producto;
import com.proyecto_grupo8.domain.Tarjeta;
import com.proyecto_grupo8.service.ClienteService;
import com.proyecto_grupo8.service.ProductoService;
import com.proyecto_grupo8.service.TarjetaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.proyecto_grupo8.service.OrdenService;

@Controller
@Slf4j
public class ExpressController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private OrdenService ordenService;

    @Autowired
    private ProductoService productoService;

    @Autowired
    private TarjetaService tarjetaService;

    @GetMapping("/express")
    public String inicio(Model model) {
        return "/express/express";
    }

    @GetMapping("/orden/casado")
    public String nuevaOrden_Casado(Orden orden, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_casado";
    }
    
    @GetMapping("/orden/spaghetti")
    public String nuevaOrden_Spaghetti(Orden orden, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_spaghetti";
    }
    
    @GetMapping("/orden/pescado")
    public String nuevaOrden_Pescado(Orden orden, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_pescado";
    }
    
    @GetMapping("/orden/chicharrones")
    public String nuevaOrden_Chicharrones(Orden orden, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_chicharrones";
    }
    
    @GetMapping("/orden/frijoles")
    public String nuevaOrden_Frijoles(Orden orden, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_frijoles";
    }
    
    @GetMapping("/orden/nachos")
    public String nuevaOrden_Nachos(Orden orden, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_nachos";
    }
    
    @GetMapping("/orden/tres_leches")
    public String nuevaOrden_Tres_Leches(Orden orden, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_tres_leches";
    }
    
    @GetMapping("/orden/cono")
    public String nuevaOrden_Cono(Orden orden, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_cono";
    }
    
    @GetMapping("/orden/gelatina")
    public String nuevaOrden_Gelatina(Orden orden, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_gelatina";
    }

    @GetMapping("/orden/mostrar")
    public String mostrarOrden(Orden orden, Model model) {
        orden = ordenService.getOrden(orden);
        model.addAttribute("orden", orden);
        return "/express/factura";
    }

    @PostMapping("orden/guardar")
    public String guardarOrden(Orden orden) {
        ordenService.save(orden);
        return "/express/factura";
    }

    @GetMapping("/express//modificar_orden/{numOrden}")
    public String modificarOrden(Orden orden, Cliente cliente, 
            Tarjeta tarjeta, Producto producto, Model model) {
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        producto = productoService.getProducto(producto);
        model.addAttribute("producto", producto);
        tarjeta = tarjetaService.getTarjeta(tarjeta);
        model.addAttribute("tarjeta", tarjeta);
        orden = ordenService.getOrden(orden);
        model.addAttribute("orden", orden);
        return "/express/orden";
    }

    @GetMapping("/express//eliminar_orden/{numOrden}")
    public String eliminarOrden(Orden orden) {
        ordenService.delete(orden);
        return "redirect:/express/express";
    }

}
