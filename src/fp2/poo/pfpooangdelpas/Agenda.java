package fp2.poo.pfpooangdelpas;


import fp2.poo.utilidades.ContactoInterfaz;
import fp2.poo.utilidades.DatosDeEntrada;
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;
import fp2.poo.utilidades.TelefonoInterfaz;
import fp2.poo.utilidades.AgendaInterfaz;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Agenda implements AgendaInterfaz {
    public final static int MAX_NUM_CONTACTOS = 1000;
    private ArrayList<ContactoInterfaz> listaContactos = null;
    private int numeroContactosUsados = 0;
    private String tmpTelefono ;
    private boolean flag = false ;

    public Agenda(String archivo)
            throws NoSuchElementException, OperacionNoPermitidaExcepcion {
        this.listaContactos = new ArrayList<ContactoInterfaz>();
        DatosDeEntrada obj = null;
        obj = new DatosDeEntrada(archivo);
        while (obj.hasNext()) {
            try {
                ContactoInterfaz contacto = obj.next();
                this.insertarContacto(contacto);
            } catch (OperacionNoPermitidaExcepcion e) {
                System.err.println("OperacionNoPermitidaExcepcion");
            }
// Se ha producido un error en la lectura de un contacto
// y se captura para seguir leyendo los demás contactos.
        }
    }

    public void insertarContacto(ContactoInterfaz contacto) throws OperacionNoPermitidaExcepcion {
        if (this.listaContactos.add(contacto)) {
            this.numeroContactosUsados++;
        } else {
            throw OperacionNoPermitidaExcepcion;
        }
    }

}

    public void modificarTelefono(TelefonoInterfaz telefonoAntiguo,
                                  TelefonoInterfaz telefonoNuevo)
            throws OperacionNoPermitidaExcepcion, TelefonoIncorrectoExcepcion {
        for (int i = 0; i <= numeroContactosUsados; i++) {
            if (this.listaContactos.get(i).getTelefono().getTelefono().equals(telefonoAntiguo.getTelefono())) {
                this.flag = true;
            }
            if (this.flag) {
                this.tmpTelefono = telefonoNuevo.getTelefono();//terminar de definir bien el metodo
                telefonoAntiguo.setTelefono(tmpTelefono);
                telefonoAntiguo = telefonoNuevo;
            } else {
                throw OperacionNoPermitidaExcepcion;
            }
        }
    }

    public void eliminarContacto(TelefonoInterfaz telefono)
            throws OperacionNoPermitidaExcepcion {

        for (i = 0; i <= numeroContactosUsados; i++) {
            if (this.listaContactos(i).getTelefono().getTelefono().equals(telefono.getTelefono())) {
                listaContactos(i).remove(i);
            } else {
                throw OperacionNoPermitidaExcepcion;
            }
        }

    }


    public void mostrarContactos() {
        for (int i = 0; i <= numeroContactosUsados; i++) {
            System.out.println(this.listaContactos.get(i).getTelefono().getTelefono());
            System.out.println(this.listaContactos.get(i).getDomicilio().getDomicilio());
            System.out.println(this.listaContactos.get(i).getPersona().getNombre());
            System.out.println(this.listaContactos.get(i).getPersona().getPrimerApellido());
            System.out.println(this.listaContactos.get(i).getPersona().getSegundoApellido());
            System.out.println(this.listaContactos.get(i).getCorreoElectronico().getCorreoElectronico());
        }
    }
    public void ordenarContactos() {

    }

}
