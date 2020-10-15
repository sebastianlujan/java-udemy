package operaciones;

public class TestAritmetica {

    //le da el contexto 🤯  !!
    public static void main(String[] args) {
        Aritmetica arit = new Aritmetica();

        arit.a = 2;
        arit.b = 3;
        arit.sumar();

        int resultado = arit.sumarConRetorno();
        System.out.println("resultado desde la clase de prueba = " + resultado);

        var hash = Integer.toHexString(arit.hashCode());
        System.out.println("arit = " + arit + " -> " + hash);

        resultado = arit.SumarConArgumentos(5, 8); //parametros
        System.out.println("resultado usando argumentos" + resultado);


    }
}
