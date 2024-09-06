programa
{
	inclua biblioteca Util  --> toolsLib
	
	inteiro valores[10]
	cadeia parImpar[10]
	inteiro sorteado
	inteiro contador,x
	
	funcao inicio()
	{
	contador= 10
	x=0
	
		para (inteiro c = 0 ; c<contador; c ++)
		{
			valores[c] = toolsLib.sorteia(1, 100)
			
/*		escreva("\n| Entre com o ", c+1,"° valor : ")
		leia(valores[c])
*/		
			se  (valores[c]%2 == 0)  {
				x++
			}
		}


		escreva("\n|=====================================|")
		escreva("\n| Foram inseridos ", x, " numeros pares     |")		
		escreva("\n|=====================================|")
		para (inteiro c = 0 ; c<contador; c ++)
		{
			se  (valores[c]%2 ==0)  {
				escreva("\n| O valor na posição ", c+1," ( ",valores[c]," ) é : Par")
				
			}
		}
		escreva("\n|=====================================|")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 386; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */