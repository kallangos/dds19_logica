/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicio_18_2;

import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Thor
 */
public class Exercicio_18_2 {

    public static void main(String[] args) {
        String recebeDado = "";
        double salarioBruto, salarioLiquido, 
               iRenda, iNss, sindicato, 
               ganhoHora, horasTrabalhadas =0;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        
        recebeDado =  JOptionPane.showInputDialog(null, 
                "Quanto funcionário ganha por hora? ", 
                "Calc. Salario Liquido", 
                JOptionPane.INFORMATION_MESSAGE);        
        ganhoHora = Double.parseDouble(recebeDado);
        
        recebeDado =  JOptionPane.showInputDialog(null, 
                "Quantas horas trabalhadas no mês? ", 
                "Calc. Salario Liquido", 
                JOptionPane.INFORMATION_MESSAGE);        
        horasTrabalhadas = Double.parseDouble(recebeDado);
        
        salarioBruto= ganhoHora*horasTrabalhadas;
        iRenda      = salarioBruto*0.11;
        iNss        = salarioBruto*0.08;
        sindicato   = salarioBruto*0.05;
        salarioLiquido = salarioBruto - iRenda - iNss - sindicato;
  
        JOptionPane.showMessageDialog(null, 
                "Salário Bruto           : " + formatter.format(salarioBruto)   + "\n" + 
                "Imp. de Renda         : " + formatter.format(iRenda)         + "\n" +
                "Desconto INSS        : " + formatter.format(iNss)           + "\n" + 
                "Sindicato de Renda: " + formatter.format(sindicato)      + "\n" +
                "Salário liquido         : " + formatter.format(salarioLiquido) + "\n" 
                ,"Calc. Salario Liquido",
                JOptionPane.INFORMATION_MESSAGE);    
       
    }
}
