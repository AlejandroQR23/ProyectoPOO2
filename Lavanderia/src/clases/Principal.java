package clases;
// Importa login de principal
import java.util.*; // Fechas
import vista.Login; // Login
import javax.swing.JOptionPane; // Menu emergente

public class Principal {
    
    public static String opcion;
    public static Lavanderia sucursal;
    public static Hashtable<String, String> precios;
    
    public static void main(String[] args) {
        
        /*  Pedimos que seleccione una sucursal 
            por que de esto dependeran los formularios  */
        String[] sucursales = {"Ajusco", "Tlahuac", "Acoxpa"};
        opcion = (String) JOptionPane.showInputDialog(null, "Selecciona la surcusal más conveniente", 
                 "Sucursal", JOptionPane.DEFAULT_OPTION, null, sucursales, sucursales[0]);
        opcion = (opcion.equals("null"))?"Ajusco":opcion;
        
        String direccion = "Direccion";
        precios = new Hashtable<>();
        switch( opcion ){
            case "Ajusco":
                direccion = "#1 Carr. Picacho-Ajusco, Miguel Hidalgo 4ta Secc, 14250 Ciudad de México";
                precios.put("Saco", "50");precios.put("Pantalon", "50");precios.put("Abrigo", "80");
                precios.put("Camisa", "50");precios.put("Playera", "50");precios.put("Corbata", "40");
                precios.put("Chamarra", "70");
                break;
            case "Tlahuac":
                direccion = "#2, MZ 121, Miguel Hidalgo, Tláhuac, 13200 Ciudad de México";
                precios.put("Saco", "40");precios.put("Pantalon", "40");precios.put("Abrigo", "70");
                precios.put("Camisa", "40");precios.put("Playera", "40");precios.put("Corbata", "35");
                precios.put("Chamarra", "60");
                break;
            case "Acoxpa":
                direccion = "#3, Coapa, Coapa Super 4, Tlalpan, 14390 Ciudad de México";
                precios.put("Saco", "45");precios.put("Pantalon", "45");precios.put("Abrigo", "75");
                precios.put("Camisa", "45");precios.put("Playera", "45");precios.put("Corbata", "40");
                precios.put("Chamarra", "65");
                break;
        }
        
        sucursal = new Lavanderia( opcion, direccion );
        Login.login();
        
    } // Fin de Main
    
} // Fin de Clase
