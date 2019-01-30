/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota;

import java.util.*;
import java.text.*;

/**
 *
 * @author Usuario DAM 1
 */
public class Nota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota1;
        double media;
        double nota2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen.");
        nota1 = sc.nextDouble();
        System.out.println("¿Qué nota quieres sacar en el trimestre?");
        media = sc.nextDouble();

        nota2 = (media - 0.4 * nota1) / 0.6;

        System.out.println("Para tener un " + media + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");
    }

}
