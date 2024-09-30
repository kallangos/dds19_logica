/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_14_revisao;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Thor
 */
public class EXERCICIO_14_REVISAO {
    public static String lerString(){
        Scanner ler = new Scanner(System.in);
        String resultado = "";
                resultado=ler.nextLine();

        return resultado ;
    }    
    public static float lerSalario(){
        Scanner ler = new Scanner(System.in);
        float resultado = 0;
            try {
                resultado=ler.nextFloat();
            } catch (NumberFormatException Erro01) {
                System.out.println("Opção INVALIDA!");
                System.out.println("Deve ser um numero FLOAT");
                System.out.println("ou INTERIRO");
                System.out.println("Erro: " + Erro01);
                System.exit(0);
            }
        return resultado ;
    }
    public static void main(String[] args) {
        boolean sair = false;
        float somaSalariosAtuais = 0, somaSalarioReagustados = 0, salarioAtual = 0, salarioReajustado = 0;
        Scanner ler = new Scanner(System.in);
        String nomeFuncionario = "";
        
        char[] nomeFuncionarioZ = new char[40];
        
        while (sair!=true){
            System.out.print("Entre com o nome do funcionario: ");
            nomeFuncionario = lerString();
            if (nomeFuncionario.equalsIgnoreCase("fim")){
                sair = true;
                System.out.println("Saindo...");
            }
           

            
            if (sair != true){
                System.out.print("Entre com salario: ");
                salarioAtual = lerSalario();
                    if (salarioAtual<=150.0){
                        salarioReajustado = (float) (salarioAtual * 1.25);
                        } else if ((salarioAtual>150.0)&&(salarioAtual<=300.0)){
                                salarioReajustado = (float) (salarioAtual * 1.2);
                            } else if ((salarioAtual>300.0)&&(salarioAtual<=600.0)){
                                    salarioReajustado = (float) (salarioAtual * 1.15);
                                } else if (salarioAtual>600.0){
                                        salarioReajustado = (float) (salarioAtual * 1.10);
                    }
                    System.out.printf("-----------------------------------------------\n");                    
                    System.out.println("FUNCIONARIO : " + nomeFuncionario );
                    System.out.printf("SALARIO REAJUSTADO : R$ %,10.2f \n",salarioReajustado );
                    somaSalariosAtuais+=salarioAtual;
                    somaSalarioReagustados+=salarioReajustado;
            }
            

        }
        System.out.printf("-----------------------------------------------\n");
        System.out.printf("SOMA DOS SALARIOs REAJUSTADOs : R$ %,10.2f \n",somaSalariosAtuais );
        System.out.printf("SOMA DOS SALARIOs REAJUSTADOs : R$ %,10.2f \n",somaSalarioReagustados );
        System.out.printf("Saindo...\n");

        
    }
}
