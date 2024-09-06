programa
{
/*
2) Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No final, mostre uma listagem com todos os nomes informados, na ordem inversa

daquela em que eles foram informados.
*/
inclua biblioteca Util  --> toolsLib
	
	cadeia nomes[7]
	inteiro contador,x
	
	funcao inicio()
	{
		contador = 7
		para (inteiro c = 0 ; c<contador; c++)
		{
			escreva("Digite o ", c,"° nome : ")
			leia(nomes[c])
		}
		para (inteiro c = contador-1 ; c>=0 ; c--)
		{
			escreva("\nNome da pessoa na posição (",c,") : ", nomes[c])
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 543; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */