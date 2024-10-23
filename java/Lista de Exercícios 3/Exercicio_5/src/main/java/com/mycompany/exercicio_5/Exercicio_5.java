/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_5;

import java.util.Scanner;

/**
 *
 * @author v.silva
 *Contagem Regressiva
 * Um dos sistemas de alertas da empresa exige que uma contagem regressiva seja feita para avisar 
 * os usuários sobre a finalização de um processo.
 */
public class Exercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        

        System.out.print("Entre com numero de incio da contagem regressiva : ");
        numero = sc.nextInt();
        
        
        for (int i = numero ; i>=0 ; i--){
            System.out.printf("Contando.. %2d\n", i);

            if (i==0){
                System.out.print("Processo concluido!!!");
            }
            
        }
        
    }
}
