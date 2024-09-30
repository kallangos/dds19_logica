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
            try {
                resultado=ler.nextLine();
            } catch (InputMismatchException Erro01) {
                System.out.println("Opção INVALIDA!");
                System.out.println("Nao foi inserido um numero INTEIRO!");
                System.out.println("Erro: " + Erro01);
                System.exit(0);
            }
        return resultado ;
    }    
    public static int lerSalario(){
        Scanner ler = new Scanner(System.in);
        int resultado = 0;
            try {
                resultado=ler.nextInt();
            } catch (InputMismatchException Erro01) {
                System.out.println("Opção INVALIDA!");
                System.out.println("Nao foi inserido um numero INTEIRO!");
                System.out.println("Erro: " + Erro01);
                System.exit(0);
            }
        return resultado ;
    }
    public static void main(String[] args) {
        boolean sair = true;
        float somaSalariosAtuais, somaSalarioReagustados;
        Scanner ler = new Scanner(System.in);
        String nomeFuncionario;
        
        
        while (sair!=false){
            System.out.print("Entre com o nome do funcionario: ");
            nomeFuncionario = lerString();
            System.out.println("|  "  + nomeFuncionario.toUpperCase());
            if (nomeFuncionario.toUpperCase()=="FIM"){
            sair=true;
            System.out.println("SAI AQUI");
            }
        }
        System.out.println("SAI");
    }
}
