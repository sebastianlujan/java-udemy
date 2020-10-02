/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public class ejercicio12 {

    public static void main(String args[]) {
        /*
            tipos primitivos enteros: byte 8, short 16, int 32 , long 64
         */
                
        byte numero = (byte) 12;
        System.out.println("valor minimo: " + Byte.MIN_VALUE); // -128
        System.out.println("valor maximo: " + Byte.MAX_VALUE); // 127
        System.out.println("numero: " + numero);

        short numeroShort = (short) 32769;
        System.out.println("numero short = " + numeroShort);
        System.out.println("valor minimo: " + Short.MIN_VALUE); // -32768
        System.out.println("valor maximo: " + Short.MAX_VALUE); //  32768
        
        System.out.println("numeroShort = " + numeroShort);
        
        int numeroInt = (int) 2147483649L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo: " + Integer.MIN_VALUE); //  2.147.483.647
        System.out.println("valor minimo: " + Integer.MAX_VALUE); // -2147483648
        
        System.out.println();
    }
}
