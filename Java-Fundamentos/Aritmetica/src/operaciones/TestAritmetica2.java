package operaciones;

public class TestAritmetica2 {

    public static void main(String[] args) {

        //constructor por defecto
        Aritmetica arit1 = new Aritmetica();
        System.out.println("a = " + arit1.a + "b = " + arit1.b);

        Aritmetica arit2 = new Aritmetica(3, 31);
        System.out.println("a = " + arit2.a + "b = " + arit2.b);

        arit2.a = 43;
        arit2.b = 42;


        System.out.println("a = " + arit2.a + "b = " + arit2.b);
    }
}
