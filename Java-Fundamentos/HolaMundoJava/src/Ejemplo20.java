import java.util.Scanner;

public class Ejemplo20 {
    // Convertir un tipo string a un tipo int
    // conversion de tipos usando tipos primitivos.

    public static void main(String args[]) {
        var edad = Integer.parseInt("10");
        System.out.println("edad =  " + edad + 1); //101

        var valorPi = Double.parseDouble("3.14159");
        System.out.println(valorPi);

        //pedir un valor 
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);

    }
}
