/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_14_vanderson;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;


/**
 *
 * @author v.silva
 */
public class PROJETO_14_VANDERSON {

    public static void main(String[] args) throws IOException{
        Random nAleatorio = new Random();
        DataInputStream dado;
        String s = "";
<<<<<<< HEAD
=======
        double raizQuadrada = 0;
        int d = 0 ;
>>>>>>> b0ad37286db5f04782d1a09da7953f826b9128d5
        int linha = 5; int coluna = 5;
        int matriz5x5[][] = new int[linha][coluna];
        int matriz25[]= new int[linha*coluna];
        int matriz25countRep[]= new int[linha*coluna];
        int somaLinhas[]= new int[linha];
        int somaColunas[]= new int[coluna];
        int somaDiagonalPrincipal = 0 ;int somaDiagonaSecundaria = 0 ;
<<<<<<< HEAD
        Random nAleatorio = new Random();
=======
        
>>>>>>> b0ad37286db5f04782d1a09da7953f826b9128d5
        

        for (int l =0 ; l<=linha-1 ; l++){

            for (int c =0 ; c<=coluna-1 ; c++){
                try {
<<<<<<< HEAD
                    // System.out.println("Entre com o numero [" + (l+1) + "] [" + (c+1) + "] da lista :");
                    // dado = new DataInputStream(System.in); //Inicia para pegar inforção do teclado.
                    // s = dado.readLine(); // lê uma linha do teclado
                    // matriz5x5[l][c] = Integer.parseInt(s);//converte de string para float
                    matriz5x5[l][c] = nAleatorio.nextInt(30)+1;
=======
                    
                    System.out.println("Entre com o numero [" + (l+1) + "] [" + (c+1) + "] da lista :");
                    dado = new DataInputStream(System.in); //Inicia para pegar inforção do teclado.
                    s = dado.readLine(); // lê uma linha do teclado
                    matriz5x5[l][c] = Integer.parseInt(s);//converte de string para float
                    
                    //matriz5x5[l][c] = nAleatorio.nextInt(30)+1;
>>>>>>> b0ad37286db5f04782d1a09da7953f826b9128d5
                } catch (InputMismatchException Erro01) {
                    System.out.println("Nao foi inserido um numero inteiro!");
                    System.out.println("Erro: " + Erro01);
                } catch (NumberFormatException Erro02) {
                    System.out.println("Nao foi inserido um numero inteiro!");
                    System.out.println("Erro: " + Erro02);
                }
            }

        }            

        System.out.println(" -----------------------------------");
        System.out.println(" Exbindo valores armazenados na Matrix 5x5");
        for (int l =0 ; l<=linha-1 ; l++){
            for (int c =0 ; c<=coluna-1 ; c++){
                    //System.out.print(" " + matriz5x5[l][c] + " ");
                    System.out.printf(" %2d ", matriz5x5[l][c] );
            }
            System.out.println(" ");
        }            

    
        // transformando matrix em vetor para ordenação.
        d=0;
        for (int l =0 ; l<=linha-1 ; l++){
            for (int c =0 ; c<=coluna-1 ; c++){
                    matriz25[d]=matriz5x5[l][c];
                    d++; 
            }
        }  
        // Ordenando vetor
        int copia = 0;
        for (int j = 0 ; j<25 ; j++){
            for (int i = 0 ; i<24 ; i++){
                if ( matriz25[i]>matriz25[i+1]){
                    copia = matriz25[i];
                    matriz25[i]=matriz25[i+1];
                    matriz25[i+1] = copia;
                }
            }
        }
<<<<<<< HEAD

        System.out.println("-----------------------------------");
        System.out.println(" Exibindo vetor ordenado: ");
        for (int i = 0 ; i < matriz25.length ; i++ ){
            if ( (i%coluna)==0 ){
                System.out.println("");
            }
            System.out.print( " [" + matriz25[i] + "] ");
            }
        }
        
        
=======
        // Transportando vetor ordenado para matriz
        d=0;
        for (int l =0 ; l<=linha-1 ; l++){
            for (int c =0 ; c<=coluna-1 ; c++){
                    matriz5x5[l][c]=matriz25[d];
                    d++; 
            }
        }  
        // Exibindo Matriz ordenanda
        System.out.println(" -----------------------------------");
        System.out.println(" Exibindo matriz ordenada: ");
        for (int l =0 ; l<=linha-1 ; l++){
            for (int c =0 ; c<=coluna-1 ; c++){
                    //System.out.print(" " + matriz5x5[l][c] + " ");
                    System.out.printf(" %2d ", matriz5x5[l][c] );
            }
            System.out.println(" ");
        } 
        
