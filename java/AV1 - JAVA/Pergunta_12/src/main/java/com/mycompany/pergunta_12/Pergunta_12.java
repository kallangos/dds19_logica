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
        int qtd = 0;
        int copia = 0;
        System.out.println("Hello World!");
        
        for (int i = 0 ; i<dadosInsert.length ; i++){
            recebeDado = JOptionPane.showInputDialog(null, "Entre com o "+ (i+1) + "º numero inteiro: ", "", JOptionPane.INFORMATION_MESSAGE);
            dadosInsert[i]=Integer.parseInt(recebeDado);
        }
        
         for (int J = 0 ; J<=dadosInsert.length-1 ; J++){
             System.out.println("J="+ J);    
              for (int i = 0 ; i<=dadosInsert.length-1 ; i++){
             System.out.println("i="+ i);    
                  if (dadosInsert[J]>dadosInsert[J+1]){
                              copia =dadosInsert [i];
                              dadosInsert[i]=dadosInsert[i+1];
                              dadosInsert[i+1]= copia;
                  }
              }
          }
         
         System.out.println("ordenando");    
         for (int i = 0 ; i<dadosInsert.length-1 ; i++){
            System.out.println(dadosInsert[i]);    
         }
         
         
        //JOptionPane.showMessageDialog(null, idade + "anos, " + (dias/30)+ "meses, " + dias + "dias.", "", JOptionPane.INFORMATION_MESSAGE);
        
    }
}














