/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author sebas
 */
public class Ejercicio23 {
    public static void main(String arg[]) {
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        var resultado2 = 3f / b;
        System.out.println("resultado division = " + resultado2);

        resultado = a % b;
        System.out.println("resultado del modulo = " + resultado);

        if (b % 2 == 0)
            System.out.println("es numero par ");
        else
            System.out.println("Es numero impar");
    }
}
