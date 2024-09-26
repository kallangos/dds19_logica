/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_01_revisao;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author v.silva
 */
public class EXERCICIO_01_REVISAO {

    public static void main(String[] args) throws IOException{
        int numUm, numDois = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Foneça o primeiro numero : ");
        numUm = sc.nextInt();
        
        System.out.print("Foneça o segundo numero : ");
        numDois = sc.nextInt();
        
        System.out.print("Soma de " + numUm + " com " + numDois + " = " + (numUm+numDois));    }
}
