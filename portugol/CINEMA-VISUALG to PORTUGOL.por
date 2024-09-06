programa
{
	inclua biblioteca Util
   cadeia nome, filme
   inteiro idade, filmeEscolhido, pedido, qtdMeias, qtdInteiras
   real valorFinal

//------------------------------------------- INICIO DO BLCO DE FUNCÕES

	funcao bemvindo(cadeia name){
	   escreva("\n|===============================")
	   escreva("\n|  BEM VINDO AO CINESENAI      |")
	   escreva("\n|  USUÁRIO:", name, "      ")
	   escreva("\n|")
	   escreva("\n|===============================")
	   escreva("\n")
	}
	funcao filmesKid(){
		escreva("\n|================================|")
	   	escreva("\n|            KIDS                |")
		escreva("\n|================================|")
	   	escreva("\n| 1- Os aventureiros - A origem  |")
	   	escreva("\n| 2- Homem aranha no aranhaverso |")
	}
	funcao filmesTeen(){
	   	escreva("\n|================================|")
	   	escreva("\n|            TEENS               |")
		escreva("\n|================================|")
	  	escreva("\n| 3- Transformers - A origem     |")
	   	escreva("\n| 4- Velozes e furiosos - 50°    |")
	}
	funcao filmesAll(){
		escreva("\n|================================|")
	   	escreva("\n|            ALL                 |")
	   	escreva("\n| 5- Sobrenatural - A origem     |")
	    	escreva("\n| 6- Tropa de elite              |")
	}
	funcao mostrarFilmes(inteiro age){
	   se (age < 11 ){
	   	filmesKid()
	   }
		   senao se (age < 18){
		         filmesKid()
		         filmesTeen()
		   }
		      senao {
		         filmesKid()
		         filmesTeen()
		         filmesAll()
		      }
	}
	funcao valorIngressos(){
		escreva("\n|================================|")
	   	escreva("\n| PREÇOS                         |")
	   	escreva("\n| MEIA-ENTRADA: R$ 13.50         |")
	   	escreva("\n| INTEIRA: R$ 27			    |")
	}
	funcao real comprar(inteiro meias, inteiro inteiras){
	   real resultado
	   resultado = (meias * 13.50) + (inteiras * 27)
	retorne resultado		
	}
//------------------------------------------- FIM DO BLCO DE FUNCÕES	
	funcao inicio()
	{
		

	faca{
//------------------------------------------- Guarda o nome da pessoa e sua idade
	   	escreva("\n|===============================")
		escreva("\n| Digite seu nome: ")
	   	leia(nome)
	   	escreva("\n| Digite sua idade: ")
	   	leia(idade)
	   	escreva("\n|")
	   	escreva("\n|===============================")
	   	limpa()

//------------------------------------------- Mensagem de bem vindo
	   bemvindo(nome)
	   
//------------------------------------------- mostrar filmes disponíveis
	   mostrarFilmes(idade)

//------------------------------------------- Escolher filme
	   faca{
	   	 escreva("\n|=========================================")
	      escreva("\n| Escolha seu filme: (por número): ")
	      leia(filmeEscolhido)
	      escolha (filmeEscolhido)
	      {
	      caso 1:
	         filme = "Aventureiros"
	         pare
	      caso 2:
	         filme = "Aranha"
	         pare
	      caso 3:
	         filme = "Transformers"
	         pare
	      caso 4:
	         filme = "Velozes"
	         pare
	      caso 5:
	         filme = "Sobrenatural"
	         pare
	      caso 6:
	         filme = "Tropa"
	         pare
		caso contrario:
	         escreva("\nfilme inválido")
		}
	   } enquanto ((filmeEscolhido > 6) ou (filmeEscolhido < 1))
   
	limpa()

//------------------------------------------- Comprar ingressos
		   bemvindo(nome)
		   valorIngressos()
		   escreva("\n|=============================================")
		   escreva("\n| Digite a quantidade de meias-entradas : ")
		   leia(qtdMeias)
		   escreva("\n|=============================================")
		   escreva("\n| Digite a quantidade de inteiras : ")
		   leia(qtdInteiras)
		
		   valorFinal = comprar(qtdMeias, qtdInteiras)

//------------------------------------------- Finalizar pedido
		   limpa()
		   escreva("\n|=============================================")
		   escreva("\n|                                            |")
		   escreva("\n|       FINALIZAR PEDIDO                     |")
		   escreva("\n|                                            |")
		   escreva("\n| OLÁ ", nome)
		   escreva("\n| O VALOR FINAL DO SEU PEDIDO FOI DE: ")
		   escreva(valorFinal)
		   escreva("\n| ")
		   escreva("\n| Voce escolheu o filme : ", filme)
		   escreva("\n| POR FAVOR SIGA AO CAIXA PARA FINALIZAR O PEDIDO")

//------------------------------------------- Outro pedido?
		   escreva("\n|                                            |")
		   escreva("\n| DESEJA REALIZAR OUTRO PEDIDO?              |")
		   escreva("\n|       1 - SIM , 2 - NÃO                    |")
		   escreva("\n|                                            |")
		   leia(pedido)
		   se (pedido==1){
		   	escreva("\n| Redirecionando...                          |")
		   	Util.aguarde(2000)
		      limpa()
		   }
		   senao {
		   	escreva("\n| Bom filme                                  |")
		   }
	} enquanto (pedido==1)
//------------------------------------------- fin inicio
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1012; 
 * @DOBRAMENTO-CODIGO = [57];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = vetor, matriz, funcao;
 */