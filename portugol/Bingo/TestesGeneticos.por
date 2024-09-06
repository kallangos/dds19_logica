programa
{
	inclua biblioteca Util --> util
	inclua biblioteca Arquivos --> arq
	inclua biblioteca Tipos --> tipo
	inclua biblioteca Objetos --> obj
	
//	const cadeia caminho = "./Base.txt"
	const cadeia caminho = "./teste.txt"
	cadeia linha =""
	cadeia vetor[2][2] = { {"C0_L0","C1_L0"}, {"C0_L1","C1_L1"} }
					   
//************Biblioteca Arquivos
/*
funcao   logico arquivo_existe(cadeia caminho_arquivo)
funcao   cadeia obter_json(inteiro endereco)
funcao   inteiro  criar_objeto_via_json(cadeia json)
*/




	funcao inicio()
	{
		escreva(vetor[0][0])
		escreva("\n")
		escreva(vetor[1][0])
		escreva("\n")
		escreva(vetor[0][1])
		escreva("\n")
		escreva(vetor[1][1])
		escreva("\n")
		lerArquivo()

		
	}

	funcao lerArquivo()
		{
		inteiro arquivo = arq.abrir_arquivo(caminho, arq.MODO_LEITURA)
		linha = arq.ler_linha(arquivo)
		
		para (inteiro i = 0 ; i <3 ; i++ ){
			linha = arq.ler_linha(arquivo)
			escreva (linha)
		}
		
		arq.fechar_arquivo(arquivo)
		}
	funcao escreveArquivo()
		{
		inteiro arquivo = arq.abrir_arquivo(caminho, arq.MODO_ESCRITA)
		arq.escrever_linha(linha, arquivo)
		arq.fechar_arquivo(arquivo)
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 845; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */