/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logicadeprogramacaoemjava.SomaIdades;

import java.util.Scanner;

/**
 *
 * @author kenne
 */
public class SomaIdades {

    public static void main(String[] args) {
        /*Leia a idade de 20 pessoas e exiba a soma das idades. */
        Scanner teclado = new Scanner(System.in);
        
        int contador = 0;
        int idade = 0;
        int soma = 0;
        
        while (contador <20) {
            System.out.println("Digite a sua idade: ");
            idade = teclado.nextInt();
            soma += idade;
            contador++;
          
    } System.out.print("A soma das idades é: " + soma);
}
}

