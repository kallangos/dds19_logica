/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_3;

import java.util.Scanner;

/**
 *
 * @author v.silva
  * Maior entre Dois Números
  * Em um sistema de pontuação, você precisa comparar a pontuação de dois jogadores e 
  * determinar quem venceu a partida.
 */
public class Exercicio_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numUm, numDois = 0;
        

        System.out.print("Entre com a pontuacao do primeiro jogador : ");
        numUm = sc.nextInt();
        
        System.out.print("Entre com a pontuacao do segundo jogador : ");
        numDois = sc.nextInt();
        
        if (numUm>numDois)       {
            System.out.println("O primeiro jogador venceu !!!" );
        } else if (numUm<numDois)       {
            System.out.println("O segundo jogador venceu !!!" );
        } else {
            System.out.println("Houve EMPATE !!!" );
        }
    
            System.out.println("Saindo...");    
        
        
    }
}
