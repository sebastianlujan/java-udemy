import java.util.Scanner;

public class Ejemplo21Test {
    public static void main(String args[]) {

        var sc = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        var nombre = sc.nextLine();

        System.out.println("Proporciona el id:");
        var id = Integer.parseInt(sc.nextLine());

        System.out.println("Proporciona el precio:");
        var precio = Double.parseDouble(sc.nextLine());

        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(sc.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio:  $" + precio + '0');

        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
