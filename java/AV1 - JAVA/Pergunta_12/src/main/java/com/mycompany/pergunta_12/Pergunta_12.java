/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_12;

import javax.swing.JOptionPane;

/**
 *
 * @author v.silva
 */
public class Pergunta_12 {

    public static void main(String[] args) {
        int [] dadosInsert = new int[3];
        String recebeDado = "";
        int copia = 0;
        System.out.println("Hello World!");
        int novoNum = 0 ;
        
        for (int i = 0 ; i<dadosInsert.length ; i++){
            recebeDado = JOptionPane.showInputDialog(null, "Entre com o "+ (i+1) + "º numero inteiro: ", "", JOptionPane.INFORMATION_MESSAGE);
            dadosInsert[i]=Integer.parseInt(recebeDado);
        }

        for (int J = 0 ; J <dadosInsert.length ; J++) {
                for (int i = 0 ; i <dadosInsert.length-1 ; i++){
                        if (dadosInsert[i]>dadosInsert[i+1]){
                                copia= dadosInsert[i];
                                dadosInsert[i]= dadosInsert[i+1];
                                dadosInsert[i+1] = copia;
                        }
                }
        }

         System.out.println("vetor ordenando");    
         for (int i = 0 ; i<dadosInsert.length ; i++){
            System.out.println(dadosInsert[i]);    
         }
         
         recebeDado = JOptionPane.showInputDialog(null, "Entre com um numero inteiro: ", "", JOptionPane.INFORMATION_MESSAGE);
         novoNum = Integer.parseInt(recebeDado);
         
         for (int i = 0 ; i <dadosInsert.length ; i++){
             if (novoNum<dadosInsert[i])
                 copia = dadosInsert[i];
                 dadosInsert[i]=novoNum;
                 dadosInsert[i+1] = copia;
         }

         System.out.println("NOVO vetor ordenando");    
         for (int i = 0 ; i<=dadosInsert.length-1 ; i++){
            System.out.println(dadosInsert[i]);    
         }
         
        //JOptionPane.showMessageDialog(null, idade + "anos, " + (dias/30)+ "meses, " + dias + "dias.", "", JOptionPane.INFORMATION_MESSAGE);
        
    }
}














