package fp2.poo.pfpooangdelpas;

import fp2.poo.utilidades.PersonaInterfaz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


public class OrdenacionNombre implements Comparator<PersonaInterfaz> {
   // private String unostr;
    //private String dosstr;
    //private int aux;


     public static void ordena(ArrayList agenda) {
        Collections.sort(agenda, String.CASE_INSENSITIVE_ORDER);
    }


    public int compare(PersonaInterfaz p, PersonaInterfaz p1) {
        return p.getPrimerApellido().compareTo(p1.getPrimerApellido());
    }
}