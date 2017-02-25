/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lrohmannm.a07;
import java.util.Scanner;
/**
 *
 * @author lisdyrohmann
 */
public class SPPLRohmannMA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner Sc= new Scanner (System.in);
        String [] numtelef = new String[10];
        for (int i = 0; i < numtelef.length; i++){
            System.out.println("Favor de introducir un número de teléfono:" + i);
            numtelef[i] = Sc.nextLine();
        }
        System.out.println("Introduzca el número que desea consultar: ");
        numero= Sc.nextInt();
        if (numero < numtelef.length){
        System.out.println("El número es " + numtelef[numero]);
        } else System.out.println("Fuera de rango");
    }
}
