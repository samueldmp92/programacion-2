package fp2.poo.pfpooangdelpas;

import java.util.Comparator;
import java.util.Collections;


public class OrdenacionNombre implements Comparator<char> {
   // private String unostr;
    //private String dosstr;
    //private int aux;

    private int comparator(String uno, String dos) {
        uno.compareToIgnoreCase(dos);
    }

    public OrdenacionNombre(ArrayList agenda, int numeroContacto) {
        //for (i = 0; i <= numeroContacto; i++) {
            //this.unostr = agenda(i).getPersona().getPrimerApellido();
            //this.dosstr = agenda(i + 1).getPersona().getPrimerApellido();
            //aux=unostr.comparato(unostr, dosstr);
            collections.sort(agenda.getPersona().getPrimerApellido(), comparator);


        //}

    }
}