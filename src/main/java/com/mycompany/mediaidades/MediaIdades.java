/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaidades;

import java.util.Scanner;

/**
 *
 * @author kenne
 */
public class MediaIdades {

    public static void main(String[] args) {
        /*Leia a idade de 20 pessoas e exiba a média das idades.*/
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int soma = 0;
        int idade = 0;
      
        
        while (contador < 20) {
            System.out.print("Digite a sua idade: ");
            idade = teclado.nextInt();
            
            soma += idade;
            contador ++;
            
            
        } System.out.println("A media das idades é " + (soma/20));
    }
}

