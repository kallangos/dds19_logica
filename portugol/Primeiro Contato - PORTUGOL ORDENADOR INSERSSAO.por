programa
{
	inclua biblioteca Util 
	inteiro vetor[10], menor, copia, indice
	
	funcao inicio()
	{
		// Inicia Vetor e Exibe conteúdo
		para (inteiro i =0 ; i<10 ; i++) {
			vetor[i]=Util.sorteia(0, 100)
			escreva(vetor[i],",")
		}
		escreva("\n")

/** 		Ordena o [ Vetor Selecao ]

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
*/

/** 		Ordena o [ Vetor Bolha ]
		para (inteiro j = 0 ; j <10 ; j++) {
			para (inteiro i = 0 ; i <9 ; i++){
				se(vetor[i]>vetor[i+1]){
					copia= vetor[i]
					vetor[i]= vetor[i+1]
					vetor[i+1] = copia
				}
			}
		}
*/


/** 		Ordena o [ Vetor Insersão ]
	
		para (inteiro i = 1 ; i < 10 ; i++ ){
			copia = vetor[i]
			indice = i
			enquanto(indice > 0 e vetor[indice-1] > copia){
				vetor[indice] = vetor[indice -1]
				indice--
			}
			vetor[ indice ] = copia
		}
*/		


		
		escreva("\n")
		para (inteiro i =0 ; i<10 ; i++) {
			escreva(vetor[i],",")
		}
		escreva("\n")

		// conta numeor de elementos na matrix
		escreva("\n")
		escreva("Matriz com : ", Util.numero_elementos(vetor), " elemetos")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 680; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */