package operaciones;

/* cuenta la cantidad de objetos */
public class StaticCounter {

    static int b = 43;
    static int numb = 0; //variable estatica 0

    static {
        System.out.println("segundo");
    }

    public StaticCounter() {
        StaticCounter.numb++; // mi variable estatica para a 1 2
    }
    // al hacer este bloque estatico carga primero este bloque en 
    // el area de clase y luego el metodo main estatico

    public static void main(String[] args) {

        System.out.println("primero");

        StaticCounter count1 = new StaticCounter(); //nuevo obj 1 contexto estatico
        StaticCounter count2 = new StaticCounter(); //nuevo obj 2 contexto estatico
        StaticCounter count3 = new StaticCounter(); //nuevo obj 3 contexto estatico

        System.out.println(StaticCounter.numb);
        System.out.println(b);

    }
}