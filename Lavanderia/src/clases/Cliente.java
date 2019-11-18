package clases;

public class Cliente{

    //instancia del mediador
    Lavanderia lavanderia;

    //atributos propios
    String nombre; //nombre completo
    String usuario;
    String contrasena;
    String direccion; //formato calle-numero-colonia
    String telefono;

    public Cliente( String nombre, String direccion, String telefono ){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void iniciarSesion( Lavanderia lavanderia ){
        this.lavanderia = lavanderia;
        lavanderia.registrarCliente( this );
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
