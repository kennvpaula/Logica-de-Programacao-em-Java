/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programamulta;

import java.util.Scanner;

/**
 *
 * @author kenne
 */
public class ProgramaMulta {

    public static void main(String[] args) {
/*Leia a velocidade de um carro
e a velocidade máxima para a rua:
1. Informe 50 reais se estiver até 10km/h acima;
2. Informe 100 reais se estiver entre 11km/h e 30km/h
acima;
3. Informe 300 reais se estiver acima de 31km/h acima;*/  
    Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a velocidade do carro: ");
    int velocidade = teclado.nextInt();
    
    if (velocidade <= 10) {
        System.out.println("R$50");
    } else if (velocidade >= 11 && velocidade <= 30) {
        System.out.println("R$100");
    } else {
        System.out.println("R$300");
    }
    }
}
