/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_15_vanderson;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author v.silva
 */
public class PROJETO_15_VANDERSON {

    public static void main(String[] args) throws IOException{
        int tamVetor = 5;
        int valorUsuario[] = new int[tamVetor];
        Scanner sc = new Scanner(System.in);
        String nomeArquivo = "";
        Date date = new Date();
        
        System.out.printf("-------------------------------------------");
        System.out.print("\nInforme nome do prefixo do arquivo : ");
        nomeArquivo = sc.nextLine();
        
        
        for (int i=0 ; i<=valorUsuario.length-1 ; i++){
            System.out.print("\nInforme o numero na posição ["+(i+1)+"] no vetor : ");
            valorUsuario[i]=sc.nextInt();
        }
        
        
        for (int i=0 ; i<=valorUsuario.length-1 ; i++){
            
            FileWriter arquivo = new FileWriter(".\\" + nomeArquivo + "-"+ i +".txt");
            PrintWriter gravar = new PrintWriter(arquivo);

            gravar.printf("Taboada do " + valorUsuario[i]+ " | " + date + "\n");
            gravar.printf("-------------------------------------------");
            
            for (int c = 1 ; c<=10 ; c++){
                gravar.printf("\n %2d + %2d = %2d",  c , valorUsuario[i] , (c*valorUsuario[i]));
            }
            
        gravar.printf("\n-------------------------------------------");
        arquivo.close();
        }
        
    }
}
