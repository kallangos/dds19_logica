programa
/**
 Faça um programa para gerar automaticamente números entre 0 e 99 de uma cartela de bingo. 
 Sabendo que cada cartela deverá conter 5 linhas de 5 números, gere estes dados de modo a 
 não ter números repetidos dentro das cartelas. O programa deve exibir na tela a cartela 
 gerada.
 */
{
	inclua biblioteca Util --> util
	inclua biblioteca Arquivos --> arq
	inclua biblioteca Tipos  --> tipo
//	const cadeia cartela = "P:/TURMAS/HTC-DDS-19/Vanderson/Portugol/bingo_cartela.txt"
//	const cadeia logo_file = "P:/TURMAS/HTC-DDS-19/Vanderson/Portugol/logo.txt"
	const inteiro logoSize = 32, cartelaSize = 25, nCartelas = 3
	const cadeia cartela = "./bingo_cartela.txt"
	const cadeia logo_file = "./logo.txt"
	logico reiniciaAPP = verdadeiro
	inteiro menuOpcao, contador = 0
	cadeia linhasLogo[logoSize], numerosCartela[nCartelas][cartelaSize]
	inteiro vetorExibiCartela[nCartelas][cartelaSize]

	funcao inicio()
	{
// 	Carregando a logo
	carregalogo()
/*
	enquanto (contador!=logoSize){
		inteiro arquivo = arq.abrir_arquivo(logo_file, arq.MODO_LEITURA)
		para (inteiro i = 0 ; i<logoSize ; i++){
			linhasLogo[i] = arq.ler_linha(arquivo)
		} 
		contador=logoSize
		arq.fechar_arquivo(arquivo)
	}
*/
	enquanto (reiniciaAPP) {
			escreva("\n ===========================================================")
			escreva("\n |                                                         |")
			escreva("\n |                Bingo Brownie da Sorte   ",linhasLogo[0],"    |")
			escreva("\n |                ----------------------   ",linhasLogo[1],"    |")
			escreva("\n |                                         ",linhasLogo[2],"     |")
			escreva("\n |                                         ",linhasLogo[3],"    |")
			escreva("\n |  (1) - Criar Nova Cartela.              ",linhasLogo[4],"     |")
			escreva("\n |  (2) - Exbir Cartela em memoria.        ",linhasLogo[5],"   |")
			escreva("\n |  (3) - Carregar Cartela em disco.       ",linhasLogo[6],"   |")
			escreva("\n |  (4) - Sair do Bingo Brownie da Sorte.  ",linhasLogo[7],"  |")
			escreva("\n |                                         ",linhasLogo[8],"|")
			escreva("\n |  Selecione uma Opção : ")
			leia(menuOpcao)
			escreva(" ===========================================================")
			escolha (menuOpcao){

				caso 1:
				criaCartela (nCartelas, 0, 99, cartelaSize)
				carregarCartela (nCartelas, cartelaSize)
				carregarMenuslin()
				pare

				caso 2:
				carregarCartela (nCartelas, cartelaSize)
				carregarMenuslin()
				pare

				caso 3:
				carregarCartelaDisco (nCartelas, cartelaSize)
				carregarMenuslin()
				pare

				caso 4:
				reiniciaAPP = falso
				escreva("\n | Saindo da aplicação...                                  |")
						para (inteiro i = 10 ; i<logoSize ; i++){
							escreva("\n",linhasLogo[i])
						} 
				pare
				caso contrario:
				escreva("\n | Opção INVALIDA escolha novamente.                       |")
				escreva("\n | Reiniciando ...                                         |")
				util.aguarde(2000)
				limpa()
			}
	}
	
		
	}
	funcao carregarMenuslin(){
			escreva(" ===========================================================")
			escreva("\n |  (1) - Criar Nova Cartela.                              |")
			escreva("\n |  (2) - Exbir Cartela em memoria.                        |")
			escreva("\n |  (3) - Carregar Cartela em disco.                       |")
			escreva("\n |                                                         |")
			escreva("\n |  (4) - Sair do Bingo Brownie da Sorte.                  |")
			escreva("\n |                                                         ")

			escreva("\n |  Selecione uma Opção : ")
			leia(menuOpcao)
			escreva(" ===========================================================")
			escolha (menuOpcao){

				caso 1:
				criaCartela (nCartelas, 0, 99, cartelaSize)
				carregarCartela (nCartelas, cartelaSize)
				pare

				caso 2:
				carregarCartela (nCartelas, cartelaSize)
				pare

				caso 3:
				carregarCartelaDisco (nCartelas, cartelaSize)
				pare

				caso 4:
				reiniciaAPP = falso
				escreva("\n | Saindo da aplicação...                                  |")
						para (inteiro i = 10 ; i<logoSize ; i++){
							escreva("\n",linhasLogo[i])
						} 
				pare
				caso contrario:
				escreva("\n | Opção INVALIDA escolha novamente.                       |")
				escreva("\n | Reiniciando ...                                         |")
				util.aguarde(2000)
				limpa()
			}
	}
	funcao carregalogo(){
		enquanto (contador!=logoSize){
			inteiro arquivo = arq.abrir_arquivo(logo_file, arq.MODO_LEITURA)
			para (inteiro i = 0 ; i<logoSize ; i++){
				linhasLogo[i] = arq.ler_linha(arquivo)
			} 
		contador=logoSize
		arq.fechar_arquivo(arquivo)
		}
	}
	
	funcao carregarCartelaDisco (inteiro qtdCartelas, inteiro tamCartela ){
		escreva("\n |  Carregando ...                                         |\n")
		inteiro arquivo = arq.abrir_arquivo(cartela, arq.MODO_LEITURA)

		para (inteiro z = 0 ; z<qtdCartelas ; z++){
			
			para (inteiro i=0 ; i<tamCartela ; i++){
				vetorExibiCartela[z][i] = tipo.cadeia_para_inteiro(arq.ler_linha(arquivo),10)
				se (((i%5)<=0) e (i>1)){
					escreva("                  | \n |                 ")
				} 
				senao se (((i%5)<=0) e (i==0)){
					escreva(" |                 ")
				} 
				senao {
					escreva(" - ")
				}
				se (vetorExibiCartela[z][i]<10){
					escreva(" ",vetorExibiCartela[z][i])
					}
				senao {
					escreva(vetorExibiCartela[z][i])
				}
	
			}
			escreva("                  |\n")
			escreva(" |                                                         |\n")
			
		}
	arq.fechar_arquivo(arquivo)
	}
	
	funcao carregarCartela (inteiro qtdCartelas, inteiro tamCartela ){
		escreva("\n |  Carregando ...                                         |\n")
		para (inteiro z = 0 ; z<qtdCartelas ; z++){
			
			para (inteiro i=0 ; i<cartelaSize ; i++){
				se (((i%5)<=0) e (i>1)){
					escreva("                  | \n |                 ")
				} 
				senao se (((i%5)<=0) e (i==0)){
					escreva(" |                 ")
				} 
				senao {
					escreva(" - ")
				}
				se (vetorExibiCartela[z][i]<10){
					escreva(" ",vetorExibiCartela[z][i])
					}
				senao {
					escreva(vetorExibiCartela[z][i])
				}
	
			}
			escreva("                  |\n")
			escreva(" |                                                         |\n")

		}

	}
	funcao criaCartela (inteiro qtdCartelas, inteiro nInicio, inteiro nFinal, inteiro tamCartela ){
	logico novoSorteio = verdadeiro, numExiste = verdadeiro
	inteiro nSorteado, indice, copia
	
	para (inteiro z = 0 ; z<qtdCartelas ; z++){
		para (inteiro x=0 ; x<cartelaSize ; x++){
			faca {
				numExiste=falso
				nSorteado = util.sorteia(nInicio, nFinal)
				para (inteiro i=0 ; i<cartelaSize ; i++){
					se(vetorExibiCartela[z][i]==nSorteado){
						numExiste=verdadeiro
					} 
				}
				se (numExiste==falso) {
						numerosCartela[z][x]=tipo.inteiro_para_cadeia(nSorteado,10)
						vetorExibiCartela[z][x]=nSorteado
					}
			} enquanto (numExiste==verdadeiro)
		}

// Ordena as tatelas sorteadas tanto o que sera exibido em memória quando o que sera gravado em disco
		para (inteiro i = 1 ; i < cartelaSize ; i++ ){
			copia = tipo.cadeia_para_inteiro(numerosCartela[z][i],10)
			indice = i
			enquanto(indice > 0 e tipo.cadeia_para_inteiro(numerosCartela[z][indice-1],10) > copia){
				numerosCartela[z][indice]= numerosCartela[z][indice -1]
				vetorExibiCartela[z][indice] = tipo.cadeia_para_inteiro(numerosCartela[z][indice -1],10)
				//vetor[indice] = numerosCartela[z][indice -1]
				indice--
			}
			numerosCartela[z][ indice ] = tipo.inteiro_para_cadeia(copia,10)
			vetorExibiCartela[z][indice] = copia
		}

		
	}


	
	inteiro arquivo = arq.abrir_arquivo(cartela, arq.MODO_ESCRITA)
	para (inteiro j = 0 ; j < qtdCartelas ; j++) {
		para (inteiro i = 0 ; i < tamCartela ; i++) {
		arq.escrever_linha(numerosCartela[j][i], arquivo)
		}
	}
	arq.fechar_arquivo(arquivo)
	escreva("\n |")
	escreva("\n |  Cartela(s) criada(s) com SUCESSO, salvando o aquivo... ")
	escreva("\n |")
	util.aguarde(2000)
	escreva("\n ===========================================================")
	}


	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 6229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numerosCartela, 19, 30, 14}-{vetorExibiCartela, 20, 9, 17};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */