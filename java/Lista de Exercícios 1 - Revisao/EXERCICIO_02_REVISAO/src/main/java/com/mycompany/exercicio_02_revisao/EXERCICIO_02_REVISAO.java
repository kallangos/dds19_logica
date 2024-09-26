/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_02_revisao;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 Escreva um programa que leia dois números inteiros e apresente na tela sua soma apenas se ambos forem
positivos. Use o mesmo formato do exercício anterior e, caso algum dos números fornecidos seja negativo
o programa deve escrever na tela que os "Dados de Entrada são Inválidos".
 * 
 */
public class EXERCICIO_02_REVISAO {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int numUm, numDois = 0;
        
        System.out.printf("-------------------------------------------\n");
        System.out.print("Foneça o primeiro numero INTEIRO: ");
        numUm = sc.nextInt();
        
        System.out.print("Foneça o segundo numero INTEIRO: ");
        numDois = sc.nextInt();
        
        if ((numUm>=0)&&(numDois>=0)){
            System.out.printf("-------------------------------------------\n");
            System.out.printf("Soma de " + numUm + " com " + numDois + " = " + (numUm+numDois));    
        } else {
            System.out.printf("-------------------------------------------\n");
            System.out.printf("Para realizar a somar,\n");
            System.out.printf("os dois numeros devem ser inteiros!\n");
            System.out.printf("Saindo...\n");
        }

    }
}
