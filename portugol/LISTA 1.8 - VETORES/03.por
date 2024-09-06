programa
{
/*
3) Escreva um programa que leia 15 números e guarde-os em um vetor. No final, mostre o vetor inteiro na tela e em seguida mostre em que posições foram
digitados valores que são múltiplos de 10.
*/
inclua biblioteca Util  --> toolsLib
	
	inteiro numUm[15]
	inteiro contador,x
	
	funcao inicio()
	{
		contador = 15
		para (inteiro c = 0 ; c<contador; c++)
		{
/*			escreva("Entre com o ", c,"° numero : ")
			leia(numUm[c])
*/			
			numUm[c] = toolsLib.sorteia(1, 120)
		}
		para (inteiro c = 0 ; c<contador; c++)
		{
			escreva("\n ", c+1, "° valor armazenado ", numUm[c])
		
		}

		para (inteiro c = 0 ; c<contador; c++)
		{
			se (numUm[c]%10==0) {
				escreva("\n Numero multiplo de 10 na posiçao ", c+1 )
/*
				escreva("\n", c+1, "° valor armazenado ", numUm[c])
*/
			}
		}

		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 545; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */