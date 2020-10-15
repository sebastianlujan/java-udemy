package test;

import dominio.Persona;

public class PersonaTest {

    public static final int AA= 90;
    public int contador;
    
    public static void main(String[] args) {
        Persona people = new Persona("juan", 5000, true);
        System.out.println(people.getNombre());
        people.setNombre("Juan carlos");
        System.out.println(people); //people.toString
        imprimir(people);
        
        System.out.println(new B().as());
        System.out.println(new B().foo);
        System.out.println(PersonaTest.AA);
        
    }
    
    public static void imprimir(Persona persona) {
        System.out.println("Persona = " + persona);
    }
    
    public int getContador(){
        imprimir( new Persona("seba",700000,true) );
        return this.contador;
    }
    
    
}

class B {

    int foo = 1;
    public int as() { 
        //PersonaTest.AA=1; final es inmutable
        return foo = PersonaTest.AA+1;
    }
    
}
