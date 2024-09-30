/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_16_revisao;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * 16. Uma empresa precisa realizar uma estatística do salário de seus funcionários. Para isto precisa de um
programa que leia uma lista contendo os salários dos funcionários da empresa, e imprima quantos
funcionários ganham salário acima da média. Sabe-se que a empresa possui 50 funcionários.
• Considerando que não há um número fixo de 50 funcionários, o programa pergunta no início quantos
funcionários possui a empresa e reliza o restante do processo.
 */
public class EXERCICIO_16_REVISAO {
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
    
    public static void main(String[] args) throws IOException{
        int listaMax = 0;
        float somatorioSalario = 0, mediaSalarial = 0;
        Random random = new Random();
        

        System.out.println("------------------------------------------------");
        System.out.print("Quantos funcionarios existem na empresa? : ");
        listaMax = lerInteiro();
        float salarioAleatorio[] = new float[listaMax];
        
        // Gerando lista de salarios Aleatoreamente.
        for (int i = 0 ; i<salarioAleatorio.length ; i++){
            salarioAleatorio[i] = (float) Math.floor(random.nextFloat(5000)+500);
            somatorioSalario+=salarioAleatorio[i];
            System.out.printf("Funcionario [" + i+1 + "] Salario = R$ %,10.2f \n",salarioAleatorio[i] );
        }
        mediaSalarial = somatorioSalario/listaMax;
        System.out.println("------------------------------------------------");
        System.out.printf("Soma dos salarios = R$ %,10.2f \n",somatorioSalario );
        System.out.printf("Media salarial de : R$ %,10.2f \n",mediaSalarial );
        System.out.println("------------------------------------------------");
        System.out.printf("Funcionarios com salarios acima da media: \n");
        
        for (int i = 0 ; i<salarioAleatorio.length ; i++){
            if (salarioAleatorio[i]>mediaSalarial){
            System.out.printf("Funcionario [" + i+1 + "] Media salarial de : R$ %,10.2f \n",salarioAleatorio[i] );
            }
        }
        
    }
}
