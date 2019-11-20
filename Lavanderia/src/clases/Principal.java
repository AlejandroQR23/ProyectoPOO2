package clases;
// Importa login de principal
import java.io.*; // Archivos
import java.util.*; // Fechas
import vista.Login; // Login
import javax.swing.JOptionPane; // Menu emergente

public class Principal {
    
    public static String opcion;
    public static Lavanderia sucursal;
    
    public static void main(String[] args) {
        
        /*  Pedimos que seleccione una sucursal 
            por que de esto dependeran los formularios  */
        String[] sucursales = {"Ajusco", "Tlahuac", "Acoxpa"};
        opcion = (String) JOptionPane.showInputDialog(null, "Selecciona la surcusal más conveniente", 
                 "Sucursal", JOptionPane.DEFAULT_OPTION, null, sucursales, sucursales[0]);
        opcion = (opcion.equals("null"))?opcion:"Ajusco";
        
        String direccion = "Direccion";
        switch( opcion ){
            case "Ajusco":
                direccion = "#1 Carr. Picacho-Ajusco, Miguel Hidalgo 4ta Secc, 14250 Ciudad de México";
                break;
            case "Tlahuac":
                direccion = "#2, MZ 121, Miguel Hidalgo, Tláhuac, 13200 Ciudad de México";
                break;
            case "Acoxpa":
                direccion = "#3, Coapa, Coapa Super 4, Tlalpan, 14390 Ciudad de México";
                break;
        }
        
        /*       ASIGNANDO PRENDAS               */
        LinkedList<Prenda> prendas = new LinkedList<>();
        Prenda prenda1 = new Prenda("Saco", 50.0f, "Negro");Prenda prenda2 = new Prenda("Pantalon", 100.0f, "Negro");
        Prenda prenda3 = new Prenda("Abrigo", 50.0f, "Negro");Prenda prenda4 = new Prenda("Camisa", 100.0f, "Negro");
        Prenda prenda5 = new Prenda("Playera", 80.0f, "Negro");
        prendas.add(prenda1);prendas.add(prenda2);prendas.add(prenda3);prendas.add(prenda4);prendas.add(prenda5);
        /*      ASIGNANDO PRENDAS               */
        
        
        sucursal = new Lavanderia( opcion, direccion, prendas);
        Login.login();
        
    } // Fin de Main
    
} // Fin de Clase
