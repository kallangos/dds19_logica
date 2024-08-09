/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_7_vanderson;

import java.util.Scanner;


/**
 *
 * @author v.silva
 */
public class PROJETO_7_VANDERSON {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
                
        System.out.println("Entre com a Primeira nota : ");
        int n1 = ler.nextInt();
        System.out.println("Entre com a Segunda nota : ");
        int n2 = ler.nextInt();
        System.out.println("Entre com a Terceira nota : ");
        int n3 = ler.nextInt();
        System.out.println("Entre com a Frequencia do aluno : ");
        int freq = ler.nextInt();
        
        if (freq>=75){
            if ( ((n1+n2+n3)/3)>=7 ){
                System.out.println("Aluno aprovado!!");
                System.out.println("Media = " + ((n1+n2+n3)/3));
            }
            else{
                System.out.println("Aluno Reprovado!!");
                System.out.println("Media = " + ((n1+n2+n3)/3));
            }
        }
        else {
            System.out.println("Aluno Reprovado por falta!!!");
        }
        
        

    }
}
