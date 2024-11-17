# Projeto 9 - Simulação de Sistema de Trânsito

Você deve desenvolver um programa que simule o fluxo de veículos em uma cidade. A cidade é representada por um sistema de ruas e semáforos que controlam o trânsito. O objetivo é simular o movimento dos carros através de diferentes interseções com base em ciclos de semáforos.

Especificações:

Ciclos de Semáforos:

Cada semáforo em uma interseção tem um ciclo de 3 estados: verde (30 segundos), amarelo (5 segundos), e vermelho (45 segundos).
Utilize um laço FOR para simular o ciclo completo de um semáforo durante um período de 10 minutos (600 segundos).
Durante o ciclo, o programa deve imprimir o estado atual do semáforo a cada segundo.
Movimento dos Carros:

Os carros tentam passar pelas interseções controladas pelos semáforos. Um carro só pode avançar se o semáforo estiver verde.
Utilize um laço WHILE para simular o movimento de carros em uma fila em cada interseção. O número de carros na fila deve ser dinâmico, com novos carros chegando a cada 15 segundos.
Simulação de Trânsito:

O programa deve simular o trânsito em 3 interseções diferentes, cada uma com seu próprio semáforo e fila de carros.
A cada segundo, o programa deve decidir se os carros podem avançar com base no estado do semáforo correspondente.
Implemente a lógica para lidar com congestionamentos: se uma fila tiver mais de 10 carros, os novos carros devem esperar fora da interseção até que o número de carros na fila diminua.
Relatórios Finais:

Ao final da simulação de 10 minutos, o programa deve imprimir um relatório com o número total de carros que passaram por cada interseção, o tempo médio de espera dos carros em cada fila, e o número de carros que ficaram presos no congestionamento.
