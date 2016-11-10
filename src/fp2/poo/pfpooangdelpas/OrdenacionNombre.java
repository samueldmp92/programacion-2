package fp2.poo.pfpooangdelpas;

import fp2.poo.utilidades.ContactoInterfaz;
import fp2.poo.utilidades.PersonaInterfaz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


public class OrdenacionNombre implements Comparator<ContactoInterfaz> {

    public int compare(ContactoInterfaz p, ContactoInterfaz p1) {
        int aux= p.getPersona().getPrimerApellido().compareTo(p1.getPersona().getPrimerApellido());
        if (aux ==0){
            aux= p.getPersona().getSegundoApellido().compareTo(p1.getPersona().getSegundoApellido());
            if(aux==0){
                aux= p.getPersona().getNombre().compareTo(p1.getPersona().getNombre());

            }
        }
        return aux;
    }
}