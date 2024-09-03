/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_trycatch3_vanderson;
import java.util.Scanner;

/**
 *
 * @author v.silva
 */
public class PROJETO_TRYCATCH3_VANDERSON {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int[] vetor1 = {6,2,3,7,5,6};
        int resultado;
        
        try {
            
            for (int i =0 ; i<vetor1.length ; i++ ) {
                System.out.println("Entre com o numero [" + i+ "]");
                vetor1[i] = ler.nextInt();
            }
                    
            for (int i =0 ; i<vetor1.length ; i++ ) {
                resultado = vetor1[i]/vetor1[i+1];
                System.out.println(vetor1[i] + "/" + vetor1[i+1] + " = " + resultado );
                i+=1;
            }
        } catch  (ArithmeticException Erro01){
            System.out.println(" Erro 1 ao Dividir : " + Erro01);
        } catch  (NumberFormatException Erro02){
            System.out.println(" Erro 2 ao Dividir : " + Erro02);
        }   catch  (Exception Erro03){
            System.out.println(" Erro desconhecido ;P : " + Erro03);
        }
        
        ler.close();

    }
}
