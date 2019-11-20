
package logica;

import clases.Cliente;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class cCliente {
    public static void GuardarLista( List<Cliente> lista ){
        ObjectOutputStream ArchObjeto;

        // Guardando lista
        try {
            ArchObjeto = new ObjectOutputStream(new FileOutputStream( "clientes.dat" ));
            ArchObjeto.writeObject( lista );
            ArchObjeto.close();

        } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se encontro archivo: \n"+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "E/S de datos: \n"+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }

    } // Fin GuardarLista

    public static List<Cliente> AbrirLista(){
        ObjectInputStream fileIn;
        List<Cliente> clientes = new LinkedList<>();
        // Cargando lista
        try{
            fileIn = new ObjectInputStream(new FileInputStream("clientes.dat"));
            clientes = (List<Cliente>) fileIn.readObject();
            fileIn.close();

        } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se encontro archivo: \n"+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "E/S de datos: \n"+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Clase no encontrada: \n"+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        return clientes;

    } // Fin AbrirLista
    
}
