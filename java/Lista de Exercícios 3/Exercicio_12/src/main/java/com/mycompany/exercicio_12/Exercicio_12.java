/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_12;

import java.util.Scanner;

/**
 *
 * @author v.silva
 * Cálculo de Números Primos
 * O time de segurança solicitou que você crie uma função que verifique se um número é primo, 
 * para uso em algoritmos de criptografia.
 */
public class Exercicio_12 {

    static String verificaPrimo(int numero){
        String resultado = "é primo";
        
        if (numero<=1){
            resultado = "não é primo";
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    resultado = "não é primo";
                    break; // Se encontrar um divisor, não é primo
                }
            }
        }
    return resultado;
    }
            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
       
        System.out.println("Entre com o numero que deseja verificar: ");
        valor = sc.nextInt();
        
        System.out.println("Seu numero " + verificaPrimo(valor) + "." );
        
    }
}
