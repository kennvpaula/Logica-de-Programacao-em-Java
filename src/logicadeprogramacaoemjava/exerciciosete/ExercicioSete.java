/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logicadeprogramacaoemjava.exerciciosete;

import java.util.Scanner;

/**
 *
 * @author kenne
 */
public class ExercicioSete {

    public static void main(String[] args) {
        // Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar, imprimir o resultado desta operação.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int valor = teclado.nextInt();
        
        if (valor%2 == 0) {
            System.out.println(valor + 5 );    
        } else {
            System.out.println(valor + 8 );
        } 
    }
}
