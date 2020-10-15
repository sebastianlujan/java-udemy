package test;

import domain.Persona;

public class TestPersona {

    private static int contador;
    private int id = 9; 
    
    public static void main(String[] args) {

        Persona persona1 = new Persona("sebas");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("sebas");
        contador++;
        
        A miClaseA = new A();
        miClaseA.contextoDinamico();
        
    }
    
    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        TestPersona.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class A {
    public void contextoDinamico(){
        TestPersona p = new TestPersona();
        //cargo datos dinamicos
        p.setId(42);
        
        //cargo los daatos estaticos
        TestPersona.setContador(90);
        
        int contador = TestPersona.getContador();
        System.out.println(p.getId() + "contador = " + contador );
    }
}
