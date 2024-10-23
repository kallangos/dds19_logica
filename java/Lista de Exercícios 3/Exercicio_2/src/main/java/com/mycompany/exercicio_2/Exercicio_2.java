/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_2;

import java.util.Scanner;

/**
 *
 * @author v.silva
 * Número Par ou Ímpar
 * O sistema de controle de estoque da TechSolve precisa identificar se a quantidade de itens em estoque de
 * um determinado produto é par ou ímpar. Desenvolva essa funcionalidade.
  */
public class Exercicio_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd = 0, resultado=0;
        System.out.print("Entre com a quantidade no estoque: ");
        qtd = sc.nextInt();
        
        resultado = qtd%2;
                
         if (resultado!=0)       {
            System.out.println("Seu numero é IMPAR" );
        } else {
            System.out.println("Seu numero é PAR" );
        }
    
            System.out.println("Saindo...");    
    }
}
