programa
{
	inclua biblioteca Util 
	inteiro vetor[10], menor, copia
	
	funcao inicio()
	{
		// Inicia Vetor e Exibe conteúdo
		para (inteiro i =0 ; i<10 ; i++) {
			vetor[i]=Util.sorteia(0, 100)
			escreva(vetor[i],",")
		}

		escreva("\n")
		// Ordena o Vetor
		para (inteiro j =0 ; j<9 ; j++)
			{
			menor=j
			para (inteiro h = j ; h<10 ; h++)
			{
				se ( vetor[h]<vetor[menor]){
					menor=h
				}
			}
			copia = vetor[menor]
			vetor [ menor ] = vetor[j]
			vetor [ j ] = copia
		}

		escreva("\n")
		para (inteiro i =0 ; i<10 ; i++) {
			escreva(vetor[i],",")
		}

		escreva("\n")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 4, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */