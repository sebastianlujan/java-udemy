// operadores unarios

public class Ejercicio26 {
    public static void main(String argsp[]) {
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;

        // operador unario de true
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);


        // unarios de incremento
        // 1. pre incremento  el signo antes de la variable.
        var e = 3;
        var f = ++e;
        System.out.println("e = " + e); //se modifico la variable e
        System.out.println("f = " + f);


        //2. Post incremento 
        var g = 5;
        var h = g++; //vale 5 y cuando se lee se incrementa
        System.out.println("h = " + h);
        System.out.println("g = " + g);

        var i = 2;
        var j = --i; // se modifica la variable, de la misma forma que 
        // primero se decrementa, y luego se evalua el valor de la variable
        // i -= 1;

        System.out.println("i = " + i);
        System.out.println("j = " + j);


        var k = 4;
        var l = k--; // evaluo 

        System.out.println("k = " + k); // e incremento
        System.out.println("l = " + l); //asigno lo evaluado


    }
}
