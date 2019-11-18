
package clases;

import java.io.Serializable;

public class Prenda implements Serializable {
    private String nombre;
    private float precio;
    private String color;
    
    public Prenda(String nombre, float precio, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
    }
    
}
