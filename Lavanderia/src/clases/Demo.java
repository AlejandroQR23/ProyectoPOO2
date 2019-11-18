package clases;
import java.io.*; //para archivos
import java.util.*; //para fechas

public class Demo
{

    public void main2(){

        //Creamos el mediador
        Lavanderia lv = new Lavanderia( "Acoxpa" );

        //Asociamos el mediador a los colaboradores
        Nota nota = new Nota( lv );
        Cliente cliente = new Cliente( "Lola Mento", "Av. Portuano", "7471673185" );

        //inicio de sesion
        cliente.iniciarSesion( lv );

        //imprimir nota
        try{
            nota.crearNota();
        } catch( IOException e ){
            System.out.println("");
        }


    }

}
