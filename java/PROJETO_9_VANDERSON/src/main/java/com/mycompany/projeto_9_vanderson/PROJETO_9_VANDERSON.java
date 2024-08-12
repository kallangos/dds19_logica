/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_9_vanderson;

import java.util.Random;
/**
 *
 * @author v.silva
 */
public class PROJETO_9_VANDERSON {

    static class movimentoCarros {
        private int carrosSemaforo; // Contador de carros no semáforos
        private int carrosCongestionados; // Contador de carros fora da interseção 
        private int carrosPassados; // Contador que passaram pelo semaforo 
        private int tempoEspera; // Contador de tempo em espera 

        
        public movimentoCarros() {
            Random randomico = new Random();
            this.carrosSemaforo = randomico.nextInt(9);
            this.carrosCongestionados = 0;
            this.carrosPassados = 0;
            this.tempoEspera = 0;
        }

        public void addCarroSemaforo() {
            Random randCars = new Random();
            int novosCarros = randCars.nextInt(5);
            if (carrosSemaforo>=10){
               carrosCongestionados=carrosCongestionados + novosCarros; 
            } else {
               carrosSemaforo= carrosSemaforo + novosCarros;
            }
        }
        public void passaCarro() {
            carrosSemaforo--;
            carrosPassados++;
            if ((carrosSemaforo<=9)& (carrosCongestionados>=1)){
                carrosCongestionados--;
                carrosSemaforo++;
            }
        }
        public void addCarroCongestionamento() {
            carrosCongestionados++;
        }
        public void addtempoEspera() {
            tempoEspera=tempoEspera+carrosSemaforo+carrosCongestionados;
        }
        public int getCarroSemaforo() {
            return carrosSemaforo;
        }        
        public int getCarrosPassados() {
            return carrosPassados;
        }        
        public int getCarrosCongestionados() {
            return carrosCongestionados;
        }    
        public int getTempoEspera() {
            return tempoEspera;
        }    

    }
    
    static class semaforo {
        private int timer; // Tempo total no ciclo atual
        private String state; // Estado do semáforo (verde, amarelo, vermelho)
        
        public semaforo() {
            Random randomico = new Random();
            this.timer = randomico.nextInt(79);
            this.state = "vermelho";
        }

        public void updateState() {
            this.timer++;
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
        movimentoCarros movimentoCarros1 = new movimentoCarros();
        movimentoCarros movimentoCarros2 = new movimentoCarros();
        movimentoCarros movimentoCarros3 = new movimentoCarros();

        //startTimer = System.currentTimeMillis();

        // Cabeçalho do Relatorio Final do App
        System.out.println("----------------------------------------------------");
        System.out.println(" Legenda :");
        System.out.println(" CNS = Carro no Semaforo");
        System.out.println(" CPS = Carro parado no Semaforo");
        System.out.println(" CNC = Carro no congestionamento");
        System.out.println("----------------------------------------------------");
        System.out.println("  Semaforo 01 |  Estado  | CNS | CPS | CNG | Segundo  ");       
        System.out.println("----------------------------------------------------");
        // Iniciando a simulaçao de tempo para processar os transito nos semaforos.
        for (int i=0 ; i<=600 ; i++){

            // Atualiza o estado do semaforo de acordo com o tempo de simulaçao.
            semaforo1.updateState();
            semaforo2.updateState();
            semaforo3.updateState();
            
            // Adiciona um carro em cada semaforo a cada 15 Segundos.
            if ( i % 15 == 0 ){
                movimentoCarros1.addCarroSemaforo();
                movimentoCarros2.addCarroSemaforo();
                movimentoCarros3.addCarroSemaforo();
            }
            
            // Verifica se o semaforo esta Amarelo|Vermelho e contabiliza o tempo de espera.
            if ((semaforo1.state == "amarelo" | semaforo1.state == "vermelho"  ) & (movimentoCarros1.getCarroSemaforo()>=1)){
                movimentoCarros1.addtempoEspera();
            } else if ((semaforo2.state == "amarelo" | semaforo2.state == "vermelho"  )& (movimentoCarros2.getCarroSemaforo()>=1)){
                movimentoCarros2.addtempoEspera();
            } else if ((semaforo3.state == "amarelo" | semaforo3.state == "vermelho"  )& (movimentoCarros3.getCarroSemaforo()>=1)){
                movimentoCarros3.addtempoEspera();
            }
            
            // Verifica se cda semaforo esta verde e passa o respectivo veiculo.
            if (( semaforo1.state == "verde" ) & (movimentoCarros1.getCarroSemaforo()>=1)) {
                movimentoCarros1.passaCarro();
            } else if (( semaforo2.state == "verde" ) & (movimentoCarros2.getCarroSemaforo()>=1)) {
                movimentoCarros2.passaCarro();
            }  else if (( semaforo3.state == "verde" ) & (movimentoCarros3.getCarroSemaforo()>=1)) {
                movimentoCarros3.passaCarro();
            }
            
        System.out.println("  Semaforo 01 |"+semaforo1.state+"|  " + 
                movimentoCarros1.getCarroSemaforo() + "  |  " + 
                movimentoCarros1.getCarrosPassados() + "  |  " + 
                movimentoCarros1.getCarrosCongestionados() + "  |  " +i);
        System.out.println("  Semaforo 02 |"+semaforo2.state+"|  " + 
                movimentoCarros2.getCarroSemaforo() + "  |  " + 
                movimentoCarros2.getCarrosPassados() + "  |  " + 
                movimentoCarros2.getCarrosCongestionados() +  "  |  " +i);
        System.out.println("  Semaforo 03 |"+semaforo3.state+"|  " + 
                movimentoCarros3.getCarroSemaforo() + "  |  " + 
                movimentoCarros3.getCarrosPassados() + "  |  " + 
                movimentoCarros3.getCarrosCongestionados() + "  |  " +i);

        }

        System.out.println("  Legenda :");
        System.out.println("  CNS = Carro no Semaforo");
        System.out.println("  CPS = Carro parado no Semaforo");
        System.out.println("  CNC = Carro no congestionamento");
        System.out.println("----------------------------------------------------");
        System.out.println("  Relatorio Semaforo 01 ");
        System.out.println("  Carros que passaram pelo Semaforo : "+ movimentoCarros1.getCarrosPassados());
        System.out.println("  Tempo Médio de Espera na fila : "+ movimentoCarros1.getTempoEspera()/movimentoCarros1.getCarrosPassados());
        System.out.println("  Carros que ficaram congestionados : "+ movimentoCarros1.getCarrosCongestionados());
        System.out.println("----------------------------------------------------");
        System.out.println("  Relatorio Semaforo 02 ");
        System.out.println("  Carros que passaram pelo Semaforo : "+ movimentoCarros2.getCarrosPassados());
        System.out.println("  Tempo Médio de Espera na fila : "+ movimentoCarros2.getTempoEspera()/movimentoCarros2.getCarrosPassados());
        System.out.println("  Carros que ficaram congestionados : "+ movimentoCarros2.getCarrosCongestionados());
        System.out.println("----------------------------------------------------");
        System.out.println("  Relatorio Semaforo 03 ");
        System.out.println("  Carros que passaram pelo Semaforo : "+ movimentoCarros3.getCarrosPassados());
        System.out.println("  Tempo Médio de Espera na fila : "+ movimentoCarros3.getTempoEspera()/movimentoCarros3.getCarrosPassados());
        System.out.println("  Carros que ficaram congestionados : "+ movimentoCarros3.getCarrosCongestionados());
        System.out.println("----------------------------------------------------");
        
    }
}
