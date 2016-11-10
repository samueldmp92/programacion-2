package fp2.poo.pfpooangdelpas;

import fp2.poo.utilidades.CorreoElectronicoInterfaz;
import fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;

public class CorreoElectronico implements CorreoElectronicoInterfaz {
    private String correoElectronicoStr;

    public CorreoElectronico(String correoElectronico) throws CorreoElectronicoIncorrectoExcepcion {
        boolean flag = false;
        for (int i = 0; i < correoElectronico.length(); i++) {
            if (correoElectronico.charAt(i) == '@') {
                flag = true;
            }
        }
        if (flag) {
            this.correoElectronicoStr = correoElectronico;
        } else {
            throw new CorreoElectronicoIncorrectoExcepcion();
        }
    }


    public void setCorreoElectronico(String correoElectronico)
            throws CorreoElectronicoIncorrectoExcepcion {
        boolean flag = false;
        for (int i = 0; i < correoElectronico.length(); i++) {
            if (correoElectronico.charAt(i) == '@') {
                flag = true;
            }
        }
        if (flag) {
            this.correoElectronicoStr = correoElectronico;
        } else {
            throw new CorreoElectronicoIncorrectoExcepcion();

        }
    }


    public String getCorreoElectronico() {
        return this.correoElectronicoStr;
    }
}