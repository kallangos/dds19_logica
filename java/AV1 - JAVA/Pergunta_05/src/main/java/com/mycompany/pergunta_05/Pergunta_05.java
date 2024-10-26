/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_05;

import javax.swing.JOptionPane;

/**
 *
 * @author v.silva
 */
public class Pergunta_05 {

    public static void main(String[] args) {
        String recebedado= "";
        String codigo= "1234";
        String senha= "9999";
        
        recebedado=JOptionPane.showInputDialog(null,
                "Entre com código do usuário :\n" ,
                "", JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("recebedado = " + recebedado);
        if (!"1234".equals(recebedado)){
                    JOptionPane.showMessageDialog(null,
                    "Usuário invalido!",
                    "", JOptionPane.INFORMATION_MESSAGE);
        } else if (recebedado.equals(codigo)){
                    recebedado=JOptionPane.showInputDialog(null,
                    "Entre com a senha :\n" ,
                    "", JOptionPane.INFORMATION_MESSAGE);
                   if (recebedado.equals(senha)){
                        JOptionPane.showMessageDialog(null,
                        "Acesso permitido!\n" ,
                        "", JOptionPane.INFORMATION_MESSAGE);
                   } else {
                        JOptionPane.showMessageDialog(null,
                        "Senha incorreta!\n" ,
                        "", JOptionPane.INFORMATION_MESSAGE);
                   }
        }
        
    }
}
