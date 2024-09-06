programa
{
	inclua biblioteca Util --> util	
	funcao inicio()
	{
		inteiro vetor[10]

		// prenche o vetor
		para (inteiro posicao = 0 ; posicao < 10; posicao ++){
			vetor[posicao] = util.sorteia(1, 100)
		}
		// exibe valor
		para (inteiro posicao = 0 ; posicao < 10 ; posicao++){
			escreva(vetor[posicao], " " )
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 331; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */