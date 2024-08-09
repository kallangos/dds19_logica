/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_8_vanderson;
import java.util.Scanner;

/**
 *
 * @author v.silva
 */
public class PROJETO_8_VANDERSON {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);        
        
        System.out.println("Quantas medalhas de OURO conquistadas : ");
        int ouro = ler.nextInt();
        System.out.println("Quantas medalhas de PRATA conquistadas : ");
        int prata = ler.nextInt();
        System.out.println("Quantas medalhas de BRONZE conquistadas : ");
        int bronze = ler.nextInt();
        
        if ((ouro>=10) & (ouro+prata+bronze<30)){
            System.out.println("Otimo desempenho !!!");
        }
            else if ((ouro<10) & (ouro>5)) {
                System.out.println("Bom desempenho !!!");
            }
            else if ((ouro>=5) & (ouro+prata+bronze>30)) {
                System.out.println("Desempenho Extraordinario !!!");
            }
            else if ((ouro>=5) & (ouro+prata+bronze>=20)) {
                System.out.println("Desempenho Regular !!!");
            }
            else if ((ouro<5) & (ouro+prata+bronze>=20)) {
                System.out.println("Desempenho Fraco !!!");
            }

    }
}
