package fp2.poo.pfpooangdelpas;


import fp2.poo.utilidades.PersonaInterfaz;

public class Persona implements PersonaInterfaz {
    private String nombreStr;
    private String primerApellidoStr;
    private String segundoApellidoStr;

    public Persona(String nombre,String primerApellido,String segundoApellido){
        this.nombreStr = nombre;
        this.primerApellidoStr = primerApellido;
        this.segundoApellidoStr = segundoApellido;
    }

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
