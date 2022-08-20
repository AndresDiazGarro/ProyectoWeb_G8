package com.proyecto_grupo8.controller;

import com.proyecto_grupo8.domain.Reserva;
import com.proyecto_grupo8.service.ReservaService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class ReservacionesController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping("/reservaciones")
    public String abrirReservaciones(Model model) {
        model.addAttribute("reserva", new Reserva());
        return "/reservaciones/reservaciones";
    }

    @GetMapping("/pruebita")
    public String pruebita(Reserva reserva, Model model) {
        var reservas = reservaService.getReservas();
        model.addAttribute("reservas", reservas);
        List<Reserva> listaReservas = reservaService.getReservas();
        return "/reservaciones/pruebita";
    }

    @PostMapping("/confirmacion")
    public String confirmacion(Reserva reserva, Model model) {
        reservaService.save(reserva);
        return "/reservaciones/confirmacion";
    }

    @PostMapping("/mesaRomantica")
    public String reserva_mesaRomantica(Reserva reserva, Model model) {
        reservaService.save(reserva);
        var reservas = reservaService.getReservas();
        model.addAttribute("reservas", reservas);
        List<Reserva> listaReservas = reservaService.getReservas();
        return "/reservaciones/mesaRomantica";
    }

    @PostMapping("/mesaSencilla")
    public String reserva_mesaSencilla(Reserva reserva, Model model) {
        reservaService.save(reserva);
        var reservas = reservaService.getReservas();
        model.addAttribute("reservas", reservas);
        List<Reserva> listaReservas = reservaService.getReservas();
        return "/reservaciones/mesaSencilla";
    }

    @PostMapping("/mesaEjecutiva")
    public String reserva_mesaEjecutiva(Reserva reserva, Model model) {
        reservaService.save(reserva);
        var reservas = reservaService.getReservas();
        model.addAttribute("reservas", reservas);
        List<Reserva> listaReservas = reservaService.getReservas();
        return "/reservaciones/mesaEjecutiva";
    }

    @PostMapping("/mesaVIP")
    public String reserva_mesaVIP(Reserva reserva, Model model) {
        reservaService.save(reserva);
        var reservas = reservaService.getReservas();
        model.addAttribute("reservas", reservas);
        List<Reserva> listaReservas = reservaService.getReservas();
        return "/reservaciones/mesaVIP";
    }
}
