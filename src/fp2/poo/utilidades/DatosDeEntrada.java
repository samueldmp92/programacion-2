/*
 *  @(#)DatosDeEntrada.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.utilidades;

import fp2.poo.pfpoofp2.Contacto; 
import fp2.poo.pfpoofp2.Domicilio; 
import fp2.poo.pfpoofp2.CorreoElectronico; 
import fp2.poo.pfpoofp2.Persona; 
import fp2.poo.pfpoofp2.Telefono;


import java.util.Iterator;
import java.util.NoSuchElementException;

import fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;
import fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion ;


import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DatosDeEntrada implements Iterator<ContactoInterfaz> {
 
    private BufferedReader in = null;
    private String   ruta     = "./datos/";//"./src/fp2/poo/datos/";
    private Contacto contacto = null;
    
    public DatosDeEntrada(String nombreDelFichero) throws OperacionNoPermitidaExcepcion {
        try{
            in = new BufferedReader (new InputStreamReader(
                                 new FileInputStream(ruta + nombreDelFichero)));
        } catch (FileNotFoundException e) {
            throw new OperacionNoPermitidaExcepcion("Error en apertura de fichero");
        }
    }    

    public ContactoInterfaz next( ) throws NoSuchElementException {
        if ( contacto == null )
            throw new NoSuchElementException();
        ContactoInterfaz local  = contacto;
        contacto = null;
        return local;
    }

    public boolean hasNext() {
        String            linea           = null;
        Domicilio         domicilio       = null;
        CorreoElectronico eMail           = null;
        Persona           persona         = null;
        Telefono          telefono        = null;
        boolean           lecturaInvalida = false;
        boolean           finLectura      = false;
        
        contacto = null;
        while((finLectura  == false) && (contacto == null)) {
            lecturaInvalida = false;

            try{
                try {
                     linea = in.readLine().trim();             
                     telefono       = new Telefono (linea);
                } catch ( TelefonoIncorrectoExcepcion e ) {
                    //System.out.println(e);
                    lecturaInvalida = true;
                }

                linea = (in.readLine()).trim();                
                domicilio                  = new Domicilio( linea ); 
                
                linea = in.readLine().trim();                  
                String nombre = linea;                         
                
                linea = in.readLine().trim();                  
                String primerApellido = linea;                    
                                           
                linea = in.readLine().trim();                  
                String segundoApellido = linea;                    

                persona = new Persona (nombre,primerApellido,segundoApellido);           

                try {
                     linea = in. readLine().trim();            
                     eMail       = new CorreoElectronico (linea);
                } catch ( CorreoElectronicoIncorrectoExcepcion e ) {
                    //System.out.println(e);
                    lecturaInvalida = true;
                }

                if(lecturaInvalida == false) {    
                    contacto      =  new Contacto (telefono, persona, domicilio, eMail);     
                } else {
                   this.contacto      = null;
                }
                linea = in. readLine().trim();    
                
           } catch ( IOException e ) {
                finLectura  = true;
                contacto = null;
           } catch (Exception e) {
                finLectura  = true;
                contacto = null;
           }
       }
       return ( (contacto == null) ? false : true );
    }
    public void remove() {
        //No se usa
    }
}


