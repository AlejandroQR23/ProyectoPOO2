package clases;

import java.io.Serializable;

public class Cliente implements Serializable {

    //instancia del mediador
    Lavanderia lavanderia;

    //atributos propios
    private String nombre; //nombre completo
    private String usuario;
    private String contrasena;
    private String direccion;
    private String telefono;
    
    private float total; //total a pagar

    public Cliente(String nombre, String usuario, String contrasena, String direccion, String telefono) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * Asocia un cliente cuya sesión ha
     * sido iniciada a la lavandería
     * @param lavanderia 
     */
    public void iniciarSesion( Lavanderia lavanderia ){
        this.lavanderia = lavanderia;
        lavanderia.registrarCliente( this );
    }
    
    /**
     * Para el usuario administrador:
     * muestra todas las notas no entregadas 
     * de la lavandería
     */
    public void verNotas(){
        lavanderia.mostrarNotas();
    }
    
    /**
     * Añade una prenda a la lista de prendas seleccionadas
     * en la lavandería para su posterior impresión en
     * la nota. El precio se le suma al total a pagar
     * @param nombre
     * @param color
     * @param precio 
     */
    public void seleccionarPrenda( String nombre, String color, float precio ){
        total += precio;
        lavanderia.agregarPrenda( nombre, color, precio );
    }
    
    /**
     * A partir del nombre de la nota introducido
     * por el usuario, se hace entrega de la ropa
     * al cliente que lo solicita
     * @param nota 
     */
    public void recibirRopa( String nota ){
        lavanderia.entregarRopa( nota );
    }

    //Getters y Setters
    public String getNombre(){
        return this.nombre;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public float getTotal(){
        return total;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    

}
