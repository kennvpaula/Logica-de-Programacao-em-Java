/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicadeprogramacaoemjava.Algoritmo06;

import java.util.Scanner;

/**
 *
 * @author kenne
 */
public class Algoritmo06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%
       Scanner teclado = new Scanner(System.in);
       System.out.print("Digite um numero: ");
       double valor = teclado.nextDouble(); 
       System.out.println(valor + (valor*5/100));
    }
    
}
