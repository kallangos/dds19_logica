/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_trycatch2_vanderson;
import java.util.Scanner;

/**
 *
 * @author v.silva
 */
public class PROJETO_TRYCATCH2_VANDERSON {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int numero, divisor ;
        
        System.out.println("Entre com o numero!");
        numero = ler.nextInt();
        System.out.println("Entre com o numero!");
        divisor = ler.nextInt();
            
        try {
            int resultado = numero/divisor;
            System.out.println("Valor Dividido: " + resultado );
        } catch  (NumberFormatException Erro01){
            System.out.println(" Erro ao Dividir : " + Erro01);
        }
        
    }
}
