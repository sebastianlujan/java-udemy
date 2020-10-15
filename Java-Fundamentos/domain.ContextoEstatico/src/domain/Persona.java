/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

public class Persona {

    private int idPersona;
    private String nombre;

    private static int contadorPersona; //esta variable se asocia con la clase.

    public Persona(String nombre) {
        super();
        this.nombre = nombre;

        //Incrementamos el contador para cada objeto nuevo 
        Persona.contadorPersona++;

        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //declaro los get y set para mi variable estatica
    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int aContadorPersona) {
        contadorPersona = aContadorPersona;
    }
    
}
