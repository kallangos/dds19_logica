/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicio_13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Thor
 */
public class Exercicio_13 {

    public static void main(String[] args) throws IOException {
        String recebeDado = "";
        double calcFerias =0;
        String [] produtos;
        String [] valor;
        boolean achou = false;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        
        recebeDado =  JOptionPane.showInputDialog(null, 
                "Quantos produtos deseja cadastrar?", 
                "Cad Produto", 
                JOptionPane.INFORMATION_MESSAGE);
        produtos = new String [Integer.parseInt(recebeDado)];
        valor = new String [Integer.parseInt(recebeDado)];
        
        for (int i = 0 ; i<produtos.length ; i++){

            recebeDado=JOptionPane.showInputDialog(null, 
                    "Entre com o NOME do " + (i+1)+"º produto : ", 
                    "Cad "+(i+1)+"º Produto", 
                    JOptionPane.INFORMATION_MESSAGE);  
            produtos[i] = recebeDado;

            recebeDado=JOptionPane.showInputDialog(null, 
                    "Entre com o valor do " + (i+1)+"º produto : " + produtos[i], 
                    "Cad Valor "+(i+1)+"º Produto", 
                    JOptionPane.INFORMATION_MESSAGE);  
            valor[i] = recebeDado ;    
        }
 
        recebeDado="";

        for (int i =0 ; i<produtos.length ; i++){

            recebeDado = recebeDado + 
                    "Produto : "+ produtos[i] + "\n" +
                    "Valor      : "+ formatter.format( Double.parseDouble(valor[i]) ) + "\n";
        }

        JOptionPane.showMessageDialog(null, 
        "Lista de produtos cadastrada: : \n\n" + recebeDado, 
        "Listagem de Produtos", 
        JOptionPane.INFORMATION_MESSAGE); 
                
        FileWriter arquivo = new FileWriter(".\\listaProdutosPrecos.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        gravar.printf("-------------------- Listagem de Produtos e Preços  --------------------\n");

        for (int i = 0 ; i<produtos.length ; i++){
            gravar.printf("| Produto    : %2s\n| Preço      : %2s\n| ",  produtos[i] , formatter.format( Double.parseDouble(valor[i]) ));
            gravar.printf("------------------------------------------------------------------------------\n");
        }

        gravar.printf("\n* Final da Lista *");
        arquivo.close();

           
                




        
    }
}
