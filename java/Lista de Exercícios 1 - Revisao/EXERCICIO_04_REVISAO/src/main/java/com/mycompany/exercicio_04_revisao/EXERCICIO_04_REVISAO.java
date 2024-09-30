/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_04_revisao;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
    Escreva um programa que leia três números reais e informe se eles constituem os lados de um triângulo.
   Em caso afirmativo, informe se o triângulo é equilátero, isósceles ou escaleno. Para que três números
   formem um triângulo deve ocorrer que a soma dos dois lados menores deve ser maior que o lado maior.
   Para resolver essa questão verifique como funcionam os operadores lógicos and e or.
   * 
 */
public class EXERCICIO_04_REVISAO {
    public static float lerLadoTriangulo(int i){
        float resultado = 0;
        String entraDado = "";
            try {
                entraDado = JOptionPane.showInputDialog(
                null,
                "Entre com o "+ (i+1) + "º lado do triangulo: ",
                "Identificar lados de um triangulo",
                JOptionPane.INFORMATION_MESSAGE
                );
                resultado = Float.parseFloat(entraDado);
                
            } catch (NumberFormatException Erro01) {
                System.out.println("Opção INVALIDA!");
                System.out.println("Deve ser um numero FLOAT");
                System.out.println("ou INTERIRO");
                System.out.println("Erro: " + Erro01);
                System.exit(0);
            }
        return resultado ;
    }

    public static void main(String[] args) throws IOException{
        float[] lados = new float[3];
        float somaLadoMenor = 0;
        String entraDado = "";
        
        for (int i=0 ; i<=2 ; i++){
            lados[i] = lerLadoTriangulo(i);
        }
        

        if ( lados[0] < ( lados[1]+lados[2] ) && ( lados[1] < ( lados[0]+lados[2] )) && ( lados[2] < ( lados[0]+lados[1] ))){
            if (somaLadoMenor>(somaLadoMenor-(lados[0]+lados[1]+lados[2]))){
                if ( lados[0]==lados[1] && lados[1]==lados[2] ){
                    JOptionPane.showMessageDialog(
                    null,
                    "Seu Triangulo é um equilátero",
                    "Identificando um triangulo",
                    JOptionPane.INFORMATION_MESSAGE
                    );
                } else if (lados[0]==lados[1] || lados[1]==lados[2] || lados[0]==lados[2]){
                    JOptionPane.showMessageDialog(
                    null,
                    "Seu Triangulo é um isóceles",
                    "Identificando um triangulo",
                    JOptionPane.INFORMATION_MESSAGE
                    );
                }
                if ((lados[0]!=lados[1])&&(lados[1]!=lados[2])&&(lados[0]!=lados[2])){
                    JOptionPane.showMessageDialog(
                    null,
                    "Seu Triangulo é um escaleno",
                    "Identificando um triangulo",
                    JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }   
        } else {
                JOptionPane.showMessageDialog(
                null,
                "Os lados inseridos nao formam um triangulo",
                "Identificar lados de um triangulo",
                JOptionPane.INFORMATION_MESSAGE
                );
        }

    }
}
