package fp2.poo.pfpooangdelpas;

import java.util.Comparator;

public class OrdenacionNombre implements Comparator<char> {
    private char uno;
    private char dos;
    private String unostr;
    private String dosstr;

    public OrdenacionNombre(ArrayList agenda, int numeroContacto) {
        for (i = 0; i <= numeroContacto; i++) {
            this.unostr = agenda(i).getPersona().getPrimerApellido();
            this.dosstr = agenda(i + 1).getPersona().getPrimerApellido();
            this.uno=this.unostr.charAt(0);
            this.dos=this.dosstr.charAt(0);

        }

    }
}