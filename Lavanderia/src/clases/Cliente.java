package clases;

import java.io.Serializable;
import java.util.Scanner;

public class Cliente implements Serializable {

    //instancia del mediador
    Lavanderia lavanderia;

    //atributos propios
    String nombre; //nombre completo
    String usuario;
    String contrasena;
    String direccion; //formato calle-numero-colonia
    String telefono;

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
