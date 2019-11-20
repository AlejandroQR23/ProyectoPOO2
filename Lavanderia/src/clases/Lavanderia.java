package clases;

import java.io.*; //para archivos
import java.util.*;

/**
* La interfaz mediadora
*/
interface ILavanderia {
    //Nota
    public void generarNota( Date recepcion, Date entrega, String numero ) throws IOException;
    
    //Cliente
    public void mostrarNotas();
    public void entregarRopa( String nota );
    public void registrarCliente( Cliente cliente );
    public void agregarPrenda( String nombre, String color, float precio );
}

/**
* La clase mediadora concreta
*/
public class Lavanderia implements ILavanderia, Serializable{

    //Instrancias de colaboradores
    Cliente cliente;
    Nota nota;
    private LinkedList<Prenda> prendas;

    //Atributos propios de la sucursal
    private String sucursal;
    private String direccion;
    private float ganancias;

    //Carpeta de archivos
    File carpeta = new File( "Notas/");

    public Lavanderia( String sucursal, String direccion ){
        this.carpeta.mkdir();
        setSucursal( sucursal );
        setDireccion( direccion );
        ganancias = 0;
        
        this.prendas = new LinkedList<>();
    }

    //Getters y Setters
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

    public void setPrendas(LinkedList<Prenda> prendas) {
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
    
    
    /**
     * Cuando un cliente inicia sesión
     * se registra su instancia en la 
     * clase mediadora (la lavandería)
     * @param cliente 
     */
    @Override
    public void registrarCliente( Cliente cliente ){
        this.cliente = cliente;
    }

    /**
     * Imprime los datos del cliente, las fechas de
     * entrega y recepción, así como las prendas
     * entregadas en el servicio y el costo total
     * en un archivo de texto con el nombre del numero
     * de nota
     * @param recepcion
     * @param entrega
     * @param numero
     * @throws IOException 
     */
    @Override
    public void generarNota( Date recepcion, Date entrega, String numero ) throws IOException{

        //creamos las instancias del archivo de notas
        File f = new File( this.carpeta, numero + ".txt" );
        PrintWriter pw = new PrintWriter( new FileWriter( f, true ) );

        //escribrimos los datos en la nota
        pw.println( " - CLIENTE: - ");
        pw.println( " Nombre: " + this.cliente.getNombre() + " Telefono: " + this.cliente.getTelefono() );
        pw.println( " Direccion de facturacion: " + this.cliente.getDireccion() );
        
        pw.println("\n - PRENDAS - ");
        for( Prenda p : prendas ){
            pw.println(" Prenda: " + p.getNombre() + " Color: " + p.getColor() + " ---> $" + p.getPrecio() );
        }
        pw.println(" TOTAL: " + this.cliente.getTotal() );
        
        pw.println( " - DATOS DE RECEPCION - " );
        pw.println( "Fecha de recepcion: " + recepcion );
        pw.println( "Fecha de entrega: " + entrega );
        pw.close();
    }
    
    /**
     * Este método muestra las notas pendientes
     * es decir, imprime los nombre de todos los archivos
     * de notas en la carpeta
     */
    @Override
    public void mostrarNotas(){
        File[] ficheros = carpeta.listFiles();
        for ( File fichero : ficheros ) {
            System.out.println( fichero.getName() );
        }
    }
    
    /**
     * Agrega una prenda seleccionada por el usuario
     * a la lista de prendas para mostrarse en la 
     * nota del servicio
     * @param nombre
     * @param color
     * @param precio 
     */
    @Override
    public void agregarPrenda( String nombre, String color, float precio ){
        prendas.add( new Prenda(nombre, precio, color) );
        this.ganancias += precio;
    }

    /**
     * Hace "entrega" de la ropa al cliente
     * para ello pide el numero de la nota y
     * elimina el archivo asociado a este nombre
     * @param nota 
     */
    @Override
    public void entregarRopa( String nota ){
        System.out.println( " - Su ropa ha sido entregeda - " );
        File f = new File( carpeta, nota+".txt" );
        f.delete();
    }

}
