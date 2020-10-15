package operaciones;

public class Aritmetica {
    // Atributos de clase

    public int a; // valor por default = 0
    public int b;

    //creo constructor porAr defecto
    public Aritmetica() {
        //reserva espacio de memoria
        System.out.println("reservo memoria");
    }


    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("a = " + this.a + " b = " + this.b);
    }


    @Override
    public String toString() {
        return "Aritmetica{" + "a=" + a + ", b=" + b + '}';
    }

    //Metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {   // int resultado = a + b; return resultado;
        return a + b;
    }

    public int SumarConArgumentos(int arg1, int arg2) { //argumentos
        a = arg1;
        b = arg2;
        //return a + b;
        return sumarConRetorno();
    }


}
