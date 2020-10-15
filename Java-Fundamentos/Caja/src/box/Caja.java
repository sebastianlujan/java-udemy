package box;

import static java.lang.System.out;

class Caja {
    int ancho, alto, profundo;

    public Caja() {
        String name = getClass().getName();
        print(name);
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    // because of python..
    static void print(Object o) {
        out.println(o.toString());
    }

    int calcularVolumen() {
        return alto * ancho * profundo;
    }
}
