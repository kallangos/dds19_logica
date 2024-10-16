
import javax.swing.JOptionPane;
import java.io.IOException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Thor
 */
public class EXERCICIO_13_REVISAO {
    public static void exibeMensagem(String frase, String titulo){
        JOptionPane.showMessageDialog(
            null
            , frase
            , titulo
            , JOptionPane.PLAIN_MESSAGE
        );    
    }
    public static void main(String[] args) throws IOException{
        String todosN = " ";
        
        for (int i = 150 ; i<=300 ; i++){
            todosN = todosN + " " + Integer.toString(i);
            if ((i%20)==0){
                todosN = todosN + "\n ";
                System.out.println(i%20);
            }
        }

        exibeMensagem(todosN, "Exibindo todos os numeros de 150 a 300");
                
    }
}
