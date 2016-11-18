package fp2.poo.pfpooangdelpas;

import fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;
import fp2.poo.utilidades.TelefonoInterfaz;

public class Telefono implements TelefonoInterfaz {
    private String telefonoStr;

    public Telefono(String numeroDetelefono) throws TelefonoIncorrectoExcepcion {
        if (isNumeric(numeroDetelefono)) {
            if (numeroDetelefono.length() == 9) {
                this.telefonoStr = numeroDetelefono;
            }
        } else {
            throw new TelefonoIncorrectoExcepcion("Un numero de Telefono debe constar de 9 dígitos decimales.");
        }
    }

    public String getTelefono() {
        return this.telefonoStr;
    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public void setTelefono(String numeroDetelefono)
            throws TelefonoIncorrectoExcepcion {
        if (isNumeric(numeroDetelefono)) {
            if (numeroDetelefono.length() == 9) {
                this.telefonoStr = numeroDetelefono;
            }
        } else {
            throw new TelefonoIncorrectoExcepcion("Un numero Telefono debe constar de 9 dígitos decimales.");
        }


    }
}


