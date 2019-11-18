package clases;
import java.io.*; //para archivos
import java.util.*;

/**
* La interfaz mediadora
*/
interface ILavanderia
{

    public void generarNota( Date recepcion, Date entrega, String numero ) throws IOException;
    public void registrarCliente( Cliente cliente );
    //void agregarPrendas();

}

/**
* La clase mediadora concreta
*/
public class Lavanderia implements ILavanderia
{

    //Instrancias de colaboradores
    Cliente cliente;
    //List< Prenda > prendas;
    Nota nota;

    //Atributos propios de la sucursal
    String sucursal;
    String direccion;
    int ganancias;

    //Carpeta de archivos
    File carpeta = new File( "Notas" + "/" );

    public Lavanderia( String sucursal ){
        this.sucursal = sucursal;
        this.direccion = "av. portuano";
        this.carpeta.mkdir();
    }

    @Override
    public void registrarCliente( Cliente cliente ){
        this.cliente = cliente;
    }

    @Override
    public void generarNota( Date recepcion, Date entrega, String numero ) throws IOException{

        //creamos las instancias del archivo de notas
        File f = new File( this.carpeta, numero + ".txt" );
        PrintWriter pw = new PrintWriter( new FileWriter( f, true ) );

        //escribrimos los datos en la nota
        pw.println( " - CLIENTE: - ");
        pw.println( " Nombre: " + this.cliente.getNombre() + " Telefono: " + this.cliente.getTelefono() );
        pw.println( " Direccion de facturacion: " + this.cliente.getDireccion() );
        pw.println( " - DATOS DE RECEPCION - " );
        pw.println( "Fecha de recepcion: " + recepcion );
        pw.println( "Fecha de entrega: " + entrega );
        pw.println( "Estado: "  );
        pw.close();
    }

}
