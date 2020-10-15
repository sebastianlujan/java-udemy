package operaciones;

import java.util.Arrays;

public class TestAritmetica3 {
    public static void main(String[] args) {
        var a = 10;
        var b = 2;
        miMetodo();

        Aritmetica arit = new Aritmetica();
        Aritmetica aritmetica = new Aritmetica(12, 2);
        System.out.println(aritmetica);
        System.out.println(arit);
    }

    public static void miMetodo() {
        // la variable a esta afuera de el
        System.out.println("Otro metodo");
    }
}
