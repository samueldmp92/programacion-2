package fp2.poo.pfpooangdelpas;

import fp2.poo.pfpooangdelpas.Agenda;
import fp2.poo.pfpooangdelpas.Contacto;
import fp2.poo.pfpooangdelpas.Domicilio;
import fp2.poo.pfpooangdelpas.CorreoElectronico;
import fp2.poo.pfpooangdelpas.Persona;
import fp2.poo.pfpooangdelpas.Telefono;
import fp2.poo.utilidades.*;


/**
 * Created by Usuario on 28/10/2016.
 */
public class Contacto implements ContactoInterfaz {
    private TelefonoInterfaz telefono;
    private PersonaInterfaz persona;
    private DomicilioInterfaz domicilio;
    private CorreoElectronicoInterfaz correoElectronico;

    public TelefonoInterfaz getTelefono() {
        return this.telefono;
    }

    public void setTelefono(TelefonoInterfaz telefono) {
        this.telefono = telefono;
    }

    public PersonaInterfaz getPersona() {
        return this.persona;
    }

    public void setPersona(PersonaInterfaz persona) {
        this.persona = persona;
    }

    public DomicilioInterfaz getDomicilio() {
        return this.domicilio;
    }

    public void setDomicilio(DomicilioInterfaz domicilio) {
        this.domicilio = domicilio;
    }

    public CorreoElectronicoInterfaz getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(CorreoElectronicoInterfaz eMail) {
        this.correoElectronico = eMail;
    }
}
