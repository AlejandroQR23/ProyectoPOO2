/*

 */
package logica;

import clases.Lavanderia;
import java.io.*;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class cCliente {
    	public static void GuardarLista( List<Lavanderia> lista ){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n GUARDAR LISTA | nombre del archivo : ");
        String nombre_archivo = sc.nextLine();
		ObjectOutputStream ArchObjeto;

        try {
            ArchObjeto = new ObjectOutputStream(new FileOutputStream(nombre_archivo));
            ArchObjeto.writeObject( lista );
			ArchObjeto.close();
        } catch(FileNotFoundException e){
			System.out.println("ERROR: No se encontro el archivo\n" + e.getMessage());
		} catch (IOException e){
            System.out.println("ERROR: E/S\n" + e.getMessage());
		}

	} // Fin GuardarLista

	public static List<Lavanderia> AbrirLista(){
		Scanner sc = new Scanner(System.in);
		ObjectInputStream fileIn;
        List<Lavanderia> alumnos2 = new LinkedList<Lavanderia>();

        System.out.print("\n CARGAR LISTA | nombre del archivo : ");
        try{
            fileIn = new ObjectInputStream(new FileInputStream(sc.nextLine()));
            alumnos2 = (List<Lavanderia>) fileIn.readObject();
            fileIn.close();

		} catch(FileNotFoundException e){
			System.out.println("ERROR: No se encontro el archivo\n" + e.getMessage());
		} catch (IOException e){
            System.out.println("ERROR: E/S\n" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: Clase no encontrada\n" + e.getMessage());
        }
		return alumnos2;
	} // Fin AbrirLista
}
