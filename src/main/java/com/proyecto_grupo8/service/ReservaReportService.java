
package com.proyecto_grupo8.service;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

@Service
public class ReservaReportService {
 private String reportPath;
 public String generateReport() {
 try {
 File file = ResourceUtils.getFile("classpath:ReporteReserva.jasper");
 reportPath = file.getParent();
 
 JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file);
 
 Map<String, Object> parameters = new HashMap<>();
 
 Class.forName("com.mysql.jdbc.Driver");
 Connection con = DriverManager.getConnection(
 "jdbc:mysql://localhost:3306/restaurante", "proyecto_web", "el_proyecto.");
 
 JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);
 
 JasperExportManager.exportReportToPdfFile(jasperPrint, reportPath + "\\ReporteReservas.pdf");
 return reportPath + "\\ReporteReservas.pdf";
 } catch (Exception e) {
 return e.getMessage();
 }
 }
}

