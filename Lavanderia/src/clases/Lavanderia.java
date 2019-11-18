package clases;

import java.io.*; //para archivos
import java.util.*;

/**
* La interfaz mediadora
*/
interface ILavanderia {
    public void generarNota( Date recepcion, Date entrega, String numero ) throws IOException;
    public void registrarCliente( Cliente cliente );
    //void agregarPrendas();
}

/**
* La clase mediadora concreta
*/
public class Lavanderia implements ILavanderia, Serializable{

    //Instrancias de colaboradores
    Cliente cliente;
    //List< Prenda > prendas;
    Nota nota;

    //Atributos propios de la sucursal
    String sucursal;
    String direccion;
    private List<Prenda> prendas;
    float ganancias;

    //Carpeta de archivos
    File carpeta = new File( "/src/Notas" + "/" );

    public Lavanderia( String sucursal, String direccion, LinkedList precios ){
        this.carpeta.mkdir();
        setSucursal( sucursal );
        setDireccion( direccion );
        setPrendas( precios );
        ganancias = 0;
    }
    ///////////////

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(List<Prenda> prendas) {
        this.prendas = prendas;
    }

    public float getGanancias() {
        return ganancias;
    }

    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }

    public File getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(File carpeta) {
        this.carpeta = carpeta;
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
