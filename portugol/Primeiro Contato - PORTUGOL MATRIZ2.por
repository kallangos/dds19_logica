programa
{
/*	
Faça um programa que leia números inteiros, os armazene
seguidamente em uma matriz 3x4 e em seguida imprima a
matriz. Após isso imprima a trasposta desta mesma matriz
 */
 inclua biblioteca Util
	const inteiro nLinhas = 3, nColunas = 2
	inteiro matriz [nLinhas][nColunas], eNumero
	/* Matriz, primeiro item é numero de Linha
			segundo item é o numero de Colunas */
	funcao inicio()
	{
		para (inteiro l = 0 ; l < nLinhas ; l++){
			para (inteiro c = 0 ; c < nColunas ; c++){
				escreva("entre com o numero para posição (",l,")(", c,") : ")
				leia(eNumero)
				matriz[l][c]= eNumero
			}
		}

		para (inteiro l = 0 ; l < nLinhas; l++){
			escreva("|")
			para (inteiro c = 0 ; c < nColunas  ; c++){
				escreva(matriz[l][c], " | ")
			}
			escreva("\n")
		}


		escreva("\n")
		
		para (inteiro l = 0 ; l < nColunas ; l++){
			escreva("|")
			para (inteiro c = 0 ; c < nLinhas ; c++){
				escreva(matriz[c][l], " | ")
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
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */