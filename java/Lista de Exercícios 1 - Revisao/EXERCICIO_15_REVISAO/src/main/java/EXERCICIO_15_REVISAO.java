/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import javax.swing.JOptionPane;
import java.io.IOException;

/**
 *
 * @author Thor
 */
public class EXERCICIO_15_REVISAO {
    public static void exibeMensagem(String frase, String titulo){
        JOptionPane.showMessageDialog(
            null
            , frase
            , titulo
            , JOptionPane.PLAIN_MESSAGE
        );    
    }
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
        int anoNasc = 0 , anoAtual = 0 , idade = 0;
        
        anoNasc = recebeNumero("Entre o ano de seu nascimento : ", "Age Discovery");  
        anoAtual = recebeNumero("Entre o ano em que estamos : ", "Age Discovery");  
        
        idade = anoAtual - anoNasc;
        
        exibeMensagem(
          "Neste ano completa " + idade +" anos.\n",
          "Age Discovery"
        );
    }
}
