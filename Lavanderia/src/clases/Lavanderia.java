package clases;

import java.io.*; //para archivos
import java.util.*;
import javax.swing.JOptionPane;

/**
* La interfaz mediadora
*/
interface ILavanderia {
    //Nota
    public void generarNota( Date recepcion, Date entrega, String numero ) throws IOException;
    
    //Cliente
    public String[] mostrarNotas();
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
        this.ganancias = calcularGanancias();
        
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
     * @param cliente es un cliente
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
     * @param recepcion es una Date
     * @param entrega es un Date
     * @param numero es un String
     * @throws IOException es una excepcion de E/S en archivos
     */
    @Override
    public void generarNota( Date recepcion, Date entrega, String numero ) throws IOException{

        //creamos las instancias del archivo de notas
        File f = new File( this.carpeta, numero + ".txt" );
        PrintWriter pw = new PrintWriter( new FileWriter( f, true ) );
        
        //escribimos los datos de la lavandería
        pw.println("\t\t *** DRY CLEAN: SIX STARS *** ");
        pw.println(" Sucursal: " + this.direccion );
        
        //escribrimos los datos del cliente en la nota
        pw.println( "\n - CLIENTE: - ");
        pw.println( " Nombre: " + this.cliente.getNombre() + "\n Telefono: " + this.cliente.getTelefono() );
        pw.println( " Direccion de facturacion: " + this.cliente.getDireccion() );
        
        pw.println("\n - PRENDAS - ");
        for( Prenda p : prendas ){
            pw.println(" Prenda: " + p.getNombre() + " Color: " + p.getColor() + " ---> $" + p.getPrecio() );
        }
        pw.println(" TOTAL: " + this.cliente.getTotal() );
        
        pw.println( "\n - DATOS DE RECEPCION - " );
        pw.println( "Fecha de recepcion: " + recepcion );
        pw.println( "Fecha de entrega: " + entrega );
        pw.close();
    }
    
    /**
     * Lee los ficheros dentro de la carpeta de notas
     * añade el nombre de cada uno de estos a un arreglo
     * de cadenas que servirá para mostrarlo en la interfaz
     * @return un arreglo notas
     */
    @Override
    public String[] mostrarNotas(){
        File[] ficheros = carpeta.listFiles();
        String[] nombres = new String[ ficheros.length ];
        for ( int i = 0; i < ficheros.length; i++ ) {
            nombres[i] = ficheros[i].getName();
        }
        
        return nombres;
    }
    
    /**
     * Agrega una prenda seleccionada por el usuario
     * a la lista de prendas para mostrarse en la 
     * nota del servicio
     * @param nombre es un String
     * @param color es un String
     * @param precio es un float
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
     * luego suma las ganancias relativas de esta
     * entrega al archivo de ganancias totales
     * @param nota es un String
     */
    @Override
    public void entregarRopa( String nota ){
        File f = new File( carpeta, nota+".txt" );
        if( f.exists() == true ){
            sumarGanancias();
            JOptionPane.showMessageDialog(null, " - Su ropa ha sido entregada - ");
            f.delete();
        }
        else{
            JOptionPane.showMessageDialog(null, "Numero de nota incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Este método calcula las ganancias totales de la
     * lavandería a partir de un archivo de texto que contiene
     * solo el número en flotante correspondiente al dinero
     * ganado
     * @return Las ganancias en float
     */
    public float calcularGanancias(){
        String gan = null;
        try{
            BufferedReader br = new BufferedReader( new FileReader( "ganIn.txt" ) );
            gan = br.readLine();
        } catch( IOException e ) {
            JOptionPane.showMessageDialog(null, "E/S error Lavanderia", "Error", JOptionPane.ERROR_MESSAGE);
        }

        if( gan != null ){
            return Float.parseFloat( gan );
        } else {
            return 0.0f;
        }
    }

    /**
     * Al completar un servicio suma las ganancias relativas de 
     * éste a las ganancias totales al modificar el contenido del
     * archivo de texto de ganancias
     */
    public void sumarGanancias(){
        try{
            File f = new File( "ganIn.txt" );
            PrintWriter pw = new PrintWriter( new FileWriter( f, false ) );
            pw.print( this.ganancias );
            pw.close();
        } catch( IOException e ){
            JOptionPane.showMessageDialog(null, "E/S error Lavanderia", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
