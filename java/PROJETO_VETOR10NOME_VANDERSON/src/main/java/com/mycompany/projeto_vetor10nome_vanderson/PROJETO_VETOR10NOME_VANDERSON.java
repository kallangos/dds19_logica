/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_vetor10nome_vanderson;
import java.util.Scanner;

/**
 *
 * @author v.silva
 */
public class PROJETO_VETOR10NOME_VANDERSON {

    public static void armazenaNomes(String nomesVetor[]){
        Scanner ler = new Scanner (System.in);
        
        for (int i=0; i<nomesVetor.length ; i++){
            System.out.println("Entre com o nome [" + (i + 1) + "] da lista : ");
            nomesVetor [i] = ler.nextLine();
        }   
    }
    
    public static void listaNomes(String nomesVetor[]){
        System.out.println("Listando nomes armazenados");
        for (int i=0; i<nomesVetor.length ; i++){

            System.out.println(" [" + (i + 1) + "] : " + nomesVetor [i]);
        }
    }
    
    public static void main(String[] args) {
        int coluna = 10;
        int opcao = 2;
        String lista_nomes [] = new String [coluna];
        Scanner ler = new Scanner (System.in);
        
        armazenaNomes(lista_nomes);
        System.out.println("Deseja listar os nomes armazenados ? ");
        System.out.println("Digite (1) para SIM ou (2) para Sair : ");
        opcao = ler.nextInt();
        
        switch (opcao) {
            case 1 -> {
                listaNomes(lista_nomes);
            }
            case 2 -> {
            }
               
            default -> throw new AssertionError();
        }
            
    }
}
