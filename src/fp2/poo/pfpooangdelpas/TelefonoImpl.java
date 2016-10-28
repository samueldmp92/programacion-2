package fp2.poo.pfpooangdelpas;

import fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;

public class TelefonoImpl {
    private String telefonoStr;

    public String getTelefono() {
        return this.telefonoStr;
    }

    public void setTelefono(String numeroDetelefono)
            throws TelefonoIncorrectoExcepcion {
        this.telefonoStr = numeroDetelefono;
    }
}
