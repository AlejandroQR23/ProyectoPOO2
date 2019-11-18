package clases;
// Importa login de principal
import java.io.*; // Archivos
import java.util.*; // Fechas
import vista.Login; // Login
import javax.swing.JOptionPane; // Menu emergente

public class Principal {
    
    static String opcion;
    
    public static void main(String[] args) {
        
        String[] sucursales = {"Ajusco", "Tlahuac", "Acoxpa"};
        // Pedimos que seleccione una sucursal
        opcion = (String) JOptionPane.showInputDialog(null, "Selecciona la surcusal más conveniente", 
                 "Sucursal", JOptionPane.DEFAULT_OPTION, null, sucursales, sucursales[0]);
        opcion = (opcion.equals("null"))?opcion:"Ajusco";
        
        // Precios preestablecidos AJUSCO
        LinkedList preciosAjusco = new LinkedList();
        preciosAjusco.add(50);preciosAjusco.add(50);preciosAjusco.add(80);preciosAjusco.add(50);
        preciosAjusco.add(50);preciosAjusco.add(40);preciosAjusco.add(70);
        // Precios preestablecidos TLAHUAC
        LinkedList preciosTlahuac = new LinkedList();
        preciosTlahuac.add(40);preciosTlahuac.add(40);preciosTlahuac.add(70);preciosTlahuac.add(40);
        preciosTlahuac.add(40);preciosTlahuac.add(35);preciosTlahuac.add(60);
        // Precios preestablecidos ACOXPA
        LinkedList preciosAcoxpa = new LinkedList();
        preciosAcoxpa.add(45);preciosAcoxpa.add(45);preciosAcoxpa.add(75);preciosAcoxpa.add(45);
        preciosAcoxpa.add(45);preciosAcoxpa.add(40);preciosAcoxpa.add(65);
        
        
        Lavanderia ajusco = new Lavanderia("Ajusco", "Ajusco, CDMX", preciosAjusco );
        Lavanderia tlahuac = new Lavanderia("Tlahuac", "Tlahuac, CDMX", preciosTlahuac );
        Lavanderia acoxpa = new Lavanderia("Acoxpa", "Acoxpa, CDMX", preciosAcoxpa );
        
        Login.login();
        
    } // Fin de Main
    
} // Fin de Clase
