package fp2.poo.utilidades;

import fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;

public interface TelefonoInterfaz {

    public String getTelefono();

    public void setTelefono(String numeroDetelefono)
            throws TelefonoIncorrectoExcepcion;
}
