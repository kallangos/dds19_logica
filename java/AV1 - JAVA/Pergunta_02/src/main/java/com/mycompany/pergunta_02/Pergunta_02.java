/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_02;

import javax.swing.JOptionPane;

/**
 *
 * @author v.silva
 */
public class Pergunta_02 {
    
    public static void main(String[] args) {
        String recebeDado = "";
        int idade = 0;
        int dias  = 0 ;
        
        System.out.println("Hello World!");
        recebeDado = JOptionPane.showInputDialog(null, "Entre com a idade da pessoa (em ANOS, MESES ou DIAS): ", "", JOptionPane.INFORMATION_MESSAGE);
        idade = Integer.parseInt(recebeDado);
        recebeDado = JOptionPane.showInputDialog(null, ""
                + "Informe qual a metrica utilizada,sendo :\n "
                + "(1)ANOS\n"
                + "(2)MESES\n"
                + "(3)DIAS\n"
                , "", JOptionPane.INFORMATION_MESSAGE);
          if (recebeDado.equals("1")){
              dias = idade*365;
              JOptionPane.showMessageDialog(null, idade + "anos, " + (dias/30)+ "meses, " + dias + "dias.", "", JOptionPane.INFORMATION_MESSAGE);
            } else if (recebeDado.equals("2")){
                dias = idade*30;
                JOptionPane.showMessageDialog(null, idade/12 + "anos, " + idade+ "meses, " + dias + "dias.", "", JOptionPane.INFORMATION_MESSAGE);
                } else if (recebeDado.equals("3")){
                    dias = idade;
                    JOptionPane.showMessageDialog(null, idade/365 + "anos, " + idade/30+ "meses, " + dias + "dias.", "", JOptionPane.INFORMATION_MESSAGE);
                    }  
        
        
        
    }
}
