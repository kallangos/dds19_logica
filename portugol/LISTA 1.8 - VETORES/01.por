programa
{
	inclua biblioteca Util  --> toolsLib
	
	inteiro valores[10]
	inteiro contador,x
	
	funcao inicio()
	{
	contador= 10
	x=0

		para (inteiro c = 0 ; c<contador; c ++)
		{
			valores[c] = toolsLib.sorteia(1, 100)
		}

		para (inteiro c = 0 ; c<contador; c ++)
		{
			escreva("\nNumero gerado (" , c+1 , ") : " , valores[c])
		}



	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */