package com.proyecto_grupo8.controller;

import com.proyecto_grupo8.domain.Orden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.proyecto_grupo8.service.OrdenService;
import java.util.List;

@Controller
@Slf4j
public class ExpressController {

    @Autowired
    private OrdenService ordenService;

    @GetMapping("/express")
    public String inicio(Model model) {
        return "/express/express";
    }

    @GetMapping("/orden/casado")
    public String nuevaOrden_Casado(Orden orden) {
        return "/express/orden_casado";
    }

    @GetMapping("/orden/spaghetti")
    public String nuevaOrden_Spaghetti(Orden orden) {
        return "/express/orden_spaghetti";
    }

    @GetMapping("/orden/pescado")
    public String nuevaOrden_Pescado(Orden orden) {
        return "/express/orden_pescado";
    }

    @GetMapping("/orden/chicharrones")
    public String nuevaOrden_Chicharrones(Orden orden) {
        return "/express/orden_chicharrones";
    }

    @GetMapping("/orden/frijoles")
    public String nuevaOrden_Frijoles(Orden orden) {
        return "/express/orden_frijoles";
    }

    @GetMapping("/orden/nachos")
    public String nuevaOrden_Nachos(Orden orden) {
        return "/express/orden_nachos";
    }

    @GetMapping("/orden/tres_leches")
    public String nuevaOrden_Tres_Leches(Orden orden) {
        return "/express/orden_tres_leches";
    }

    @GetMapping("/orden/cono")
    public String nuevaOrden_Cono(Orden orden) {
        return "/express/orden_cono";
    }

    @GetMapping("/orden/gelatina")
    public String nuevaOrden_Gelatina(Orden orden) {
        return "/express/orden_gelatina";
    }

    @GetMapping("/orden/mostrar")
    public String mostrarOrden(Orden orden, Model model) {
        orden = ordenService.getOrden(orden);
        model.addAttribute("orden", orden);
        return "/express/factura";
    }

    @PostMapping("orden/guardar_orden_casado")
    public String guardarOrden_Casado(Orden orden, Model model) {
        ordenService.save(orden);
        var ordenes = ordenService.getOrdenes();
        model.addAttribute("ordenes", ordenes);
        List<Orden> listaOrdenes = ordenService.getOrdenes();
        double Subtotal = 3500;
        double Descuento = 0;
        String metodoPago = "";
        for (int i = 0; i <= listaOrdenes.size(); i++) {
            if (i == listaOrdenes.size() - 1) {
                if (ordenes.get(i).getCodDescuento().equals("A111")) {
                    Descuento = Subtotal * 0.05;
                } else if (ordenes.get(i).getCodDescuento().equals("B222")) {
                    Descuento = Subtotal * 0.10;
                } else if (ordenes.get(i).getCodDescuento().equals("C333")) {
                    Descuento = Subtotal * 0.15;
                }
                if (ordenes.get(i).getNumTarjeta() == 0) {
                    metodoPago = "Efectivo";
                } else if (ordenes.get(i).getNumTarjeta() != 0) {
                    metodoPago = "Tarjeta";
                }
            }
        }
        double Total = Subtotal - Descuento;
        model.addAttribute("Subtotal", Subtotal);
        model.addAttribute("Descuento", Descuento);
        model.addAttribute("Total", Total);
        model.addAttribute("metodoPago", metodoPago);
        return "/express/factura_casado";
    }

    @PostMapping("orden/guardar_orden_spaghetti")
    public String guardarOrden_Spaghetti(Orden orden, Model model) {
        ordenService.save(orden);
        var ordenes = ordenService.getOrdenes();
        model.addAttribute("ordenes", ordenes);
        List<Orden> listaOrdenes = ordenService.getOrdenes();
        double Subtotal = 2000;
        double Descuento = 0;
        String metodoPago = "";
        for (int i = 0; i <= listaOrdenes.size(); i++) {
            if (i == listaOrdenes.size() - 1) {
                if (ordenes.get(i).getCodDescuento().equals("A111")) {
                    Descuento = Subtotal * 0.05;
                } else if (ordenes.get(i).getCodDescuento().equals("B222")) {
                    Descuento = Subtotal * 0.10;
                } else if (ordenes.get(i).getCodDescuento().equals("C333")) {
                    Descuento = Subtotal * 0.15;
                }
                if (ordenes.get(i).getNumTarjeta() == 0) {
                    metodoPago = "Efectivo";
                } else if (ordenes.get(i).getNumTarjeta() != 0) {
                    metodoPago = "Tarjeta";
                }
            }
        }
        double Total = Subtotal - Descuento;
        model.addAttribute("Subtotal", Subtotal);
        model.addAttribute("Descuento", Descuento);
        model.addAttribute("Total", Total);
        model.addAttribute("metodoPago", metodoPago);
        return "/express/factura_spaghetti";
    }

    @PostMapping("orden/guardar_orden_pescado")
    public String guardarOrden_Pescado(Orden orden, Model model) {
        ordenService.save(orden);
        var ordenes = ordenService.getOrdenes();
        model.addAttribute("ordenes", ordenes);
        List<Orden> listaOrdenes = ordenService.getOrdenes();
        double Subtotal = 3000;
        double Descuento = 0;
        String metodoPago = "";
        for (int i = 0; i <= listaOrdenes.size(); i++) {
            if (i == listaOrdenes.size() - 1) {
                if (ordenes.get(i).getCodDescuento().equals("A111")) {
                    Descuento = Subtotal * 0.05;
                } else if (ordenes.get(i).getCodDescuento().equals("B222")) {
                    Descuento = Subtotal * 0.10;
                } else if (ordenes.get(i).getCodDescuento().equals("C333")) {
                    Descuento = Subtotal * 0.15;
                }
                if (ordenes.get(i).getNumTarjeta() == 0) {
                    metodoPago = "Efectivo";
                } else if (ordenes.get(i).getNumTarjeta() != 0) {
                    metodoPago = "Tarjeta";
                }
            }
        }
        double Total = Subtotal - Descuento;
        model.addAttribute("Subtotal", Subtotal);
        model.addAttribute("Descuento", Descuento);
        model.addAttribute("Total", Total);
        model.addAttribute("metodoPago", metodoPago);
        return "/express/factura_pescado";
    }

    @PostMapping("orden/guardar_orden_chicharrones")
    public String guardarOrden_Chicharrones(Orden orden, Model model) {
        ordenService.save(orden);
        var ordenes = ordenService.getOrdenes();
        model.addAttribute("ordenes", ordenes);
        List<Orden> listaOrdenes = ordenService.getOrdenes();
        double Subtotal = 1500;
        double Descuento = 0;
        String metodoPago = "";
        for (int i = 0; i <= listaOrdenes.size(); i++) {
            if (i == listaOrdenes.size() - 1) {
                if (ordenes.get(i).getCodDescuento().equals("A111")) {
                    Descuento = Subtotal * 0.05;
                } else if (ordenes.get(i).getCodDescuento().equals("B222")) {
                    Descuento = Subtotal * 0.10;
                } else if (ordenes.get(i).getCodDescuento().equals("C333")) {
                    Descuento = Subtotal * 0.15;
                }
                if (ordenes.get(i).getNumTarjeta() == 0) {
                    metodoPago = "Efectivo";
                } else if (ordenes.get(i).getNumTarjeta() != 0) {
                    metodoPago = "Tarjeta";
                }
            }
        }
        double Total = Subtotal - Descuento;
        model.addAttribute("Subtotal", Subtotal);
        model.addAttribute("Descuento", Descuento);
        model.addAttribute("Total", Total);
        model.addAttribute("metodoPago", metodoPago);
        return "/express/factura_chicharrones";
    }

    @PostMapping("orden/guardar_orden_frijoles")
    public String guardarOrden_Frijoles(Orden orden, Model model) {
        ordenService.save(orden);
        var ordenes = ordenService.getOrdenes();
        model.addAttribute("ordenes", ordenes);
        List<Orden> listaOrdenes = ordenService.getOrdenes();
        double Subtotal = 1300;
        double Descuento = 0;
        String metodoPago = "";
        for (int i = 0; i <= listaOrdenes.size(); i++) {
            if (i == listaOrdenes.size() - 1) {
                if (ordenes.get(i).getCodDescuento().equals("A111")) {
                    Descuento = Subtotal * 0.05;
                } else if (ordenes.get(i).getCodDescuento().equals("B222")) {
                    Descuento = Subtotal * 0.10;
                } else if (ordenes.get(i).getCodDescuento().equals("C333")) {
                    Descuento = Subtotal * 0.15;
                }
                if (ordenes.get(i).getNumTarjeta() == 0) {
                    metodoPago = "Efectivo";
                } else if (ordenes.get(i).getNumTarjeta() != 0) {
                    metodoPago = "Tarjeta";
                }
            }
        }
        double Total = Subtotal - Descuento;
        model.addAttribute("Subtotal", Subtotal);
        model.addAttribute("Descuento", Descuento);
        model.addAttribute("Total", Total);
        model.addAttribute("metodoPago", metodoPago);
        return "/express/factura_frijoles";
    }

