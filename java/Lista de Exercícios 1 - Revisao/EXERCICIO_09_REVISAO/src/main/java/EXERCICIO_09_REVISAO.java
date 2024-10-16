
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Thor
 */
public class EXERCICIO_09_REVISAO {
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
        int x = 1 , maxVal = 0 , minVal = 0;
        int contVal = 0, somaVal = 0 , xTemp = 0;
        
        
        maxVal = recebeNumero("Entre com um numero inteiro (Max): ", "Senai Looper III");    
        minVal = recebeNumero("Entre com um numero inteiro (Min): ", "Senai Looper III"); 
        if (minVal>maxVal){
            xTemp =maxVal;
            maxVal=minVal;
            minVal=xTemp;
        }
        
        while (x!=0){
          
            x = recebeNumero("Entre com um numero inteiro (X): ", "Senai Looper III");  

            if (x>=minVal & x<=maxVal){
                ++contVal;
                somaVal=+x;                
            } else if (x!=0){
                exibeMensagem(
                      "Valor fora do intervalo [" + maxVal + "," + minVal +"] ignorado na totalizaçao",
                      "Senai Looper III"
                );                
            }
        }
        
        exibeMensagem(
              "Valor (MAX) : " + maxVal +"\n"+
              "Valor (Min) : " + minVal +"\n"+
              "Quantos Valores informados validos: " + contVal +"\n"+
              "Soma dos valores informados validos: " + somaVal +"\n",
              "Senai Looper III");
    }
}
