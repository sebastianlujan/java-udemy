public class Ejercicio19 {
    public static void main(String args[]) {
        // la bandera esta en true
        boolean varBoolean = false;
        System.out.println("varBoolean: " + varBoolean);


        // Nuevo , para if de una linea podes no usar llaves.

        if (varBoolean) {
            System.out.println("La bandera es" + varBoolean);
        } else {
            System.out.println("La bandera es" + varBoolean);
        }

        var edad = 10;
        //var esAdulto = edad >= 18;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