    @PostMapping("orden/guardar_orden_nachos")
    public String guardarOrden_Orden(Orden orden, Model model) {
        ordenService.save(orden);
        var ordenes = ordenService.getOrdenes();
        model.addAttribute("ordenes", ordenes);
        List<Orden> listaOrdenes = ordenService.getOrdenes();
        double Subtotal = 1300;
        double Descuento = 0;
        String metodoPago = "";
        for (int i = 0; i <= listaOrdenes.size(); i++) {
            if (i == listaOrdenes.size() - 1) {
                if (ordenes.get(i).getCodDescuento().equals("A111")) {
                    Descuento = Subtotal * 0.05;
                } else if (ordenes.get(i).getCodDescuento().equals("B222")) {
                    Descuento = Subtotal * 0.10;
                } else if (ordenes.get(i).getCodDescuento().equals("C333")) {
                    Descuento = Subtotal * 0.15;
                }
                if (ordenes.get(i).getNumTarjeta() == 0) {
                    metodoPago = "Efectivo";
                } else if (ordenes.get(i).getNumTarjeta() != 0) {
                    metodoPago = "Tarjeta";
                }
            }
        }
        double Total = Subtotal - Descuento;
        model.addAttribute("Subtotal", Subtotal);
        model.addAttribute("Descuento", Descuento);
        model.addAttribute("Total", Total);
        model.addAttribute("metodoPago", metodoPago);
        return "/express/factura_nachos";
    }

    @PostMapping("orden/guardar_orden_tres_leches")
    public String guardarOrden_Tres_Leches(Orden orden, Model model) {
        ordenService.save(orden);
        var ordenes = ordenService.getOrdenes();
        model.addAttribute("ordenes", ordenes);
        List<Orden> listaOrdenes = ordenService.getOrdenes();
        double Subtotal = 1500;
        double Descuento = 0;
        String metodoPago = "";
        for (int i = 0; i <= listaOrdenes.size(); i++) {
            if (i == listaOrdenes.size() - 1) {
                if (ordenes.get(i).getCodDescuento().equals("A111")) {
                    Descuento = Subtotal * 0.05;
                } else if (ordenes.get(i).getCodDescuento().equals("B222")) {
                    Descuento = Subtotal * 0.10;
                } else if (ordenes.get(i).getCodDescuento().equals("C333")) {
                    Descuento = Subtotal * 0.15;
                }
                if (ordenes.get(i).getNumTarjeta() == 0) {
                    metodoPago = "Efectivo";
                } else if (ordenes.get(i).getNumTarjeta() != 0) {
                    metodoPago = "Tarjeta";
                }
            }
        }
        double Total = Subtotal - Descuento;
        model.addAttribute("Subtotal", Subtotal);
        model.addAttribute("Descuento", Descuento);
        model.addAttribute("Total", Total);
        model.addAttribute("metodoPago", metodoPago);
        return "/express/factura_tres_leches";
    }

    @PostMapping("orden/guardar_orden_cono")
    public String guardarOrden_Cono(Orden orden, Model model) {
        ordenService.save(orden);
        var ordenes = ordenService.getOrdenes();
        model.addAttribute("ordenes", ordenes);
        List<Orden> listaOrdenes = ordenService.getOrdenes();
        double Subtotal = 1000;
        double Descuento = 0;
        String metodoPago = "";
        for (int i = 0; i <= listaOrdenes.size(); i++) {
            if (i == listaOrdenes.size() - 1) {
                if (ordenes.get(i).getCodDescuento().equals("A111")) {
                    Descuento = Subtotal * 0.05;
                } else if (ordenes.get(i).getCodDescuento().equals("B222")) {
                    Descuento = Subtotal * 0.10;
                } else if (ordenes.get(i).getCodDescuento().equals("C333")) {
                    Descuento = Subtotal * 0.15;
                }
                if (ordenes.get(i).getNumTarjeta() == 0) {
                    metodoPago = "Efectivo";
                } else if (ordenes.get(i).getNumTarjeta() != 0) {
                    metodoPago = "Tarjeta";
                }
            }
        }
        double Total = Subtotal - Descuento;
        model.addAttribute("Subtotal", Subtotal);
        model.addAttribute("Descuento", Descuento);
        model.addAttribute("Total", Total);
        model.addAttribute("metodoPago", metodoPago);
        return "/express/factura_cono";
    }

