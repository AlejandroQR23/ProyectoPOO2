/*

 */
package Clases;

import java.util.*;

/**
 *
 * @author Equipo # 14
 */
public class Sucursal {
    private String direccion;
    private Hashtable<String, Float> prendas;
    private float ganancias;
    
    public Sucursal( String direccion, LinkedList precios ){
        setDireccion( direccion );
        setPrendas( precios );
        ganancias = 0;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Hashtable<String, Float> getPrendas() {
        return prendas;
    }

    public void setPrendas( LinkedList precios ) {
        this.prendas = new Hashtable<>();
        //                        Parseo a Object Float, sera así?
        this.prendas.put("Saco", (Float) precios.get(0) );
        this.prendas.put("Pantalon", (Float) precios.get(1) );
        this.prendas.put("Abrigo", (Float) precios.get(2) );
        this.prendas.put("Camisa", (Float) precios.get(3) );
        this.prendas.put("Playera", (Float) precios.get(4) );
        this.prendas.put("Corbata", (Float) precios.get(5) );
        this.prendas.put("Chamarra", (Float) precios.get(6) );
    }

    public float getGanancias() {
        return ganancias;
    }

    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }
    
    
}
