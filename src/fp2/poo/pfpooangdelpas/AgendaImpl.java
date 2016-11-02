package fp2.poo.pfpooangdelpas;


import fp2.poo.utilidades.ContactoInterfaz;
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import fp2.poo.utilidades.TelefonoInterfaz;

public class AgendaImpl {
    public final static int MAX_NUM_CONTACTOS = 1000;
    private ArrayList<ContactoInterfaz> listaContactos = null;
    private int numeroContactosUsados = 0;
    private telefonoImpl=tmpTelefono;

    public Agenda(String archivo)
            throws NoSuchElementException, OperacionNoPermitidaExcepcion {
        this.listaContactos = new ArrayList<ContactoInterfaz>();
        DatosDeEntrada obj = null;
        obj = new DatosDeEntrada(archivo);
        while (obj.hasNext()) {
            try {
                ContactoInterfaz contacto = obj.next();
                this.insertarContacto(contacto);
                this.numeroContactosUsados = numeroContactosUsados + 1;
            } catch (OperacionNoPermitidaExcepcion e) {
// Se ha producido un error en la lectura de un contacto
// y se captura para seguir leyendo los demás contactos.
            }
        }

    public void insertarContacto(ContactoInterfaz contacto) throws OperacionNoPermitidaExcepcion {
        this.listaContactos.add(contacto);
    }

    public void modificarTelefono(TelefonoInterfaz telefonoAntiguo,
                                  TelefonoInterfaz telefonoNuevo)
            throws OperacionNoPermitidaExcepcion {
        try {
        this.tmpTelefono = telefonoNuevo.get;//terminar de definir bien el metodo
            telefonoAntiguo.set(tmpTelefono);
        telefonoAntiguo = telefonoNuevo;
    } catch(Exception OperacionNoPermitidaExcepcion){
    }

}

    public void eliminarContacto(TelefonoInterfaz telefono)
            throws OperacionNoPermitidaExcepcion {
        try {
            while (i <= numeroContactosUsados) {
                if (this.listaContactos(i).telefono == telefono) {
                    listaContactos(i) = null; //sera asi?
                }
            }
        } catch (Exception OperacionNoPermitidaExcepcion) {
        }

    }

    public void mostrarContactos() {
        System.out.println("contactos"); //ponerlo bien mas adelante
    }

    public void ordenarContactos() {

    }

}
