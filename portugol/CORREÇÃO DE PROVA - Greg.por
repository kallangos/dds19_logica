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
	const inteiro nAlunos = 3 , nQuestoes= 5
	cadeia nomeAlunoRespostas[nAlunos][nQuestoes+1] 
	real notaProva[nAlunos]
	cadeia vGabarito[nQuestoes]
	
	funcao inicio()
	{
		para (inteiro c=0 ; c < nQuestoes; c++){
			escreva("Entre com o Gabarito da (", c+1,"º) questão : ")
			leia(vGabarito[c])
		}

		para (inteiro c=0 ; c < nAlunos; c++){
			escreva("\nEntre com nome do ", c+1,"º Aluno : ")
			leia(nomeAlunoRespostas[c][0])
			para (inteiro i=1 ; i < nQuestoes+1; i++){
			escreva("Entre com resposta da ", i,"º Questão : ")
			leia(nomeAlunoRespostas[c][i])
				se (vGabarito[i-1] == nomeAlunoRespostas[c][i]){
				notaProva[c] = notaProva[c]+2
				}
			}
		}
		escreva("\n =====================")
		escreva("\n | Gabarito da Prova |")
		escreva("\n =====================\n")
			para (inteiro j=0 ; j< nQuestoes; j++){
				escreva(" | ", vGabarito[j])
			}
		escreva(" |")
		escreva("\n =====================")
		escreva("\n |  Turma DDS-1-19   |")
		escreva("\n =====================")
		escreva("\n | Nota - Aluno      |")
			para (inteiro i=0 ; i< nAlunos; i++){
				se (notaProva[i]<10){
					escreva("\n | ", notaProva[i],"  - ", nomeAlunoRespostas[i][0])
					escreva("\n =====================")
				} 
				senao{
					escreva("\n | ", notaProva[i]," - ", nomeAlunoRespostas[i][0])
					escreva("\n =====================")					
				}
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1642; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */