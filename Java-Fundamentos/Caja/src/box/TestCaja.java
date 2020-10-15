package box;

import static box.Caja.print;

public class TestCaja {    
    public static void main(String[] args) {

        Caja emptyBox = new Caja();
        emptyBox.ancho = 3;
        emptyBox.alto = 2;
        emptyBox.profundo = 6;

        print(emptyBox.calcularVolumen());

        Caja box = new Caja(3, 2, 6);
        print(box.calcularVolumen());
        
    }
}
