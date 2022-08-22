package com.proyecto_grupo8.controller;

import com.proyecto_grupo8.service.OrdenReportService;
import com.proyecto_grupo8.service.OrdenService;
import com.proyecto_grupo8.service.ReservaReportService;
import com.proyecto_grupo8.service.ReservaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@Slf4j
public class ReportesController {

    @Autowired
    private ReservaService reservaService;
    
    @Autowired
    private OrdenService ordenService;

    @Autowired
    private ReservaReportService reservaReportService;
    
    @Autowired
    private OrdenReportService ordenReportService;

   
    @GetMapping("/reportes")
    public String abrirReservaciones(Model model) {
        var reserva = reservaService.getReservas();
        model.addAttribute("reserva", reserva);
        return "/reportes/reportes";
    }

    @GetMapping(value = "/reportes/ReporteReservas", produces = MediaType.APPLICATION_PDF_VALUE)
    public @ResponseBody
    byte[] getfile() throws IOException {
        try {
            FileInputStream fis = new FileInputStream(new File(reservaReportService.generateReport()));
            byte[] targetArray = new byte[fis.available()];
            fis.read(targetArray);
            return targetArray;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    
    @GetMapping(value = "/reportes/ReporteOrdenes", produces = MediaType.APPLICATION_PDF_VALUE)
    public @ResponseBody
    byte[] getFile() throws IOException {
        try {
            FileInputStream fis = new FileInputStream(new File(ordenReportService.generateReport()));
            byte[] targetArray = new byte[fis.available()];
            fis.read(targetArray);
            return targetArray;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
