package fp2.poo.pfpooangdelpas;


import fp2.poo.utilidades.ContactoInterfaz;
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import fp2.poo.utilidades.TelefonoInterfaz;

public class AgendaImpl {
    public final static int MAX_NUM_CONTACTOS = 1000;

    public void insertarContacto(ContactoInterfaz contacto) throws OperacionNoPermitidaExcepcion {
    }

    public void modificarTelefono(TelefonoInterfaz telefonoAntiguo,
                                  TelefonoInterfaz telefonoNuevo)
            throws OperacionNoPermitidaExcepcion {
        try {
            telefonoAntiguo = telefonoNuevo;
        } catch (Exception OperacionNoPermitidaExcepcion) {
        }
    }

    public void eliminarContacto(TelefonoInterfaz telefono)
            throws OperacionNoPermitidaExcepcion {
        try {
            telefono = null; //sera asi ?
        } catch (Exception OperacionNoPermitidaExcepcion) {
        }

    }

    public void mostrarContactos() {
        System.out.println("contactos"); //ponerlo bien mas adelante
    }

    public void ordenarContactos() {

    }

}
