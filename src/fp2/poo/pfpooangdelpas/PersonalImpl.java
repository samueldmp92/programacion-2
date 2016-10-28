package fp2.poo.pfpooangdelpas;


public class PersonalImpl {
    private String nombreStr;
    private String primerApellidoStr;
    private String segundoApellidoStr;

    public void setNombre(String nombre) {
        this.nombreStr = nombre;
    }

    public String getNombre() {
        return this.nombreStr;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellidoStr = primerApellido;
    }

    public String getPrimerApellido() {
        return this.primerApellidoStr;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellidoStr = segundoApellido;
    }

    public String getSegundoApellido() {
        return this.segundoApellidoStr;
    }

}