        // Calculando a soma de cada coluna e linha
        System.out.println(" -----------------------------------");
        System.out.println(" Exibindo a soma das colunas e linhas: ");

        for (int l =0 ; l<=linha-1 ; l++){
            for (int c =0 ; c<=coluna-1 ; c++){

                    //System.out.printf(" %2d ", matriz5x5[l][c] );
                    somaColunas[c]+=matriz5x5[l][c];
                    somaLinhas[l]+=matriz5x5[l][c];
            }
            //System.out.println(" ");
        } 
        for (int l = 0 ; l<=linha-1 ; l++){
            System.out.printf(" Sonha da linha [" + l + "] = %2d \n", somaLinhas[l] );
        }
        for (int c = 0 ; c<=coluna-1 ; c++){
            System.out.printf(" Sonha da Coluna [" + c + "] = %2d \n", somaColunas[c] );
        }
        
        
        // Contando quais numeros repetiram
        for (int i = 0 ; i<=(linha*coluna-1) ; i++){

            for (int j = 0 ; j<=(linha*coluna-1) ; j++){
                if (matriz25[i]==matriz25[j]){
                    matriz25countRep[i]+=1;
                }
            }
        }
        // Exibindo na tela quantas vezes um numero se repetiu
        System.out.println(" -----------------------------------");
        System.out.println(" Exibindo o numero de vezes que um numero apareceu: ");

        for (int i = 1 ; i<=(linha*coluna-1) ; i++){
        //    if ( (matriz25countRep[i-1]>1) & (matriz25countRep[i]!=matriz25countRep[i-1])){
            if ( (matriz25countRep[i]!=matriz25countRep[i-1]) & (matriz25countRep[i-1]>1)){
                System.out.printf(" O numero %2d se repetiu %2d vezes . \n", matriz25[i-1], matriz25countRep[i-1] );    
            }
        }

        // Calculando a soma dos valores nas diagonais
        d=0;
        System.out.println(" -----------------------------------");
        System.out.println(" Calculando valores nas diagonais");
        for (int l =0 ; l<=linha-1 ; l++){
                somaDiagonalPrincipal+=matriz5x5[l][d];
                somaDiagonaSecundaria+=matriz5x5[4-l][d];
                d++; 
        }            
        System.out.println(" Exbindo soma na diagonal = " + somaDiagonalPrincipal);
        System.out.println(" Exbindo soma na diagonal = " + somaDiagonaSecundaria);
        
        // verificando se os numeros são primos e alterando na mesma posiçao da matrix por -1
        System.out.println(" -----------------------------------");
        System.out.println(" Substituindo numeros primos por -1");
        for (int l =0 ; l<=linha-1 ; l++){
            for (int c =0 ; c<=coluna-1 ; c++){
                
                raizQuadrada = Math.sqrt(matriz5x5[l][c]);
                d=0;
                
                for (int i = 1; i <= matriz5x5[l][c]; i++) {
                    if (matriz5x5[l][c] % i == 0){
                        d++;
                    } else if ((matriz5x5[l][c] % i != 0) & (d==1)) {
                        matriz5x5[l][c]=-1;
                    } 
                    
                }
                    System.out.printf(" %2d ", matriz5x5[l][c] );
            }
            System.out.println(" ");
        } 
        
        }
        
        
>>>>>>> b0ad37286db5f04782d1a09da7953f826b9128d5
    
}
