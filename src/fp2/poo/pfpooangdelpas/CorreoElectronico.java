package fp2.poo.pfpooangdelpas;

import fp2.poo.utilidades.CorreoElectronicoInterfaz;
import fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;

public class CorreoElectronico implements CorreoElectronicoInterfaz {
    private String correoElectronicoStr;

    public void setCorreoElectronico(String correoElectronico)
            throws CorreoElectronicoIncorrectoExcepcion {
        this.correoElectronicoStr = correoElectronico;
    }

    public String getCorreoElectronico() {
        return this.correoElectronicoStr;
    }
}