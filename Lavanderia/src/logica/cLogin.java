
package logica;
import java.io.*;

/**
 *
 * @author X
 */
public class cLogin {
    private String usuario;
    private String contrasena;

    public cLogin(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    public boolean IniciarSesion(){
        return contrasena.equals("admin");
    }
    
}
