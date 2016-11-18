package fp2.poo.pfpooangdelpas;

import fp2.poo.utilidades.ContactoInterfaz;
import fp2.poo.utilidades.TelefonoInterfaz;
import fp2.poo.utilidades.CorreoElectronicoInterfaz;
import fp2.poo.utilidades.DomicilioInterfaz;
import fp2.poo.utilidades.PersonaInterfaz;

/**
 * Created by Usuario on 28/10/2016.
 */
public class Contacto implements ContactoInterfaz {
    private TelefonoInterfaz telefono;
    private PersonaInterfaz persona;
    private DomicilioInterfaz domicilio;
    private CorreoElectronicoInterfaz correoElectronico;

    public Contacto(TelefonoInterfaz telefono, PersonaInterfaz persona, DomicilioInterfaz domicilio,
                    CorreoElectronicoInterfaz eMail) {
        this.telefono = telefono;
        this.persona = persona;
        this.domicilio = domicilio;
        this.correoElectronico = eMail;
    }

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
