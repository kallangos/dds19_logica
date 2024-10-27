/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicio_15;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Thor
 */
public class Exercicio_15 {

    public static void main(String[] args) throws IOException {
        String recebeDado = "";
        int nPessoas = 0;
        int nVetor = 4;
        int [] generoVotado = new int [nVetor ];

        

        recebeDado =  JOptionPane.showInputDialog(null, 
                "Quantos pessoas serao entrevistadas?", 
                "Radio Local Tretra", 
                JOptionPane.INFORMATION_MESSAGE);
        nPessoas = Integer.parseInt(recebeDado);
        
        
        for (int i = 0 ; i<nPessoas ; i++){
            
                recebeDado =  JOptionPane.showInputDialog(null, 
                        "Qual seu genero musical preferido ?\n" +
                        "Digite o numero correspondente a sua preferencia.\n\n" +
                        "(1) Rock    \n" +
                        "(2) Pop     \n" +
                        "(3) Dance   \n" +
                        "(4) Trance  \n" +
                        "(0) Sair    \n\n"      
                        , "Radio TRETA", JOptionPane.INFORMATION_MESSAGE);
                if (recebeDado.equals("0")){
                    System.out.print("Saindo..." );
                    break;
                }
                for (int j = 0 ; j<generoVotado.length ; j++){
                    if (recebeDado.equals(""+(j+1)+"")){
                        generoVotado[j]=generoVotado[j]+1;
                    }
                }
                
        }
        
        JOptionPane.showMessageDialog(null, 
                "Resultado da Pesquisa:\n\n"+
                generoVotado[0] + " voto(s) computados para o genero Rock.\n"+
                generoVotado[1] + " voto(s) computados para o genero PoP.\n"+
                generoVotado[2] + " voto(s) computados para o genero Dance.\n"+
                generoVotado[3] + " voto(s) computados para o genero Trance.\n\n"
                ,"Radio TRETA", 
                JOptionPane.INFORMATION_MESSAGE);
        
        FileWriter arquivo = new FileWriter(".\\radioTRETA.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        gravar.printf("------ Radio TRETA - Generos Votados ------\n");
        gravar.printf(  "| %2s Voto(s) para o genero ROCK.\n"+
                        "| %2s Voto(s) para o genero PoP.\n"+
                        "| %2s Voto(s) para o genero Dance.\n"+
                        "| %2s Voto(s) para o genero Trance.\n",
                        generoVotado[0], generoVotado[1], generoVotado[2], generoVotado[3]  );
        gravar.printf("--------------------------------------------\n");
        gravar.printf("\n* Final da Lista *");
        arquivo.close();
        

    }
}
