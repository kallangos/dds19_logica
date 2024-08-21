/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_vetor_vanderson;
import java.util.Scanner;


/**
 *
 * @author v.silva
 */
public class PROJETO_VETOR_VANDERSON {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n = 5;  // Define tamanho do vertot
        int v[] = new int [n];  // Descrição do vertor "V"
        int i; // Indice de posição
        
        for (i=0 ; i<n; i++){
            System.out.printf("Informe %do. elemento de %d: ", (i+1), n);
            v[i] = ler.nextInt(); 
        }
        //  %10f  reserva 10 espaços na tela para exibir o valor da variavel.
        //  %10.2f  reserva 10 espaços na tela para exibir o valor da variavel e limita em duas casa decimais
        
        System.out.printf("\n");
        for (i=0; i<n; i++){
            System.out.printf("v[%d] = %d\n", i, v[i]);
        }
        
    }
}
