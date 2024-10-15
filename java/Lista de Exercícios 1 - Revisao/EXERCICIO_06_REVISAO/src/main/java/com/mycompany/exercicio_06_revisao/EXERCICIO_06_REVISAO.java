/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_06_revisao;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Thor
 */
public class EXERCICIO_06_REVISAO {
    public static int recebeNumero(String frase, String titulo){
    int resultado = 0;
    String recebeDado = "";
        try {
            recebeDado = JOptionPane.showInputDialog(
            null,
            frase,
            titulo,
            JOptionPane.INFORMATION_MESSAGE
            );
            resultado = Integer.parseInt(recebeDado);

        } catch (NumberFormatException Erro01) {
            JOptionPane.showMessageDialog(
                null
                , "Deve ser um numero INTEIRO!" // Mensagem
                , "Erro: " + Erro01             // Titulo
                , JOptionPane.PLAIN_MESSAGE
            );
            System.exit(0);
        }
    return resultado ;
    }

    public static void main(String[] args) throws IOException{
        int x = 1 ;
       
        while (x!=0){
        x = recebeNumero("Entre com um numero inteiro : ", "Senai Looper");    
            if (x>=0) {
                JOptionPane.showMessageDialog(
                    null
                    , "O numero é POSITIVO!"
                    , "Senai Looper"
                    , JOptionPane.PLAIN_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                    null
                    , "O numero é NEGATIVO!"
                    , "Senai Looper"
                    , JOptionPane.PLAIN_MESSAGE
                );
            }
        }
        
        System.out.println("Saindo...");
    }
}
