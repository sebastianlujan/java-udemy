package pasoporref;

import clases.Persona;
public class PasoPorRef {

    
    public static boolean flag;
    
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Juan";
        
        Persona per = null;
        
        System.out.println("nombre "+p.nombre);
        Persona q = cambiaValor(per, flag);
        System.out.println(p.nombre);
        
        System.out.println(flag);
    }
    private static Persona cambiaValor(Persona persona, boolean bandera){
        if(persona == null){
            System.out.println("valor de persona invalido : null");
            return null;
        }
       
        persona.nombre = "pedro";
        flag = !bandera;
        return persona;
    }
}