    @PostMapping("orden/guardar_orden_gelatina")
    public String guardarOrden_Gelatina(Orden orden, Model model) {
        ordenService.save(orden);
        var ordenes = ordenService.getOrdenes();
        model.addAttribute("ordenes", ordenes);
        List<Orden> listaOrdenes = ordenService.getOrdenes();
        double Subtotal = 1000;
        double Descuento = 0;
        String metodoPago = "";
        for (int i = 0; i <= listaOrdenes.size(); i++) {
            if (i == listaOrdenes.size() - 1) {
                if (ordenes.get(i).getCodDescuento().equals("A111")) {
                    Descuento = Subtotal * 0.05;
                } else if (ordenes.get(i).getCodDescuento().equals("B222")) {
                    Descuento = Subtotal * 0.10;
                } else if (ordenes.get(i).getCodDescuento().equals("C333")) {
                    Descuento = Subtotal * 0.15;
                }
                if (ordenes.get(i).getNumTarjeta() == 0) {
                    metodoPago = "Efectivo";
                } else if (ordenes.get(i).getNumTarjeta() != 0) {
                    metodoPago = "Tarjeta";
                }
            }
        }
        double Total = Subtotal - Descuento;
        model.addAttribute("Subtotal", Subtotal);
        model.addAttribute("Descuento", Descuento);
        model.addAttribute("Total", Total);
        model.addAttribute("metodoPago", metodoPago);
        return "/express/factura_gelatina";
    }

    @GetMapping("/express/modificar_orden_casado/{numOrden}")
    public String modificarOrden_Casado(Orden orden, Model model) {
        orden = ordenService.getOrden(orden);
        model.addAttribute("orden", orden);
        return "/express/orden_casado";
    }
    
        @GetMapping("/express/modificar_orden_spaghetti/{numOrden}")
    public String modificarOrden_Spaghetti(Orden orden, Model model) {
        orden = ordenService.getOrden(orden);
        model.addAttribute("orden", orden);
        return "/express/orden_spaghetti";
    }
    
        @GetMapping("/express/modificar_orden_pescado/{numOrden}")
    public String modificarOrden_Pescado(Orden orden, Model model) {
        orden = ordenService.getOrden(orden);
        model.addAttribute("orden", orden);
        return "/express/orden_pescado";
    }
    
        @GetMapping("/express/modificar_orden_chicharrones/{numOrden}")
    public String modificarOrden_Chicharrones(Orden orden, Model model) {
        orden = ordenService.getOrden(orden);
        model.addAttribute("orden", orden);
        return "/express/orden_chicharrones";
    }
    
        @GetMapping("/express/modificar_orden_frijoles/{numOrden}")
    public String modificarOrden_Frijoles(Orden orden, Model model) {
        orden = ordenService.getOrden(orden);
        model.addAttribute("orden", orden);
        return "/express/orden_frijoles";
    }
    
        @GetMapping("/express/modificar_orden_nachos/{numOrden}")
    public String modificarOrden_Nachos(Orden orden, Model model) {
        orden = ordenService.getOrden(orden);
        model.addAttribute("orden", orden);
        return "/express/orden_nachos";
    }
    
        @GetMapping("/express/modificar_orden_tres_leches/{numOrden}")
    public String modificarOrden_Tres_Leches(Orden orden, Model model) {
        orden = ordenService.getOrden(orden);
        model.addAttribute("orden", orden);
        return "/express/orden_tres_leches";
    }
    
        @GetMapping("/express/modificar_orden_cono/{numOrden}")
    public String modificarOrden_Cono(Orden orden, Model model) {
        orden = ordenService.getOrden(orden);
        model.addAttribute("orden", orden);
        return "/express/orden_cono";
    }
    
        @GetMapping("/express/modificar_orden_gelatina/{numOrden}")
    public String modificarOrden_Gelatina(Orden orden, Model model) {
        orden = ordenService.getOrden(orden);
        model.addAttribute("orden", orden);
        return "/express/orden_gelatina";
    }

    @GetMapping("/express/eliminar_orden/{numOrden}")
    public String eliminarOrden(Orden orden) {
        ordenService.delete(orden);
        return "redirect:/express/express";
    }

}
