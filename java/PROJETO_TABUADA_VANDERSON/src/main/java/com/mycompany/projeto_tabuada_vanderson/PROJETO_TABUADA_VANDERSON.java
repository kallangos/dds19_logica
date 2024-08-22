/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_tabuada_vanderson;
import java.util.Scanner;
        
/**
 *
 * @author v.silva
 */
public class PROJETO_TABUADA_VANDERSON {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
                
        System.out.println("Digite o numero para extrair a tabuada : ");
        int numero = ler.nextInt();
        tabuada(numero);
        
        
    }
    
    public static void tabuada(int n) {
        int resultados = 10;
        int vetor[] =  new int [resultados];
    
        for (int i = 1 ; i<=10 ; i++){
            vetor[i-1] = i*n;
            System.out.printf("%2d x %d = %2d \n", i , n , vetor[i-1]);
        }
        
        
    }
}
