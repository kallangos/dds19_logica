
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
        String todosN = " ";
        int max = 20;
        //int[] valoresValidos ;
        int[] valoresValidos = new int[max];
        
        
        maxVal = recebeNumero("Entre com um numero inteiro (Max): ", "Senai Looper IV");    
        minVal = recebeNumero("Entre com um numero inteiro (Min): ", "Senai Looper IV"); 
        if (minVal>maxVal){
            xTemp =maxVal;
            maxVal=minVal;
            minVal=xTemp;
        }
        
        while (x!=0){
          
            x = recebeNumero("Entre com um numero inteiro (X): ", "Senai Looper IV");  

            if (x>=minVal & x<=maxVal){
                ++contVal;
                somaVal=somaVal+x; 
                valoresValidos[contVal-1]=x;
            } else if (x!=0){
                exibeMensagem(
                      "Valor fora do intervalo [ " + maxVal + " , " + minVal +" ] ignorado na totalizaçao",
                      "Senai Looper IV"
                );                
            }
        }
        
        exibeMensagem(
              "Valor (MAX) : " + maxVal +"\n"+
              "Valor (Min) : " + minVal +"\n"+
              "Quantos Valores informados validos : " + contVal +"\n"+
              "Soma dos valores informados validos: " + somaVal +"\n",
              "Senai Looper IV");
        
               
        for (int i = 1 ; i<=contVal ; i++){
            todosN = todosN + " " + Integer.toString(valoresValidos[i-1]);
            if ((i%20)==0){
                todosN = todosN + "\n ";
                System.out.println(i%20);
            }
        }
        todosN = todosN + 
                "\n\n Valores Somados : " + somaVal+"\n\n" + 
                " Teremos o problema de estouro do vetor,\n"
                + " caso tenhamos uma quantidade de números\n"
                + " validados que exceda o tamanho do vetor."
                ;
        exibeMensagem(todosN, "Exibindo os números valodos no vetor");
    }
}
