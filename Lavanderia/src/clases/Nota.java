package clases;
import java.util.*; //para las fechas y calendarios
import java.io.*;

public class Nota{

    //Atributos propios
    Date fecha_recepcion;
    Date fecha_entrega;
    String num_nota = "123";

    //Instancia del mediador
    Lavanderia lavanderia;

    public Nota( Lavanderia lavanderia ){
        //generamos las fechas
        this.fecha_recepcion = new Date();
        this.fecha_entrega = calcularEntrega( this.fecha_recepcion );

        //asociamos el mediador
        this.lavanderia = lavanderia;
    }

    private Date calcularEntrega( Date fecha ){
        Calendar calendario = Calendar.getInstance();
        calendario.setTime( fecha );
        calendario.add( Calendar.DAY_OF_YEAR, 2 ); //a la fecha de recepcion le aummentamos dos dias

        return calendario.getTime();
    }

    public void crearNota() throws IOException {
        lavanderia.generarNota( fecha_recepcion, fecha_entrega, num_nota );
    }

}
