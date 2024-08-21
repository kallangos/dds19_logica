/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_vetornome_vanderson;
import java.util.Scanner;

/**
 *
 * @author v.silva
 */
public class PROJETO_VETORNOME_VANDERSON {

    public static void main(String[] args) {
        int linha = 2;
        int coluna = 4;
        String vetor[][] = new String [linha][coluna];
        Scanner ler = new Scanner (System.in);
        
        for ( int l = 0 ; l<linha ; l++){
            
            for ( int c = 0 ; c<coluna ; c++){
                System.out.println("Entre com o nome [" + l + "] [" + c + "]: ");
                vetor [l][c] = ler.nextLine();
            }
            
        }

        
        for ( int l = 0 ; l<linha ; l++){
            
            for ( int c = 0 ; c<coluna ; c++){
                System.out.print("[ " + vetor [l][c] +" ] ");
            }
            System.out.printf("\n");   
        }
        
    }
}
