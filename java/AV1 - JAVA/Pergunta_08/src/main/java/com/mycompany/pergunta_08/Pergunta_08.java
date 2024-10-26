/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_08;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author v.silva
 */
public class Pergunta_08 {

    public static void main(String[] args) throws IOException {
        String recebedado= "";
        int nNum;
        
            recebedado=JOptionPane.showInputDialog(null,
            "Entre com um numero inteiro :\n" ,
            "", JOptionPane.INFORMATION_MESSAGE);

            nNum = Integer.parseInt(recebedado);
            
            FileWriter arquivo = new FileWriter("C:\\Users\\Public\\TABUADA.TXT");
            PrintWriter gravar = new PrintWriter(arquivo);
            
            gravar.println("TABUADA DE " + recebedado);
            
            for (int i=1 ; i<=10 ; i++){
                gravar.println(i +"x "+recebedado + "=" + (i*nNum));
                //System.out.println(i +"  x "+recebedado + "=" + (i*nNum));
            }
            
        gravar.close();
            
    }
}
