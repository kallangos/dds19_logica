/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_04;

import javax.swing.JOptionPane;

/**
 *
 * @author v.silva
 */
public class Pergunta_04 {

    public static void main(String[] args) {
        int num = 0 ;
        String recebedado= "";
        System.out.println("Hello World!");
        
        recebedado=JOptionPane.showInputDialog(null,
                "Entre com um numero inteiro :\n" ,
                "", JOptionPane.INFORMATION_MESSAGE);
        num = Integer.parseInt(recebedado);
        
        JOptionPane.showMessageDialog(null,
                    "O antecessor de " + recebedado + " e : " + (num-1) + "\n" + 
                    "O sucessor de " + recebedado + " e : " + (num+1) + "\n",
                    "", JOptionPane.INFORMATION_MESSAGE);
    }
}
