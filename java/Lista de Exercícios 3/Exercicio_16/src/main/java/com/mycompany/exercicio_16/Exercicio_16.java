/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_16;

import java.util.Scanner;

/**
 *
 * @author v.silva
 * Ordenação de Vetores (Bubble Sort)
 * O sistema de ranking da TechSolve precisa ordenar as pontuações dos jogadores em ordem crescente. 
 * Você será responsável por implementar um algoritmo de ordenação (Bubble Sort).
 */
public class Exercicio_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] pontosJogos;
        int nJogos = 0;
        int copia = 0 ;
        
        
        System.out.print("Informe o numnero de jogos :  " );
        nJogos= sc.nextInt();
        pontosJogos = new int[nJogos];
        
          for (int i = 0 ; i<=pontosJogos.length-1; i++){
            System.out.print("Informe a pontuação do " + (i+1) + "º jogo :  " );
            pontosJogos[i] = sc.nextInt();
          }
        
          for (int j = 0 ; j<nJogos-1 ; j++){
              for (int i = 0 ; i<nJogos-1 ; i++){
                  if (pontosJogos[i]>pontosJogos[i+1]){
                              copia = pontosJogos[i];
                              pontosJogos[i]=pontosJogos[i+1];
                              pontosJogos[i+1]= copia;
                  }
              }
          }
          
        System.out.println("Exibindo Lista Ordenada" );
        for (int j = 0 ; j<nJogos ; j++){
            System.out.println("Item ["+ (j+1) + "] da lista : " + pontosJogos[j] );
        }
        
    }
}
