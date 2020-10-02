//Mi clase
public class HolaMundo {
    public static void main(String args[]){
        System.out.println("Hola Mundo desde Java");
        
        //definimos la variable = 10
        int miVariableEnteraz = 10;
        System.out.println(miVariableEnteraz);
        
        //modificamos el valor de la variable
        miVariableEnteraz = 11;
        System.out.println(miVariableEnteraz); //sout
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        // var Inferencia de tipos en java
        var miVariableEntera = 15;
        System.out.println(miVariableEntera);
        
        var miVariableCadena2 = "Mivariable cadena2";
        
        //soutv
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        //nombres de vars , $, _ ok, 1h, % incorrecto

        //se permite
        var miVariable = 1;
        var _miVariable = 2;
        var $Variable = 3;    
    }
}
