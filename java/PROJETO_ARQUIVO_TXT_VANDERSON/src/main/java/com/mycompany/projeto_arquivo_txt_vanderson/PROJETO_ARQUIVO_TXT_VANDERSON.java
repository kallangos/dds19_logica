/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_arquivo_txt_vanderson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author v.silva
 */
public class PROJETO_ARQUIVO_TXT_VANDERSON {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String nomeArquivo = "";
        Date date = new Date();
        int valorUsuario = 0 ;
        
        System.out.printf("-------------------------------------------");
        System.out.print("\nInforme nome do arquivo : ");
        nomeArquivo = sc.nextLine();
        System.out.printf("-------------------------------------------");
        System.out.print("\nInforme um valor : ");
        valorUsuario = sc.nextInt();
        sc.nextLine();
        
        FileWriter arquivo = new FileWriter(".\\" + nomeArquivo + ".txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        gravar.printf("Tabuada do " + valorUsuario + " | " + date + "\n");
        gravar.printf("-------------------------------------------");
        for (int i = 1 ; i<=10 ; i++){
            gravar.printf("\n %2d + %2d = %2d",  i , valorUsuario , (i*valorUsuario));
        }
        
        gravar.printf("\n-------------------------------------------");
        arquivo.close();
    }
}
