package fp2.poo.pfpooangdelpas;


import fp2.poo.utilidades.ContactoInterfaz;
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import fp2.poo.utilidades.TelefonoInterfaz;

public class AgendaImpl {
    public final static int MAX_NUM_CONTACTOS = 1000;
    private ArrayList<ContactoInterfaz> listaContactos = null;
    private int numeroContactosUsados = 0;
    private telefonoImpl=tmpTelefono;
    private boolean flag = 0;

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
                system.err.println("OperacionNoPermitidaExcepcion");
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
            throws OperacionNoPermitidaExcepcion {
        for (i = 0; i <= numeroContactosUsados; i++) {
            if (this.listaContactos(i).getTelefono().getTelefono().equals(telefono.getTelefonoAntiguo())) {
                this.flag = 1;
            }
            if (this.flag == 1) {
                this.tmpTelefono = telefonoNuevo.get;//terminar de definir bien el metodo
                telefonoAntiguo.set(tmpTelefono);
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
        for (i = 0; i <= numeroContactosUsados; i++) {
            System.out.println(this.listaContactos(i).getTelefono().getTelefono());
            System.out.println(this.listaContactos(i).getDomicilio().getDomicilio());
            System.out.println(this.listaContactos(i).getPersona().getNombre());
            System.out.println(this.listaContactos(i).getPersona().getPrimerApellido());
            System.out.println(this.listaContactos(i).getPersona().getSegundoApellido());
            System.out.println(this.listaContactos(i).getCorreoElectronico().getCorreoElectronico);
        }
    }
    public void ordenarContactos() {

    }

}
