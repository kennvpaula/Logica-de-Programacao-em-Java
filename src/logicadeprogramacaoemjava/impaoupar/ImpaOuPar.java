/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicadeprogramacaoemjava.impaoupar;

import java.util.Scanner;

/**
 *
 * @author kenne
 */
public class ImpaOuPar {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int n = teclado.nextInt();
        if (n%2 == 0) {
        System.out.println("Número par");
               } else {
                System.out.println("Número ímpar");

                }  
        
    }
}

