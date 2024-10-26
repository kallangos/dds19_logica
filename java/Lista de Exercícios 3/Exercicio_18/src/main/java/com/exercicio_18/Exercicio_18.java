/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicio_18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Thor
 */
public class Exercicio_18 {

    public static void main(String[] args) throws IOException {
        String recebeDado = "";
        double calcFerias =0;
        String [] funcionarios;
        String [] salarios;
        String [] ferias;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        


/*
        FileWriter
        PrintWriter;
                */
        recebeDado =  JOptionPane.showInputDialog(null, "Quantos funcionários deseja cadastrar?", "Cad Funcionário", JOptionPane.INFORMATION_MESSAGE);
        System.out.print(recebeDado);
        funcionarios = new String[Integer.parseInt(recebeDado)];
        salarios = new String[Integer.parseInt(recebeDado)];
        ferias = new String[Integer.parseInt(recebeDado)];
        
        for (int i = 0 ; i<funcionarios.length ; i++){
            
                funcionarios[i]=JOptionPane.showInputDialog(null, 
                        "Entre com o NOME do " + (i+1)+"º funcionário : ", 
                        "Cad "+(i+1)+"º funcionário", 
                        JOptionPane.INFORMATION_MESSAGE);  
                salarios[i]=JOptionPane.showInputDialog(null, 
                        "Entre com o SALARIO do " + (i+1)+"º funcionário : ", 
                        "Cad "+(i+1)+"º salario", 
                        JOptionPane.INFORMATION_MESSAGE);  
                
                calcFerias = Double.parseDouble(salarios[i]) + Double.parseDouble(salarios[i])/3;
                salarios[i] = formatter.format( Double.parseDouble(salarios[i]) );    
                ferias[i] = formatter.format(calcFerias);    
                
                
                JOptionPane.showMessageDialog(null, 
                        "O funcionario "+ funcionarios[i] + " recebera : \n" 
                        + ferias[i] + " de férias (sal. + bonus 1/3)", "Extrato", 
                        JOptionPane.INFORMATION_MESSAGE);
        }
        
        FileWriter arquivo = new FileWriter(".\\funcionarioFerias.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        gravar.printf("---------------------------- Listagem de Usuários ----------------------------\n");
        for (int i = 0 ; i<funcionarios.length ; i++){
            gravar.printf("| Nome    : %2s\n| Salario : %2s\n| Férias  : %2s\n",  funcionarios[i] , salarios[i], ferias[i]);
            gravar.printf("------------------------------------------------------------------------------\n");
        }
        gravar.printf("\n* Final da Lista *");
        arquivo.close();
        
        
        
    }
}
