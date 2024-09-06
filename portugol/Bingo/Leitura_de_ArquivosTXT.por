
programa
{
	inclua biblioteca Util
	inclua biblioteca Arquivos --> arq
	inteiro opcao
	const cadeia caminho = "P:/TURMAS/HTC-DDS-19/Vanderson/Portugol/Leitura_de_ArquivosTXT.txt"
	logico repetir = verdadeiro
	cadeia linha
	
	funcao inicio()
	{
		enquanto (repetir){
			
			escreva("\n ")
			escreva("\nBem-vindo ")
			escreva("\n ")
			escreva("\n1 - Ler arquivo ")
			escreva("\n2 - Escrever arquivo ")
			escreva("\n3 - Acrescentar ao Aquivo ")
			escreva("\n ")
			escreva("\nEscolha uma Opção: ")
			leia(opcao)
	
			escolha(opcao){
			caso 1:
				se ( arq.arquivo_existe(caminho)){
					inteiro arquivo = arq.abrir_arquivo(caminho, arq.MODO_LEITURA)
					linha = arq.ler_linha(arquivo)
					arq.fechar_arquivo(arquivo)
					escreva("\n ******")
					escreva("\n Linha: ",linha)
					escreva("\n ******")
				} senao {
						escreva(" Arquivo nao encontrado ! ! !")
						Util.aguarde(3000)
						repetir=falso
						limpa()
				}
			pare
			caso 2:
				escreva("\n")			
				escreva("\n Digite a linha do Arquivo : ")			
				leia(linha)
				inteiro arquivoEscrever = arq.abrir_arquivo(caminho, arq.MODO_ESCRITA)
				arq.escrever_linha(linha, arquivoEscrever)
				arq.fechar_arquivo(arquivoEscrever)
				escreva("\n Escrito com sucesso!")			
				Util.aguarde(3000)
				limpa()
			pare
			caso 3:
				se ( arq.arquivo_existe(caminho)){
					escreva("\n Digite a linha do Arquivo : ")			
					leia(linha)
					inteiro arquivoAcrescentar = arq.abrir_arquivo(caminho, arq.MODO_ACRESCENTAR)
					arq.escrever_linha(linha, arquivoAcrescentar)
					arq.fechar_arquivo(arquivoAcrescentar)
					escreva(" Arquivo nao encontrado ! ! !")
					Util.aguarde(3000)
				} senao {
						escreva(" Arquivo nao encontrado ! ! !")
						Util.aguarde(3000)
						repetir=falso
						limpa()
				}
			pare
			caso	contrario:
				escreva("\n Programa Finalizado!")			
				Util.aguarde(3000)
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
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */