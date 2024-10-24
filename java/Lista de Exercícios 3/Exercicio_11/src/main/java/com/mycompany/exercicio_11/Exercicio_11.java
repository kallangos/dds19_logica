/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_11;

import java.util.Scanner;

/**
 *
 * @author v.silva
 * 11_Manipulação de Vetores
 * A TechSolve quer implementar um sistema de estatísticas que identifica o maior e o menor valor em uma 
 * série de dados. Sua tarefa é trabalhar com vetores para realizar esse cálculo.
 */
public class Exercicio_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nValores = 0, maiorValor = 0, menorValor = 0;
        int [] serieDados ;
        
        System.out.print("Informe quantas notas este aluno teve ? :  " );
        nValores = sc.nextInt();
        serieDados = new int[nValores];
        
        for (int i = 0 ; i<=serieDados.length-1; i++){
            System.out.print("Informe o " + (i+1) + "º valor da lista :  " );
            serieDados[i] = sc.nextInt();
            if (serieDados[i]>maiorValor){
                maiorValor= serieDados[i];
            }    else if (serieDados[i]<menorValor){
                menorValor = serieDados[i];
            }
            if (i==0){
                menorValor = maiorValor;
            }

        }
        
        System.out.println("Listando valores inseridos " );
        for (int i = 0 ; i<=serieDados.length-1; i++){
            System.out.println( (i+1) + "º valor da lista :  " + serieDados[i] );
        }
        System.out.println("Maior valor inserido na lista foi : "  + maiorValor );
        System.out.println("Menor valor inserido na lista foi : "  + menorValor );
    }
}
