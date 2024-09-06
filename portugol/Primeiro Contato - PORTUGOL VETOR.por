programa
{
	inclua biblioteca Util  --> toolsLib
	
	real notaUm[5], notaDois[5], media[5]
	cadeia nomeAluno[5]
	
	funcao inicio()
	{

		para (inteiro c = 0 ; c<=2; c ++)
		{

		escreva("\nEntre com o nome do Aluno (", c+1,"): ")
		leia(nomeAluno[c])
		escreva("\nEntre com a nota da Primeira Avalição : ")
		leia(notaUm[c])
		escreva("\nEntre com a nota da Segunda Avalição : ")
		leia(notaDois[c])
		media[c]= (notaUm[c]+notaDois[c])/2
		}
limpa()
		para (inteiro c = 0 ; c<=2; c ++)
		{
	   	escreva("\n|==============================|")
	   	escreva("\n|                              |")
		escreva("\n| Aluno   : ", nomeAluno[c])
/*		escreva("\n| 1° Nota : ", notaUm[c])
		escreva("\n| 2° Nota : ", notaDois[c])  */
		escreva("\n| ")
		escreva("\n| Media   : ", media[c])
	   	escreva("\n|                              |")
	   	escreva("\n|==============================|")
		}

		escreva("\n| Total de itens na Matriz : ", toolsLib.numero_elementos(nomeAluno)," |")
		escreva("\n|==============================|")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 88; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {nomeAluno, 6, 8, 9}-{media, 5, 31, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */