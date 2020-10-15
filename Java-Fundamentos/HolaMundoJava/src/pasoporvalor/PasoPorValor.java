package pasoporvalor;

public class PasoPorValor {
    
     public static int ref = 12;

    public static void main(String[] args) {
        var x = 10;
        
        System.out.println("x = " + x);
        
        pasoValor(x);
        System.out.println("el nuevo valor = " + x);
        
        pasoRef(ref);
        System.out.println("ref" + ref);
        
    }
    
    public static void pasoValor(int arg) {
        System.out.println("arg = " + arg);
        arg = 15;
    }
    
    // paso por referencia de tipo primitiva
    public static void pasoRef(int arg) {
        PasoPorValor.ref = arg;
        PasoPorValor.ref++;
    }
}
