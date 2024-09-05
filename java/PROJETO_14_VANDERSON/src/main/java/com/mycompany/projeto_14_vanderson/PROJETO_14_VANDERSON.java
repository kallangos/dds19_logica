/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_14_vanderson;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.InputMismatchException;


/**
 *
 * @author v.silva
 */
public class PROJETO_14_VANDERSON {

    public static void main(String[] args) throws IOException{
        String s = "";
        int linha = 1; int coluna = 3;
        int matriz5x5[][] = new int[linha][coluna];
        int matriz25[]= new int[linha*coluna];
        DataInputStream dado;
        int d = 0 ;
        int somaDiagonalPrincipal = 0 ;int somaDiagonaSecundaria = 0 ;

        for (int l =0 ; l<=linha-1 ; l++){

            for (int c =0 ; c<=coluna-1 ; c++){
                try {
                    System.out.println("Entre com o numero [" + (l+1) + "] [" + (c+1) + "] da lista :");
                    dado = new DataInputStream(System.in); //Inicia para pegar inforção do teclado.
                    s = dado.readLine(); // lê uma linha do teclado
                    matriz5x5[l][c] = Integer.parseInt(s);//converte de string para float
                } catch (InputMismatchException Erro01) {
                    System.out.println("Nao foi inserido um numero inteiro!");
                    System.out.println("Erro: " + Erro01);
                } catch (NumberFormatException Erro02) {
                    System.out.println("Nao foi inserido um numero inteiro!");
                    System.out.println("Erro: " + Erro02);
                }
            }

        }            

        System.out.println("-----------------------------------");
        System.out.println(" Exbindo valores armazenados na Matrix 5x5");
        for (int l =0 ; l<=linha-1 ; l++){
            for (int c =0 ; c<=coluna-1 ; c++){
                    System.out.print(" " + matriz5x5[l][c] + " ");
            }
            System.out.println(" ");
        }            

        System.out.println("-----------------------------------");
        System.out.println(" Calculando valores na diagonal");
        for (int l =0 ; l<=linha-1 ; l++){
                somaDiagonalPrincipal+=matriz5x5[l][d];
                d++; 
        }            
        System.out.println(" Exbindo soma na diagonal = " + somaDiagonalPrincipal);
        
        // transformando matrix em vetor para ordenação.
        d=0;
        for (int l =0 ; l<=linha-1 ; l++){
            for (int c =0 ; c<=coluna-1 ; c++){
                    matriz25[d]=matriz5x5[l][c];
                    System.out.print(" [" + matriz25[d] + "] ");
                    d++; 
            }
        }  
        // Ordenando vetor
        for (int i = 1 ; i < matriz25.length ; i++ ){
            int copia = 0; int indice = 0;
            copia = matriz25[i];
            indice = i;
            while ((indice > 0) & (matriz25[indice - 1] > copia)){
                matriz25[indice] = matriz25[indice - 1];
                indice--;
            }
            matriz25[ indice ] = copia;
        }
        System.out.println("-----------------------------------");
        System.out.println(" Exibindo vetor ordenado: ");
        for (int i = 0 ; i < matriz25.length ; i++ ){
            System.out.print( " [" + matriz25[i] + "] ");
        }
        
        
    }
}
