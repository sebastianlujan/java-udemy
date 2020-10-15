public class Ejercicio25 {
    public static void main(String args[]) {
        int a = 3, b = 2;
        int c = a + 5 - b;

        System.out.println("c = " + c);

        a += 1; // operador de composicion de suma
        System.out.println("a = " + a);

        a += 3; // a = a + 3
        System.out.println("a = " + a);

        a -= 2; // a = a - 2
        System.out.println("a = " + a);

        // operador de multiplicacion
        a *= 2;
        System.out.println("a = " + a);

        // operador de division
        a /= 3;

        // operador de modulo
        a %= 42;
        System.out.println("a = " + a);

    }
}
