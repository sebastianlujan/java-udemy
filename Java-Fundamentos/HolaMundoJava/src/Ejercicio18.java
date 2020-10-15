public class Ejercicio18 {
    public static void main(String args[]) {
        // char almacena solo in caracter desde la lista unicode
        // list 
        char miCaracter = 'A';
        System.out.println(miCaracter);

        char varChar = '\u0021'; // !
        System.out.println(varChar);

        char varCharDecimal = 33; // !
        System.out.println(varCharDecimal);

        //String almacena el emoji en código UTF ( en UTF-16 (hexa) )
        String emoji = "\uD83D\uDE0E"; // 😎
        System.out.println(emoji);

        var varCharSymbol = "!";
        System.out.println("varCharSymbol = " + varCharSymbol);

        int variableEnteraSimbolo = '!';
        System.out.println(variableEnteraSimbolo);

        int letra = 'a';
        System.out.println(letra); // 97

        int letra2 = 'A';
        System.out.println(letra2); // 6
    }
}
