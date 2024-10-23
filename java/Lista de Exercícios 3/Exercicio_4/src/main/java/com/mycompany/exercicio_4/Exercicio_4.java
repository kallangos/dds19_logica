/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_4;

import java.util.Scanner;

/**
 *
 * @author v.silva
 * Tabuada de um Número
 * A TechSolve está desenvolvendo uma ferramenta educacional para crianças. Sua tarefa é programar
 * uma função que exibe a tabuada de um número fornecido.
 */
public class Exercicio_4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int numero , resultado = 0;
        System.out.print("Digite o numero para extrair a tabuada : ");
        numero = ler.nextInt();
    
        for (int i = 1 ; i<=10 ; i++){
            resultado = i*numero;
            System.out.printf("%2d x %d = %2d \n", i , numero , resultado);
        }
        
        System.out.println("Saindo...");   
    }
}
