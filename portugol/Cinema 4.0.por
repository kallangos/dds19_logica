programa
{
/*	
 * 	Faça um programa que mostre uma lista com 10 lugares disponíveis 
 * 	em uma fileira de cinema e que receba do usuário um número 
 * 	de lugar para reservar.
 * 	*USE VETORES**
 */
 	inclua biblioteca Util 
 	const inteiro nLugares = 59
 	// inteiro lugares[nLugares], reservado[nLugares], selectLocal
 	inteiro lugaresEReservado[2][nLugares], selectLocal, reservaOutro
 	logico executando, reservaOK, assentoEncontrado, assentoDisponivel
 	
	funcao inicio()
	{
		//lugaresEReservado[1][0]=40
		//lugaresEReservado[1][1]=41
		executando=falso
		reservaOK=falso
		assentoDisponivel=falso
		assentoEncontrado=falso
		
/** 
 * Prenche vetor com numero dos assestos existentes
 */
		para (inteiro i = 0 ; i < nLugares; i++){
			lugaresEReservado[0][i]= i+101
		}
// Inicia processamento		
		enquanto (nao(executando))
		{


			escreva("\n =============================================================")
			escreva("\n | Cinema 4.0    [vPortugol]                                 |")
			escreva("\n =============================================================\n")
/** 
 * Verifica qual assento esta disponivel e lista os disponiveis
 */
			para (inteiro i = 0 ; i < nLugares; i++){
	
				se (lugaresEReservado[0][i]!=lugaresEReservado[1][i]){
					escreva(" | ", lugaresEReservado[0][i])
					se ( i%10>=9) {
						escreva(" |\n")
					}
				} senao {
					escreva(" |   ")

				}
			}
			escreva(" | ")
			escreva("\n | ")
			escreva("\n | Selecione um assento disponivel : ")
			leia(selectLocal)
/** 
 * Verifica se o assento ja esta resverdado comparando com a vetor [reservado]
 */
 			enquanto (nao(reservaOK)){

				enquanto (nao(assentoEncontrado)){
					para (inteiro c = 0 ; c < nLugares; c++){
						se( (selectLocal==lugaresEReservado[0][c]) e (selectLocal!=lugaresEReservado[1][c])){
//							escreva(" | Assento Valido e Disponivel")
							assentoEncontrado=verdadeiro
							assentoDisponivel=verdadeiro
							reservaOK=verdadeiro
							lugaresEReservado[1][c]=selectLocal
						} 
					}
					se (nao(assentoEncontrado) e nao(assentoDisponivel)){
						escreva(" | Assento INEXISTENTE ou OCUPADO ")
						executando=falso
						reservaOK=falso
						assentoDisponivel=falso
						assentoEncontrado=falso
						escreva("\n | Selecione um assento disponivel : ")
						leia(selectLocal)
					}
				}

			}
			
		escreva("\n ! Deseja escolher mais um ? (1)SIM/(2)NÃO : ")
		leia(reservaOutro)	
		escolha (reservaOutro) {
			caso 1:
			executando=falso
			reservaOK=falso
			assentoEncontrado=falso
			assentoDisponivel=falso
			limpa()
			pare
			
			caso 2:
			executando=verdadeiro
			limpa()
			pare
			
			caso contrario:
			escreva("\n ! Deseja escolher mais um assento? (1)SIM / (2)NÃO : ")
			leia(reservaOutro)
			limpa()
			pare
			
		}

		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1340; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */