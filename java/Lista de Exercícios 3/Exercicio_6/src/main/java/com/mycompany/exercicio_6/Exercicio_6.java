/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_6;

import java.util.Scanner;

/**
 *
 * @author v.silva
 * Média de Três Números
 * Uma função de avaliação de desempenho precisa calcular a média de três notas inseridas por um funcionário. 
 * Desenvolva a solução.
 */
public class Exercicio_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int media , numUm, numDois, numTres = 0;
        System.out.println("Calculo de media com 3 numero" );
        System.out.print("Entre com o primeiro numero : ");
        numUm = sc.nextInt();
        System.out.print("Entre com o segundo numero : ");
        numDois = sc.nextInt();
        System.out.print("Entre com o terceiro numero : ");
        numTres = sc.nextInt();
        
        media = (numUm + numDois + numTres)/3;
        System.out.println("A média entre os tres numeros é : " + media );
    }
}
