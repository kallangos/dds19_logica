/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_7_vanderson;
import java.util.Scanner;

/**
 *
 * @author v.silva
 */
public class PROJETO_7_VANDERSON {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
               
        System.out.println("Entre com o peso(kg): ");
        float peso = ler.nextFloat();
        System.out.println("Entre com a altura(m) : ");
        float altura = ler.nextFloat();
        
        float imc ;
        
        imc=(peso/(altura*altura));
        
        if (imc<40){
            if ( imc>35 ){
                System.out.println("Obesidade Classe II !!!");
            }
            if (( imc>=30) & (imc<=34.9 )){
                System.out.println("Obesidade Classe I !!!");
            }
            if (( imc>=25) & (imc<=29.9 )){
                System.out.println("Excesso de Peso !!!");
            }
            if (( imc>=18.5) & (imc<=24.9 )){
                System.out.println("Peso Normal !!!");
            }
            if (imc<=18.4 ){
                System.out.println("Abaixo do Peso Normal !!!");
            }
        }
        else {
            System.out.println("Obesidade Classe III !!!");
        }
        
        
    }
}
