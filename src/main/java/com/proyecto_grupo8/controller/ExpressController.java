package com.proyecto_grupo8.controller;

import com.proyecto_grupo8.domain.Cliente;
import com.proyecto_grupo8.domain.Factura;
import com.proyecto_grupo8.domain.Producto;
import com.proyecto_grupo8.domain.Tarjeta;
import com.proyecto_grupo8.service.ClienteService;
import com.proyecto_grupo8.service.FacturaService;
import com.proyecto_grupo8.service.ProductoService;
import com.proyecto_grupo8.service.TarjetaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ExpressController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private FacturaService facturaService;

    @Autowired
    private ProductoService productoService;

    @Autowired
    private TarjetaService tarjetaService;

    /*@GetMapping("/express")
    public String abrirExpress() {
        return "express";
    }*/
    @GetMapping("/express")
    public String inicio(Model model) {
        return "/express/express";
    }

    @GetMapping("/orden/casado")
    public String nuevaOrden_Casado(Factura factura, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_casado";
    }
    
    @GetMapping("/orden/spaghetti")
    public String nuevaOrden_Spaghetti(Factura factura, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_spaghetti";
    }
    
    @GetMapping("/orden/pescado")
    public String nuevaOrden_Pescado(Factura factura, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_pescado";
    }
    
    @GetMapping("/orden/chicharrones")
    public String nuevaOrden_Chicharrones(Factura factura, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_chicharrones";
    }
    
    @GetMapping("/orden/frijoles")
    public String nuevaOrden_Frijoles(Factura factura, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_frijoles";
    }
    
    @GetMapping("/orden/nachos")
    public String nuevaOrden_Nachos(Factura factura, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_nachos";
    }
    
    @GetMapping("/orden/tres_leches")
    public String nuevaOrden_Tres_Leches(Factura factura, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_tres_leches";
    }
    
    @GetMapping("/orden/cono")
    public String nuevaOrden_Cono(Factura factura, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_cono";
    }
    
    @GetMapping("/orden/gelatina")
    public String nuevaOrden_Gelatina(Factura factura, Cliente cliente, Tarjeta tarjeta, Model model) {
        return "/express/orden_gelatina";
    }

    @GetMapping("/orden/mostrar")
    public String mostrarOrden(Factura factura, Model model) {
        factura = facturaService.getFactura(factura);
        model.addAttribute("factura", factura);
        return "/express/factura_orden";
    }

    @PostMapping("orden/guardar")
    public String guardarOrden(Factura factura) {
        facturaService.save(factura);
        return "/express/factura_orden";
    }

    @GetMapping("/express//modificar_orden/{numFactura}")
    public String modificarOrden(Factura factura, Cliente cliente, 
            Tarjeta tarjeta, Producto producto, Model model) {
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        producto = productoService.getProducto(producto);
        model.addAttribute("producto", producto);
        tarjeta = tarjetaService.getTarjeta(tarjeta);
        model.addAttribute("tarjeta", tarjeta);
        factura = facturaService.getFactura(factura);
        model.addAttribute("factura", factura);
        return "/express/orden";
    }

    @GetMapping("/express//eliminar_orden/{numFactura}")
    public String eliminarOrden(Factura factura, Cliente cliente, 
            Tarjeta tarjeta) {
        clienteService.delete(cliente);
        tarjetaService.delete(tarjeta);
        facturaService.delete(factura);
        return "redirect:/express/express";
    }

}
