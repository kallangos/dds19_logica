/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_vanderson;
import java.util.Scanner;

/**
 *
 * @author v.silva
 */
public class PROJETO_12_VANDERSON {
    static int nDicas = 5;
    static String nomeFilme = "";
    static String pistasFilme [] = new String [nDicas];
    
    public static void recebeFilmeDicas(String dicas[]){
        Scanner lerFilme = new Scanner (System.in);
        Scanner lerDica = new Scanner (System.in);
        
        System.out.println("Entre com o nome do filme : ");
        nomeFilme = lerFilme.nextLine();
        
        for (int i=0; i<dicas.length ; i++){
            System.out.println("Entre com a dica [" + (i + 1) + "] : ");
            dicas [i] = lerDica.nextLine();
        }   
    }
    public static void advinhaFilme(){
        int n = 0;
        int chances = 5;
        boolean  acertou = true ;
        String tentativa = "";
        Scanner lerFilme = new Scanner (System.in);

        while (acertou){
            
            System.out.println("Qual o nome do filme ? : ");
            System.out.println("Dica [" + pistasFilme[n] + "] : " );
            tentativa = lerFilme.nextLine();
            
            if (tentativa.equals(nomeFilme)){
                System.out.println("ACERTOU!!!");
                acertou=false;
            } else{
                System.out.println("ERROU!!!");
                n++;
                if (n>=chances){
                    System.out.println("GameOver, usou todas as discas disponiveis !!!");
                    break;
                }
            }
        }        
 
    }
    
    public static void main(String[] args) {
        
                
        recebeFilmeDicas(pistasFilme);
        advinhaFilme();
        
    }
    
}
