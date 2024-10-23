/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_7;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author v.silva
 * Busca de Elemento em Vetor
 * Em um sistema de inventário, o sistema precisa verificar se um produto está em uma lista de códigos. 
 * Sua tarefa é criar essa busca em um vetor.
 */
public class Exercicio_7 {

    public static void main(String[] args) {
        Random gerador =new Random();
        Scanner sc = new Scanner(System.in);
        int buscar = 5;
        int vetor[] = new int[20];
        
        System.out.println("Gerando lista de codigos" );
        for (int i = 0 ; i<=vetor.length-1 ; i++){
            vetor[i] = gerador.nextInt(100)+1;
        }

        for (int i = 0 ; i<=vetor.length-1 ; i++){
            System.out.println("Listando valores na posicao [" + (i+1) + "] do vetor  : " + vetor[i] );
        }
        
        
        System.out.println("Qual o valor deseja procurar na lista ?" );
        System.out.print("Lista contem valors de 1 a 100 : " );
        buscar = sc.nextInt();
        
        for (int i = 0 ; i<=vetor.length-1 ; i++){
            if (vetor[i]==buscar){
                System.out.println("Numero encontrado na posicao : " + i );
            }
        }

    }
}
