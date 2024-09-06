programa
{
	inclua biblioteca Util
	const inteiro nLinhas = 5, nColunas = 5
	inteiro matriz [nLinhas][nColunas]
	/* Matriz, primeiro item é numero de Linha
			segundo item é o numero de Colunas */
	funcao inicio()
	{
		para (inteiro l = 0 ; l < nLinhas ; l++){
			para (inteiro c = 0 ; c < nColunas ; c++){
				matriz[l][c]= Util.sorteia(1,9)
			}
		}

		
		para (inteiro l = 0 ; l < nLinhas ; l++){
			escreva("|")
			para (inteiro c = 0 ; c < nColunas ; c++){
				escreva(matriz[l][c], " | ")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */