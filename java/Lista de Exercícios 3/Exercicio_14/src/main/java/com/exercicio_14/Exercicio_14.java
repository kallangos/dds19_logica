/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicio_14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Thor
 */
public class Exercicio_14 {

    public static void main(String[] args) throws IOException {
        String recebeDado = "";
        double calcFerias =0;
        String [] funcionarios;
        String [] salarios;
        boolean achou = false;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        
        recebeDado =  JOptionPane.showInputDialog(null, 
                "Quantos funcionários deseja cadastrar?", 
                "Cad Funcionário", 
                JOptionPane.INFORMATION_MESSAGE);
        funcionarios = new String [Integer.parseInt(recebeDado)];
        salarios = new String [Integer.parseInt(recebeDado)];
        
        for (int i = 0 ; i<funcionarios.length ; i++){
            
                recebeDado=JOptionPane.showInputDialog(null, 
                        "Entre com o NOME do " + (i+1)+"º funcionário : ", 
                        "Cad "+(i+1)+"º funcionário", 
                        JOptionPane.INFORMATION_MESSAGE);  
                funcionarios[i] = recebeDado;
                
                recebeDado=JOptionPane.showInputDialog(null, 
                        "Entre com o SALARIO do " + (i+1)+"º funcionário : ", 
                        "Cad "+(i+1)+"º salario", 
                        JOptionPane.INFORMATION_MESSAGE);  
                salarios[i] = recebeDado ;    
        }
 
        while (!recebeDado.equals("2")){

        recebeDado=JOptionPane.showInputDialog(null, 
                "Deseja atualizar o salario de algum funcionario?\n\n" + 
                "Digite (1) para SIM\n" + 
                "Digite (2) para NÃO\n ", 
                "Atualizar funcionário?", 
                JOptionPane.INFORMATION_MESSAGE);  

                if (recebeDado.equals("1")){
                    
                    recebeDado=JOptionPane.showInputDialog(null, 
                            "Informe o nome do funcinario que deseja atualizar o salario : \n", 
                            "Atualizar funcionário?", 
                            JOptionPane.INFORMATION_MESSAGE);  
                    for (int i =0 ; i<funcionarios.length ; i++){

                            if (recebeDado.equals(funcionarios[i])){
                                recebeDado=JOptionPane.showInputDialog(null, 
                                        "O Salario deste funcionario é : " + formatter.format( Double.parseDouble(salarios[i]) )+"\n", 
                                        "Favor informar o novo salário : ", 
                                        JOptionPane.INFORMATION_MESSAGE); 
                                salarios[i] = recebeDado;
                                achou = true;
                                JOptionPane.showMessageDialog(null, 
                                        "Salario atualizado com sucesso!\n", 
                                        "OK", 
                                        JOptionPane.INFORMATION_MESSAGE);
                            } if ((i==funcionarios.length-1)&&(achou !=true)) {
                                JOptionPane.showMessageDialog(null, 
                                        "Funcionario nao encontrato!\n", 
                                        "Atualizar funcionário?", 
                                        JOptionPane.INFORMATION_MESSAGE); 
                            }

                    }
                }
        FileWriter arquivo = new FileWriter(".\\funcionarioSalario.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
            gravar.printf("-------------------- Listagem de Funcionarios e Salarios  --------------------\n");
        for (int i = 0 ; i<funcionarios.length ; i++){
            gravar.printf("| Nome    : %2s\n| Salario : %2s\n| ",  funcionarios[i] , salarios[i]);
            gravar.printf("------------------------------------------------------------------------------\n");
        }
        gravar.printf("\n* Final da Lista *");
        arquivo.close();

           
        }

        

    System.out.println("Saindo...");
    }
}
