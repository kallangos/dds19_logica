/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_9_vanderson;

import java.util.Queue;
import java.util.Random;

/**
 *
 * @author Thor
 */
public class PROJETO_9_VANDERSON {
    
    static class semaforo {
        private int timer; // Tempo total no ciclo atual
        private String state; // Estado do semáforo (verde, amarelo, vermelho)

        
        public semaforo() {
            Random randomico = new Random();
            this.timer = randomico.nextInt(79);
            this.state = "vermelho";
            
            //int startState = randomico.nextInt(79);
        }

        public void updateState() {
            timer++;
            // Ciclo: Verde (30s), Amarelo (5s), Vermelho (45s)
            if (timer <= 30) {
                state = "verde";
            } else if (timer <= 35) {
                state = "amarelo";
            } else if (timer <= 80) {
                state = "vermelho";
            } else {
                timer = 1;
                state = "verde";
            }
        }

        public String getState() {
            return state;
        }
    }
    
    public static void main(String[] args) {
        semaforo semaforo1 = new semaforo();
        semaforo semaforo2 = new semaforo();
        semaforo semaforo3 = new semaforo();
        int filaCerrosSemaforo1, filaCerrosSemaforo2, filaCerrosSemaforo3;
                
        long startTimer = 0;
        long endTimer = 0 ;
        startTimer = System.currentTimeMillis();

        for (int i=0 ; i<=600 ; i++){
            semaforo1.updateState();
            semaforo2.updateState();
            semaforo3.updateState();
        System.out.println("Semaforo 01 = "+ semaforo1.state + " - Semaforo 01 = "+ semaforo2.state + " - Semaforo 03 = "+ semaforo3.state);
        System.out.println("Semaforo 01 = "+ semaforo1.timer + " - Semaforo 01 = "+ semaforo2.timer + " - Semaforo 03 = "+ semaforo3.timer);
        }
        
        
/*        
        endTimer = System.currentTimeMillis();
        System.out.println("End Time   = " + endTimer);
        System.out.println("---------");
        System.out.println("Tempo Decorrido = " + (endTimer - startTimer));
        */
    }
}
