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
        
        // Pedimos que seleccione una sucursal
        String[] sucursales = {"Ajusco", "Tlahuac", "Acoxpa"};
        opcion = (String) JOptionPane.showInputDialog(null, "Selecciona la surcusal más conveniente", 
                 "Sucursal", JOptionPane.DEFAULT_OPTION, null, sucursales, sucursales[0]);
        opcion = (opcion.equals("null"))?opcion:"Ajusco";
        
        LinkedList precios = new LinkedList();
        
        switch( opcion ){
            case "Ajusco":
                precios.add(50);precios.add(50);precios.add(80);precios.add(50);
                precios.add(50);precios.add(40);precios.add(70);
                break;
            case "Tlahuac":
                precios.add(40);precios.add(40);precios.add(70);precios.add(40);
                precios.add(40);precios.add(35);precios.add(60);
                break;
            case "Acoxpa":
                precios.add(45);precios.add(45);precios.add(75);precios.add(45);
                precios.add(45);precios.add(40);precios.add(65);
                break;
        }
        sucursal = new Lavanderia( opcion, opcion + ", Ciudad de México", precios );
        Login.login();
        
    } // Fin de Main
    
} // Fin de Clase
