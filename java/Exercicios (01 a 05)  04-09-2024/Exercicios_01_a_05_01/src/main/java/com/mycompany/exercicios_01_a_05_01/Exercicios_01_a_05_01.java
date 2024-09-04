/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios_01_a_05_01;
import java.io.DataInputStream;
import java.io.IOException;


/**
 *
 * @author v.silva
 */
public class Exercicios_01_a_05_01 {

    public static void main(String[] args) throws IOException{
        String s = "";
        float numeros[] = new float[5];
        DataInputStream dado;
        
        for (int i =0 ; i<=numeros.length-1 ; i++){
            System.out.println("Entre com o numero [" + (i+1) + "] :");
            dado = new DataInputStream(System.in); //Inicia para pegar inforção do teclado.
            s = dado.readLine(); // lê uma linha do teclado
            numeros[i] = Float.parseFloat(s);//converte de string para float
        }
        
        for (int i =0 ; i<=numeros.length-1 ; i++){
            if ( numeros[i]%2 == 0){
                System.out.println("Listando Pares [" + (i+1) + "] :" + numeros[i]);
            }
        }
        

    }
}
