programa
{
	funcao inicio()
	{
	cadeia nome = "Vanderson" 
	inteiro idade = 10000
	real  dinheiro = 0.15
	logico vivo = verdadeiro
	inteiro opcao, d, z

	escreva("Seu dados: \n")
	escreva(nome , "\n" , idade,"\n", dinheiro,"\n", vivo,"\n")
		
		se (nome == "Vanderson"){
			escreva( "\n Ai sim!!!\n")
		}
		senao se (nome != "Vanderson"){
			escreva ("\n Ai nãaaaaaaaaaao!!!\n")
		}
		senao{
			escreva ("\n Deu ruim\n")
		}
// --------------------------------------------------------------
	escreva("Escolha uma opção \n")
	escreva("(1) Opa 1 ! \n")
	escreva("(2) Opa 2 ! \n")
	escreva("(3) Opa 3 ! \n")
	escreva("Escolha uma opção\n")
		leia(opcao)
		escolha (opcao)
		{
			caso 1:
				escreva("VC escolheu a opcao (1)")
				pare // impede que as instruções seguintes sejam executadas
			caso 2:
				escreva("VC escolheu a opcao (b)")
				pare // impede que as instruções seguintes sejam executadas
			caso 3:
				escreva("VC escolheu a opcao (3)")
				pare // impede que as instruções seguintes sejam executadas
			caso contrario:
				escreva("Nada deu certo")
		}
// ---- laço de repetição PARA ----------------------------------
		para (inteiro c = 0 ; c<=5; c ++)
		{
			escreva("PARA C = ", c, "\n")
		}
// ---- laço ENQUANTO -------------------------------------------
		escreva("\n")
		z=0
		enquanto (z < 5)
		{ 
			z++
			escreva("PARA z = ", z, "\n")
		}
// ---- é permitido declara variavel emtodo o código ------------
		inteiro asds
// ---- laço de repetição FACA ENQUANTO -------------------------
		escreva("\n")
		z=1
		faca{
			z++
			escreva("PARA Z2 = ", z, "\n")
		} enquanto (z<5)
		
		
// ---- funções COM ou SEM RETORNO ------------------------------
// ---- As funçoes devem ser declaradas FORA do blk INICIO ------
		mensagem("Bem Vindo\n")
		escreva(calcula(2.0,3.0),"\n")
		
	} 
		funcao real calcula (real a , real b){
			real resultado
			resultado = a*a + b*b
			retorne resultado
		}
		funcao mensagem( cadeia msgTexto){
			escreva(msgTexto)
		}


}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1767; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */