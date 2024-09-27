/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_showimputmessage_dialog_vanderson;

import javax.swing.JOptionPane;

/**
 *
 * @author v.silva
 */
public class PROJETO_SHOWIMPUTMESSAGE_DIALOG_VANDERSON {

    public static void main(String[] args) {
        String[] opcoes = {"Botao 1", "Botao 2", "Botao 3", "Botao 4"};
        float nota1 = 15;
        float nota2 = 0;
        float media = 0;

        // Pega a primeira nota através de uma caixa de diálogo
//        String inputNota1 = JOptionPane.showInputDialog("Entre com a nota 1:");
//        nota1 = Float.parseFloat(inputNota1);  // Converte a string recebida para float

        // Pega a segunda nota através de uma caixa de diálogo
//        String inputNota2 = JOptionPane.showInputDialog("Entre com a nota 2:");
//        nota2 = Float.parseFloat(inputNota2);  // Converte a string recebida para float

        // Calcula a média das notas
//        media = (nota1 + nota2) / 2;

        // Exibe o resultado em uma caixa de diálogo
//        JOptionPane.showMessageDialog(null, "A média é: " + media);
        
        JOptionPane.showOptionDialog(
                           null
                         , "Pergunta?"        // Mensagem
                         , "Titulo"               // Titulo
                         , JOptionPane.YES_NO_OPTION  
                         , JOptionPane.PLAIN_MESSAGE                               
                         , null // Icone. Você pode usar uma imagem se quiser, basta carrega-la e passar como referência
                         , opcoes // Array de strings com os valores de cada botão. Veja o exemplo abaixo **
                         , "Botao 3"    // Label do botão Default
                    );
        JOptionPane.showOptionDialog(
                           null
                         , "Informação?" +nota1       // Mensagem
                         , "Titulo"               // Titulo
                         , JOptionPane.YES_NO_OPTION  
                         , JOptionPane.INFORMATION_MESSAGE
                         , null // Icone. Você pode usar uma imagem se quiser, basta carrega-la e passar como referência
                         , opcoes // Array de strings com os valores de cada botão. Veja o exemplo abaixo **
                         , "Botao 3"    // Label do botão Default
                       );
    }
}
