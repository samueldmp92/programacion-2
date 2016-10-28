package fp2.poo.pfpooXXX;

import fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;

public class CorreoElectronicoImpl {
    private String correoElectronicoStr;

    public void setCorreoElectronico(String correoElectronico)
            throws CorreoElectronicoIncorrectoExcepcion {
        this.correoElectronicoStr = correoElectronico;
    }

    public String getCorreoElectronico() {
        return this.correoElectronicoStr;
    }
}