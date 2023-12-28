/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package logicadeprogramacaoemjava.idadevotacao;

import java.util.Scanner;

/**
 *
 * @author kenne
 */
public class IdadeVotacao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento: ");
        int nasc = teclado.nextInt();
        
        int idade = 2023 - nasc;
        if (idade < 16) {
            System.out.println("Não vota.");
        } else { 
            if ((idade >= 16 && idade < 18) || (idade > 70)) {
                System.out.println("Seu voto é opcional");
        } else {
                System.out.println("Seu voto é obrigatório");
        }
           
            
        }
        
        
        
        
        
        
        
        
        
    }
}
