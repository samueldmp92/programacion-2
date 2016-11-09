package fp2.poo.principal;

import fp2.poo.pfpooangdelpas.Agenda;
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;

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


