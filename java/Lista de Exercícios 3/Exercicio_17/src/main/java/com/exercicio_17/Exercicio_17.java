/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicio_17;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Thor
 * A TechSolve está desenvolvendo um sistema de cadastro para novos usuários. 
 * Você deve implementar uma solução que armazene nome, idade e e-mail, 
 * e exiba os usuários cadastrados e export um TXT.
 * 
 */
public class Exercicio_17 {

    public static void main(String[] args) throws IOException {
        String recebeDado = "";
        String listaGeral = "";
        String [][] nUsers;
/*
        FileWriter
        PrintWriter;
                */
        recebeDado =  JOptionPane.showInputDialog(null, "Quantos usuarios deseja cadastrar?", "Cad User", JOptionPane.INFORMATION_MESSAGE);
        System.out.print(recebeDado);
        nUsers = new String[Integer.parseInt(recebeDado)][3];
        
        for (int i = 0 ; i<nUsers.length ; i++){
            
                nUsers[i][0]=JOptionPane.showInputDialog(null, 
                        "Entre com o nome do " + (i+1)+"º usuario : ", 
                        "Cad User - Cadastrando "+(i+1)+"º Usuario", 
                        JOptionPane.INFORMATION_MESSAGE);    
                nUsers[i][1]=JOptionPane.showInputDialog(null, 
                        "Entre com a idade do " + (i+1)+"º usuario : ", 
                        "Cad User - Cadastrando "+(i+1)+"º Usuario", 
                        JOptionPane.INFORMATION_MESSAGE);  
                nUsers[i][2]=JOptionPane.showInputDialog(null, 
                        "Entre com o email do " + (i+1)+"º usuario : ", 
                        "Cad User - Cadastrando "+(i+1)+"º Usuario", 
                        JOptionPane.INFORMATION_MESSAGE);    
        }
        
        FileWriter arquivo = new FileWriter(".\\nomeArquivo.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        
        gravar.printf("---------------------------- Listagem de Usuários ----------------------------\n");
        for (int i = 0 ; i<nUsers.length ; i++){
            gravar.printf("| Nome : %2s   | Idade : %2s   | Email : %2s\n",  nUsers[i][0] , nUsers[i][1] , nUsers[i][2]);
            listaGeral = listaGeral + "| Nome : " + nUsers[i][0] + "   | Idade : " + nUsers[i][1] + "   | Email : " + nUsers[i][2]+ "\n";
        }
        gravar.printf("\n----------------------------    Final da Lista    ----------------------------");
        arquivo.close();
        
        
        JOptionPane.showMessageDialog(null, "Usuarios cadastrados : \n" + listaGeral, "Cad User", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
