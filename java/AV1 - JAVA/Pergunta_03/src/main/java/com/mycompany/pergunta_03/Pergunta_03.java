/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_03;

import javax.swing.JOptionPane;

/**
 *
 * @author v.silva
 */
public class Pergunta_03 {

    public static void main(String[] args) {
        int qdt_expresso = 0, qdt_capuccino = 0, qdt_cf_leite = 0 ;
        String recebeDado = "";
        String opcao = "";
        
        while (opcao!="4"){
            recebeDado = JOptionPane.showInputDialog(null,
                   "Informe qual cafe vc deseja :\n" + 
                    "(1) Café expresso\n"+
                    "(2) Café capuccino \n"+
                    "(3) Leite com café\n"+
                    "(4) Totalizar\n"
                    , "", JOptionPane.INFORMATION_MESSAGE);
            opcao = recebeDado;
            if (opcao.equals("1")){
                qdt_expresso++;
            } else if (opcao.equals("2")){
                qdt_capuccino++;
            } else if (opcao.equals("3")){
                qdt_cf_leite++;
            } else if (opcao.equals("4")){
                JOptionPane.showMessageDialog(null,
                    "Totalizando as Vendas :\n" + 
                    "Café expresso: " + qdt_expresso +" unidades |  Valor Total: R$ " + (qdt_expresso*0.75) +" \n"+
                    "Café capuccino "+ qdt_capuccino +" unidades |  Valor Total: R$ " + (qdt_capuccino*1) +" \n"+
                    "Leite com café: "+ qdt_cf_leite +" unidades |  Valor Total: R$ " + (qdt_cf_leite*1.25) +" \n"
                    , "", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Opcão invalida, favor informar uma opcao valida!", "", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
            
        }
        
    }
}
