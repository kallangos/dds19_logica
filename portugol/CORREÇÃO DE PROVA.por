programa
{
/*
 * Faça um programa que receba o gabarito de 5 questões 
de uma prova e os armazene em um vetor. Após isso, 
receba os nomes e respostas da prova de três alunos 
diferentes.
Ao final informe a nota da prova de cada um 
(cada acerto vale 2 pontos).
*/
	inclua biblioteca Util 
	const inteiro nLinhas = 3 , nColunas = 5, nAlunos = 3
	inteiro vGabarito[nLinhas][nColunas], notaProva[nAlunos]
	const cadeia nomeAluno[nAlunos] = {"Vanderson","Wolverine", "Magneto  "}
	
	funcao inicio()
	{
		para (inteiro l=0 ; l < nLinhas; l++){
			para (inteiro c=0 ; c < nColunas; c++){
			vGabarito[l][c]= Util.sorteia(0,1)
			}
		}
// Listando valors no Vetor (cada aluno é uma linha do vetor)		
		escreva("\n")
		escreva("\nExibindo Vetor - Gabarito das Provas")
		para (inteiro l=0 ; l < nLinhas; l++){
			escreva("\nAluno ", nomeAluno[l] ," | " )
			para (inteiro c=0 ; c < nColunas; c++){
			escreva(vGabarito[l][c]," | " )
				se ( vGabarito[l][c]==1 ){
					notaProva[l]= notaProva[l]+2
				}
			}
			escreva(" - Nota : ", notaProva[l] ," | " )
		}
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1073; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notaProva, 13, 39, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */