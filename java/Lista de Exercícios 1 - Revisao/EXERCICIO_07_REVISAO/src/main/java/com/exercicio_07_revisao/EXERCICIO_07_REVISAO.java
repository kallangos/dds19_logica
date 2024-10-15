/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicio_07_revisao;

import javax.swing.JOptionPane;
import java.io.IOException;

/**
 *
 * @author Thor
 */
public class EXERCICIO_07_REVISAO {
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
        int x = 1 , maiorVal = 0 , menorVal = 0;
        int contVal = 0, somaVal = 0 , mediaVal = 0;
       
        
    
        
        while (x!=0){
            
            x = recebeNumero("Entre com um numero inteiro : ", "Senai Looper II");    

            if (x>0){
                if(contVal==0){
                    menorVal = x;
                }
                ++contVal;
                somaVal=somaVal+x;
                if (x>maiorVal){
                    maiorVal = x;
                } 
                if ((x<menorVal)&(contVal>0)) {
                    menorVal = x;
                } 
            }
            
            if ((x<=0) & (contVal>0)){
                JOptionPane.showMessageDialog(
                    null
                    , "Maior valor informado : " + maiorVal +"\n"+
                      "Menor valor informado : " + menorVal +"\n"+
                      "Valores informados : " + contVal +"\n"+
                      "Soma dos valores informados : " + somaVal +"\n"+
                      "Media dos valores informados : " + somaVal/contVal +"\n"
                    , "Senai Looper"
                    , JOptionPane.PLAIN_MESSAGE
                );
            }
            if (x<=0){
            System.out.println("-------------");
            System.out.println("| Saindo... |");
            System.out.println("-------------");
            System.exit(0);
            }
        }
        
        
    }
}
