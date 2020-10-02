import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sebas
 */

public class ejercicio11 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Proporciona el titulo:");
        var titulo = sc.nextLine();

        System.out.println("Proporciona el autor:");
        var autor = sc.nextLine();

        System.out.println(titulo + "fue escrito por " + autor);
        sc.close();
    }
}
