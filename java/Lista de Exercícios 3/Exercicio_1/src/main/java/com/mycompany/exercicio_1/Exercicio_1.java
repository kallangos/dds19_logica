/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author v.silva
 *       Soma de Dois Números
         Você precisa criar uma calculadora simples para ajudar seu colega a somar 
         * dois números rapidamente. Esse será seu primeiro desafio.
 */
public class Exercicio_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numUm, numDois = 0, resultado=0;
        

        System.out.print("Foneça o primeiro numero: ");
        numUm = sc.nextInt();
        
        System.out.print("Foneça o segundo numero: ");
        numDois = sc.nextInt();
          
        System.out.println("O resultado da soma é : " + resultado);
             
        System.out.println("Saindo...");

    }
}
