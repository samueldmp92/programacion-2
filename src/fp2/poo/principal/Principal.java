package fp2.poo.principal;

import fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion ;
import fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;



import fp2.poo.pfpoofp2.Agenda;
import fp2.poo.pfpoofp2.Contacto; 
import fp2.poo.pfpoofp2.Domicilio; 
import fp2.poo.pfpoofp2.CorreoElectronico; 
import fp2.poo.pfpoofp2.Persona; 
import fp2.poo.pfpoofp2.Telefono;


public class Principal {
    public static void main(String args[]){
        Agenda a = null;
        System.out.println("Comienza el programa.....");
        try {
            if( args.length != 1)
                throw new OperacionNoPermitidaExcepcion("Numero de argumentos incorrecto");  
            a = new Agenda (args[0]);
            
        } catch (OperacionNoPermitidaExcepcion  e) {
            System.err.println(e);
        }
    
        a.mostrarContactos();
        a.ordenarContactos();
        a.mostrarContactos();
    }
}


