/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_04_revisao;

import java.io.IOException;
import java.util.Scanner;

/**
 *
    Escreva um programa que leia três números reais e informe se eles constituem os lados de um triângulo.
   Em caso afirmativo, informe se o triângulo é equilátero, isósceles ou escaleno. Para que três números
   formem um triângulo deve ocorrer que a soma dos dois lados menores deve ser maior que o lado maior.
   Para resolver essa questão verifique como funcionam os operadores lógicos and e or.
   * 
 */
public class EXERCICIO_04_REVISAO {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        double numUm, numDois, numTres = 0;
        
        System.out.printf("-------------------------------------------\n");
        System.out.print("Entre com o primeiro numero real: ");
        numUm = sc.nextDouble();
        
        System.out.print("Entre com o segundo numero real: ");
        numDois = sc.nextDouble();
        
        if(numUm != Math.floor(numUm) && numDois != Math.floor(numDois)){
            
        }


    }
}
