/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_06;

import javax.swing.JOptionPane;

/**
 *
 * @author v.silva
 */
public class Pergunta_06 {

    public static void main(String[] args) {
        String recebedado= "";
        int[] num;
        int nNum = 0;
        int contator = 0 ;
        int soma = 0 ;
        
        recebedado=JOptionPane.showInputDialog(null,
                "Quantos numero deseja informar ? :\n" ,
                "", JOptionPane.INFORMATION_MESSAGE);
        nNum = Integer.parseInt(recebedado);
        num = new int[nNum];
        
        for (int i = 0 ; i<=num.length-1 ; i++){
                recebedado=JOptionPane.showInputDialog(null,
                "Entre com o "+ (i+1) +"º número de sua lista : \n" ,
                "", JOptionPane.INFORMATION_MESSAGE);
                nNum = Integer.parseInt(recebedado);
                soma = soma + nNum;
                contator++;
        }
        
                    JOptionPane.showMessageDialog(null,
                    "Média = " + (soma/contator)+"\n"+
                    "Soma = " + (soma)+"\n"+
                    "Quantidade de números digitados = " + (contator)+"\n",
                    "", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Hello World!");
    }
}
