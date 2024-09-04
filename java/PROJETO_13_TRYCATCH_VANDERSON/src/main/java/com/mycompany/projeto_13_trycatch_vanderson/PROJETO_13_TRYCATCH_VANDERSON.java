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
    
    public static int lerInteriro(){
        Scanner ler = new Scanner(System.in);
        int resultado = 0;
            try {
                resultado=ler.nextInt();
            } catch (InputMismatchException Erro01) {
                System.out.println("Nao foi inserido um numero inteiro!");
                System.out.println("Erro: " + Erro01);
            }
    return resultado;
    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean repetir = true;
        int vertorSize,opcao ;
        
        
        
        
        
        System.out.println("Quantos itens deseja na lista?");
        vertorSize = lerInteriro();
        int vetorTeste[] = new int[vertorSize];

        for (int i = 0 ; i<vetorTeste.length; i++){
            System.out.println("Entre com o iten [" + (i+1) +"] da lista : ");
            vetorTeste[i]=lerInteriro();
        }
            
        System.out.println("Qual operaçao matematica deseja realizar?");
        System.out.println("Digite:");
        System.out.println(" (1) Adiçao (2) Subtração ");
        System.out.println(" (3) Adiçao (4) Subtração ");
        System.out.print(" Qual sua opção? : ");

                opcao = lerInteriro();
                System.out.print(" Qual sua opção? = " + opcao);

/**                
                if (opcao=="1"){
                    
                } else if (opcao=="2"){
                    
                } else if ((opcao!="1") & (opcao!="2")){
                        System.out.println("Opçao invalida!!");
                        System.out.println("Saindo...");
                        break;
                }
            */
            
            
            /**
            try {
                vetor.add(ler.nextInt());
                repetir=true;
            } catch (InputMismatchException Erro01) {
                System.out.println("Erro nao foi inserido um numero inteiro!");
                System.out.println("Saindo...");
                repetir=false;
            }
            */
            
        
        
    }
}
