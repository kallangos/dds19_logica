/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_13_trycatch_vanderson;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Thor
 */
public class PROJETO_13_TRYCATCH_VANDERSON {

    public static int calculadora(int numA, int numB, int operacao){
        int resultado = 0;
        try {
            if (operacao==1){
                resultado =  numA + numB;
            } else if (operacao==2){
                resultado =  numA - numB;
            } else if (operacao==3){
                resultado =  numA * numB;
            } else if (operacao==4){
                resultado =  numA / numB;
            } else if ((operacao<0) & (operacao>4)){
                    System.out.println("Opçao invalida!!");
                    System.out.println("Saindo...");
                    System.exit(0);
            }
                       
            } catch (InputMismatchException Erro01) {
                System.out.println("Opção INVALIDA!");
                System.out.println("Nao foi inserido um numero INTEIRO!");
                System.out.println("Erro: " + Erro01);
                System.exit(0);
                
            } catch (ArithmeticException Erro01) {
                System.out.println("Tentativa de realizar divião por ZERO!");
                System.out.println("Erro: " + Erro01);
                System.exit(0);
                
            }
        return resultado ;
    }
    
    public static int lerInteiro(){
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
        Scanner ler = new Scanner(System.in);
        int calcA = 0 ; int calcB = 0;
        boolean repetir = true;
        int vertorSize,opcao ;
        int resultados[] = new int[1];
        
        System.out.print(" Quantos itens deseja na lista? : ");
        vertorSize = lerInteiro();
        int vetorTeste[] = new int[vertorSize];
        
        System.out.println(" ----------------------------------------");
        for (int i = 0 ; i<vetorTeste.length; i++){
            System.out.print(" Entre com o iten [" + (i+1) +"] da lista : ");
            vetorTeste[i]=lerInteiro();
        }
        
        System.out.println("");
        System.out.println(" ----------------------------------------");
        System.out.println(" Qual operaçao matematica deseja realizar?");
        System.out.println(" Digite:");
        System.out.println("  (1) Adição (2) Subtração ");
        System.out.println("  (3) Multiplicação (4) Divisão ");
        System.out.print(" Qual sua opção? : ");
        opcao = lerInteiro();

        // Listando itens no vetor
        System.out.println("");
        System.out.println(" ----------------------------------------");
        System.out.println(" Listando valores armazenados no vetor");
        for (int i =0 ; i<=vetorTeste.length-1 ; i++){
            System.out.printf(" Valor na posição [%1d] do vetor : %1d \n", i+1, vetorTeste[i]);
        }
        
        System.out.println(" ----------------------------------------");
        System.out.print(" Indique uma primeira posiçao no vertor que deseja processar :");
        calcA = lerInteiro()-1;
        System.out.print(" Indique uma segunda posiçao no vertor que deseja processar :");
        calcB = lerInteiro()-1;

        try {
            int validarIndice = 0 ;
            validarIndice = vetorTeste[calcA];
            validarIndice = vetorTeste[calcB];
            } catch (ArrayIndexOutOfBoundsException Erro01) {
                System.out.println("Erro FATAL, tentou acessar uma posicao fora do vetor");
                System.out.println("Erro: " + Erro01);
                System.exit(0);
        }

        resultados[0]=calculadora(vetorTeste[calcA],vetorTeste[calcB], opcao);
        System.out.println(" ----------------------------------------");
        System.out.printf(" O valor da operaçao entre as posições (%1d) e (%1d) no vetor é igual a : %1d \n", calcA+1,calcB+1, resultados[0]);
        
            
        
        
    }
}
