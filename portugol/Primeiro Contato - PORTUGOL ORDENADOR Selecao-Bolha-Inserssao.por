programa
{
	inclua biblioteca Util 
	const inteiro tamVetor = 10
	inteiro vetor[tamVetor]
	inteiro menor, copia, indice, vBuscar, inicial, final, meio
	logico encontrado
	
	funcao inicio()
	{
// Prenche o Vetor e Exibe Conteúdo
		para (inteiro i =0 ; i<tamVetor ; i++) {
			vetor[i]=Util.sorteia(0, 100)
			escreva(vetor[i],",")
		}

// Ordena o Vetor [ Metodo Selecao ]
		para (inteiro j =0 ; j<tamVetor-1 ; j++)
			{
			menor=j
			para (inteiro h = j ; h<tamVetor ; h++)
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
		escreva("\nVetor Ordenado : ")
		para (inteiro i =0 ; i<tamVetor ; i++) {
			escreva(vetor[i],",")
		}
		escreva("\n")

		escreva("\nDigite o numero para buscar : ")
		leia(vBuscar)

				
// 		Busca no Vetor [ Metodo Binario ]
		inicial= 0
		final = tamVetor-1
		encontrado = falso

		enquanto ((inicial <= final) e (nao(encontrado))){
			meio = (inicial + final) / 2
			se (vetor[meio] == vBuscar){
				encontrado = verdadeiro
				escreva("\nEncontrado da posição : ", meio+1)
				pare
			}
			senao se (vetor[meio] > vBuscar){
				final = meio - 1
			}
			senao {
				inicial = meio + 1
			}
		}
		se (encontrado == falso){
			escreva("\nNão encontrei o numero : ", vBuscar)
		}

		
// 		Busca no Vetor [ Metodo Sequencial/Indice ]
/*		escreva("\nDigite o numero para buscar : ")
		leia(vBuscar)
		para (inteiro i=0 ; i < tamVetor; i++){
			se (vBuscar == vetor[i]){
				escreva("\n")
				escreva("\nAchei o numero na casa : ", i+1)
				pare
			}
			senao se (i == tamVetor-1 e vBuscar != vetor[i]){
				escreva("\n")
				escreva("\nNao encontrei o numero : ",  vBuscar)
				
			}
		}
		*/
		


		



/**
// 		Ordena o Vetor [ Metodo Bolha ]
		para (inteiro j = 0 ; j <tamVetor ; j++) {
			para (inteiro i = 0 ; i <tamVetor-1 ; i++){
				se(vetor[i]>vetor[i+1]){
					copia= vetor[i]
					vetor[i]= vetor[i+1]
					vetor[i+1] = copia
				}
			}
		}

*/

/*
// 		Ordena o Vetor [ Metodo Insersão ]
	
		para (inteiro i = 1 ; i < tamVetor ; i++ ){
			copia = vetor[i]
			indice = i
			enquanto(indice > 0 e vetor[indice-1] > copia){
				vetor[indice] = vetor[indice -1]
				indice--
			}
			vetor[ indice ] = copia
		}
*/		


/**		
		escreva("\n")
		para (inteiro i =0 ; i<tamVetor ; i++) {
			escreva(vetor[i],",")
		}
		escreva("\n")

		// conta numeor de elementos na matrix
		escreva("\n")
		escreva("Matriz com : ", Util.numero_elementos(vetor), " elemetos")
*/
escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */