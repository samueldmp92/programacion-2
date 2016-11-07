package fp2.poo.pfpooangdelpas;

import fp2.poo.utilidades.DomicilioInterfaz;

/**
 * Created by Usuario on 28/10/2016.
 */
public class Domicilio implements DomicilioInterfaz {
    private String domicilioStr;

    public void setDomicilio(String domicilio) {
        this.domicilioStr = domicilio;
    }

    public String getDomicilio() {
        return this.domicilioStr;
    }
}