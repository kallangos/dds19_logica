/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios_01_a_05_02;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.InputMismatchException;

/**
 *
 * @author v.silva
 */
public class Exercicios_01_a_05_02 {

    public static void main(String[] args) throws IOException {
        String s = "";
        int numeros[] = new int[10];
        int soma = 0 ;
        DataInputStream dado;
        
        for (int i =0 ; i<=numeros.length-1 ; i++){
            System.out.println("Entre com o numero [" + (i+1) + "] da lista :");
            dado = new DataInputStream(System.in); //Inicia para pegar inforção do teclado.
            s = dado.readLine(); // lê uma linha do teclado
            
            try {
                numeros[i] = Integer.parseInt(s);//converte de string para float
            } catch (InputMismatchException Erro01) {
                System.out.println("Nao foi inserido um numero inteiro!");
                System.out.println("Erro: " + Erro01);
            } catch (NumberFormatException Erro02) {
                System.out.println("Nao foi inserido um numero inteiro!");
                System.out.println("Erro: " + Erro02);
            }
            
            
        }
        
        for (int i =0 ; i<=numeros.length-1 ; i++){
            if ( numeros[i]%2 != 0){
                soma+=numeros[i];
            }
        }
        
        System.out.println("A soma de todos numeros impares é : " + soma);

    }
}
