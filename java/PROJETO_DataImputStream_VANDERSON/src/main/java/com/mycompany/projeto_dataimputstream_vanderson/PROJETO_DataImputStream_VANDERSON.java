/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_dataimputstream_vanderson;
import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author v.silva
 */
public class PROJETO_DataImputStream_VANDERSON {

    public static void main(String[] args) throws IOException{
        String s = "";
        float notas[] = new float[4];
        float nota = 0;
        float media = 0 ;
        DataInputStream dado;
        
            for (int i =0 ; i<=notas.length-1 ; i++){
                System.out.println("entre com a nota " + (i+1) + " :");
                dado = new DataInputStream(System.in); //Inicia para pegar inforção do teclado.
                s = dado.readLine(); // lê uma linha do teclado
                notas[i] = Float.parseFloat(s);//converte de string para float
            }
        
            for (int i =0 ; i<= (notas.length)-1; i++){
                nota+= notas[i];
            }
        
        // Calcule a media das notas.
        media = nota/notas.length;
        System.out.println("Media = " + media);

       System.out.println("zzzz : " + (notas.length));

        
            
    }
}
