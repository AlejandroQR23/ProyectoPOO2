
package clases;

import java.io.Serializable;

public class Prenda {
    private String nombre;
    private float precio;
    private String color;
    
    //sólo el mediador podrá crear una instancia de Prenda
    Prenda(String nombre, float precio, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
