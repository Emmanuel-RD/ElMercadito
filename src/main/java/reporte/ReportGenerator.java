package reporte;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

import java.util.HashMap;
import java.util.Map;

public class ReportGenerator {
    public static void main(String[] args) {
        try {
            // Ruta al archivo JRXML dentro de tu proyecto
            String reportPath = "C:\\Users\\emmar\\OneDrive - Universidad Tecnologica del Peru\\JAVA\\ElMercadito\\src\\main\\java\\reporte\\convenio.jrxml";

            // Compilar el archivo JRXML a .jasper
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);

            // Crear un mapa de parámetros vacío o con valores que quieras pasar al reporte
            Map<String, Object> parameters = new HashMap<>();

            // Ejemplo de pasar un parámetro al reporte, si lo necesitas
            parameters.put("nombre_parametro", "Valor del Parámetro");

            // Llenar el reporte con un DataSource vacío (sin datos)
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

            // Mostrar el reporte en una ventana (opcional)
            JasperViewer.viewReport(jasperPrint, false);

            // Exportar el reporte a un archivo PDF (opcional)
            JasperExportManager.exportReportToPdfFile(jasperPrint, "reporte_convenio.pdf");

            System.out.println("¡Reporte generado exitosamente!");

        } catch (JRException e) {
            e.printStackTrace();
        }
    }
}
