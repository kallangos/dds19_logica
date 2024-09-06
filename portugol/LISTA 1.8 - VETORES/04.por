programa
{
/*
4) Crie um programa que preencha automaticamente 
(usando lógica, não apenas atribuindo diretamente) 
um vetor numérico com 15 posições com os primeiros

elementos da sequência de Fibonacci:

1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987

0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

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
 * @POSICAO-CURSOR = 570; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */