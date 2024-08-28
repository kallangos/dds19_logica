/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_media150_vanderson;

/**
 *
 * @author v.silva
 */
public static void armanzenaNome(){

}
public class PROJETO_MEDIA150_VANDERSON {

    public static void main(String[] args) {
        // comentario
        int soma = 0;
        int n = 150;
        int vetor[] = new int [n];
        
        for (int i=0 ; i<n ; i++){
            vetor[i] = (int)(Math.random()*10);
        }
        
        // Percorre vetor e soma todos os valores armazenando na variavel [soma]
        for (int i=0 ; i<n ; i++){
            soma += vetor[i];
        }
        
        for (int i=0 ; i<n ; i++){
            soma += vetor[i];
            System.out.println("Vetor [ " + i + " ] = " + vetor[i]);
            System.out.println("---------------------");
            System.out.println("Soma = " + soma);
            System.out.println("---------------------");
           
        }
        //  %10f  reserva 10 espaços na tela para exibir o valor FLOAT da variavel.
        //  %10.2f  reserva 10 espaços na tela para exibir o valor FLOAT  da variavel e limita em duas casa decimais
        System.out.println("Media = " + soma/150.0);
        System.out.printf("MediaZ = %10.2f", (soma/150.0));
        // %10.2f

        
    }
}
