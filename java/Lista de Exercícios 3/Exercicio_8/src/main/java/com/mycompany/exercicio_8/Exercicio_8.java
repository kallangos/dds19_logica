/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_8;

import java.util.Scanner;

/**
 *
 * @author v.silva
 * Média de Notas de Alunos
 * O sistema educacional em que você está trabalhando precisa calcular a média de um aluno e informar 
 * se ele foi aprovado ou reprovado.
 */
public class Exercicio_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nAval = 0;
        float media = 0, somaNotas = 0 ;
        int [] vetorNotas ;
        
        System.out.print("Informe quantas notas este aluno teve ? :  " );
        nAval = sc.nextInt();
        vetorNotas = new int[nAval];
        
        for (int i = 0 ; i<=vetorNotas.length-1; i++){
            System.out.print("Entre com a " + (i+1) + "º nota :  " );
            vetorNotas[i] = sc.nextInt();
            somaNotas+=vetorNotas[i];
        }
        
        media = somaNotas/vetorNotas.length;
        System.out.printf("Media do aluno é igual a : " + media);
    }
}
