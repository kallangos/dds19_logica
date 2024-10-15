/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_05_revisao;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Thor
 */
public class EXERCICIO_05_REVISAO {
    public static String recebeTexto(String frase, String titulo){
        String resultado = "";
        String recebeDado = "";
            try {
                recebeDado = JOptionPane.showInputDialog(
                null,
                frase,
                titulo,
                JOptionPane.INFORMATION_MESSAGE
                );
                resultado = recebeDado;
                
            } catch (NumberFormatException Erro01) {
                
                JOptionPane.showMessageDialog(
                    null
                    , "O dado fornecido nao era um texto!" // Mensagem
                    , "Erro: " + Erro01               // Titulo
                    , JOptionPane.PLAIN_MESSAGE
                );
                System.exit(0);
            }
        return resultado ;
    }
    public static float recebeNumero(String frase, String titulo){
        float resultado = 0;
        String recebeDado = "";
            try {
                recebeDado = JOptionPane.showInputDialog(
                null,
                frase,
                titulo,
                JOptionPane.INFORMATION_MESSAGE
                );
                resultado = Float.parseFloat(recebeDado);
                
            } catch (NumberFormatException Erro01) {
                JOptionPane.showMessageDialog(
                    null
                    , "Deve ser um numero FLOAT ou INTEIRO!" // Mensagem
                    , "Erro: " + Erro01               // Titulo
                    , JOptionPane.PLAIN_MESSAGE
                );
                /*
                System.out.println("Opção INVALIDA!");
                System.out.println("Deve ser um numero FLOAT");
                System.out.println("ou INTERIRO");
                System.out.println("Erro: " + Erro01);
                */
                System.exit(0);
            }
        return resultado ;
    }

    public static void main(String[] args) throws IOException{
        float peso = 0; 
        String nomeLutador = "" , categoria = "";
        
        nomeLutador = recebeTexto("Entre com o nome do Lutador : ", "Senai Fighter");
        peso = recebeNumero("Entre com o peso : ", "Senai Fighter");
        
        if (peso<=65) {
            categoria = "Pena";
        } 
        else if (peso>65&peso<=72){
            categoria = "Leve";
        }
        else if (peso>72&peso<=79){
            categoria = "Ligeiro";
        }   
        else if (peso>79&peso<=93){
            categoria = "Medio";
        }
        else if (peso>93&peso<=100){
            categoria = "Meio Pesado";
        } else {
            categoria = "Pesado";
        }
        
        JOptionPane.showMessageDialog(
               null
             , "O lutador " + nomeLutador + " pesa " + peso + "kg \n E se enquadra na categoria : " + categoria+"\n"
             , "Senai Fighter"       
             , JOptionPane.PLAIN_MESSAGE
        );
        
        FileWriter arquivo = new FileWriter(".\\catLutador.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.printf("---------------------------------------------------------------------------\n");
        gravar.printf("O lutador " + nomeLutador + " pesa " + peso + "kg e se enquadra na categoria : " + categoria+"\n");
        gravar.printf("---------------------------------------------------------------------------");
        arquivo.close();

        


        
    }
}
