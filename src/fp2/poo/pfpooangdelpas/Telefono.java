package fp2.poo.pfpooangdelpas;

import fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;
import fp2.poo.utilidades.TelefonoInterfaz;

public class Telefono implements TelefonoInterfaz {
    private String telefonoStr;

    public String getTelefono() {
        return this.telefonoStr;
    }

    public void setTelefono(String numeroDetelefono)
            throws TelefonoIncorrectoExcepcion {
        try {
            if (numeroDetelefono == null) {//terminar de definir el metodo bien
                throw TelefonoIncorrectoExcepcion;
            }
            this.telefonoStr = numeroDetelefono;
        } catch (Exception TelefonoIncorreptoExcepcion) {
        }
    }

}
