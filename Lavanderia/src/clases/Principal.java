package clases;
// Importa login de principal
import java.io.*; // Archivos
import java.util.*; // Fechas
import vista.Login; // Login
import javax.swing.JOptionPane; // Menu emergente

public class Principal {
    public static void main(String[] args) {
        
        String[] sucursales = {"Ajusco", "Tlahuac", "Acoxpa"};
        // Pedimos que seleccione una sucursal
        String opcion = (String) JOptionPane.showInputDialog(null, "Selecciona la surcusal más conveniente", 
                        "Sucursal", JOptionPane.DEFAULT_OPTION, null, sucursales, sucursales[0]);
        Login.login();
        
    } // Fin de Main
    
} // Fin de Clase
