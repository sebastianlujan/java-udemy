import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona el alto: ");
        var alto = Integer.parseInt(sc.nextLine());

        System.out.println("Proporciona el alto: ");
        var ancho = Integer.parseInt(sc.nextLine());

        var area = alto * ancho;
        System.out.println("El area: " + area);

        var perimetro = (alto + ancho) * 2;
        System.out.println("El perimetro " + perimetro);
    }
}
