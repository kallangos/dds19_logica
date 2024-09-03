/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_trycatch_vanderson;
import java.util.Scanner;

/**
 *
 * @author v.silva
 */
public class PROJETO_TRYCATCH_VANDERSON {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        String texto = "a";
        String valorString = "4.2"; // cvalor numeroco como string
        
        try {
            int valorInteiro = Integer.parseInt(valorString);
            System.out.println("Valor Inteiro: " + valorInteiro );
        } catch  (NumberFormatException Erro01){
            System.out.println(" Erro ao converter : " + Erro01);
        }
        
        
    }
}
