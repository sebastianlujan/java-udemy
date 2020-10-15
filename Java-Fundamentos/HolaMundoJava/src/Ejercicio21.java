import java.util.Scanner;

public class Ejercicio21 {
    //conversion de tipos -> X to Sting
    //se lee, convertime a string el valor de X

    public static void main(String args[]) {

        var sc = new Scanner(System.in);

        var numb = 10;
        var edadTexto = String.valueOf(numb);
        System.out.println("edad Texto = " + edadTexto);

        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);

        System.out.println("Proporciona un caracter");
        caracter = sc.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);


    }
}
