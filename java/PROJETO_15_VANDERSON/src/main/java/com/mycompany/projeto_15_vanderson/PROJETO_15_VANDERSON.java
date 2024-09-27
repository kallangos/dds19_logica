/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_15_vanderson;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
        String cxDialog = "";
        
        nomeArquivo = JOptionPane.showInputDialog(
                           null
                         , "Informe nome do prefixo do arquivo : "        // Mensagem
                         , "Gerador de TXT"               // Titulo
                         , JOptionPane.PLAIN_MESSAGE
                    );
        
        for (int i=0 ; i<=valorUsuario.length-1 ; i++){
        cxDialog = JOptionPane.showInputDialog(
                           null
                         , "Informe o numero na posição ["+(i+1)+"] no vetor :"        // Mensagem
                         , "Entrada de numeros"               // Titulo
                         , JOptionPane.PLAIN_MESSAGE
                    );
            if (cxDialog !=null){ 
                valorUsuario[i] = Integer.parseInt(cxDialog);
            } 
        }
        
        
        for (int i=0 ; i<=valorUsuario.length-1 ; i++){
            
            FileWriter arquivo = new FileWriter(".\\" + nomeArquivo + "-"+ i +".txt");
            PrintWriter gravar = new PrintWriter(arquivo);
            gravar.printf("Tabuada do " + valorUsuario[i]+ " | " + date + "\n");
            gravar.printf("-------------------------------------------");
            
            for (int c = 1 ; c<=10 ; c++){
                gravar.printf("\n %2d + %2d = %2d",  c , valorUsuario[i] , (c*valorUsuario[i]));
            }
        gravar.printf("\n-------------------------------------------");
        arquivo.close();
        }
        
        for (int i=0 ; i<=valorUsuario.length-1 ; i++){
            JOptionPane.showMessageDialog(
                           null
                         , "Arquivo .\\" + nomeArquivo + "-"+ i + ".txt Gerado com Sucesso!" // Mensagem
                         , "Status de Gravação"               // Titulo
                         , JOptionPane.PLAIN_MESSAGE
                    );
        }
        
                
    }
}
