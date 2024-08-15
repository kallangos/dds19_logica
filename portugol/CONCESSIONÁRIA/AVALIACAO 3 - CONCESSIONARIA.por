programa
{
// Carga de bibliotecas.
	inclua biblioteca Util     --> util
	inclua biblioteca Tipos 	  --> tipo
	inclua biblioteca Texto    --> txt
	inclua biblioteca Arquivos --> arq
	inclua biblioteca Matematica --> mat
// numero de registros na tbFipe e tbEstoque. 
	const inteiro logoHeight = 8  , screenWidth  = 80
// 	tbFipe com 3 colunas, tbEstoque com 8 colunas.
	const cadeia logoFile  = "./logo.txt"
	const cadeia tbMarcaFile   = "./tbMarca.txt"
	const cadeia tbFipeFile    = "./tbFipe.txt"
	const cadeia tbEstoqueFile = "./tbEstoque.txt"
	const cadeia tbEstoqueTemp = "./tbEstoqueTemp.txt"
	const inteiro tbFipeMax    = 29, tbFipeCollumns    = 6
	const inteiro tbEstoqueMax = 31, tbEstoqueCollumns = 6
	const inteiro tbMarcaMax  =  6, tbMarcaCollumns   = 2
//	const cadeia valorAluguel[3] = {"85","120","200"}
	const cadeia categoriaValorAluguel[3][2] = {{" Popular ","85"},
							     {" Premium ","120"},
							     {" Luxo ","200"}}
	inteiro nRegistrostbFipe    = 0,   
		   nRegistrostbEstoque = 0, 
		   nRegistrostbMarca   = 0,
		   nRegistrostbAlugado = 0
	cadeia tbFipeDataM[tbFipeMax][tbFipeCollumns], tbEstoqueDataM[tbEstoqueMax][tbEstoqueCollumns], 
		  tbMarcaDataM[tbMarcaMax][tbMarcaCollumns], logo[logoHeight]
	logico tlHome = verdadeiro
	inteiro EstoqueAtual = 0 , creditoCliente = 420000, creditoLoja = 580000
	cadeia  opcaoMenu = "0"
	logico loopingMarca = verdadeiro , loopingModelo = verdadeiro 	
	funcao inicio()
	{
		// carrega o arquivo responsavel pelo cabeçalho do app
		loadHeader()
		// carrega o arquivo txts com a base de dados para operaçao. 
		nRegistrostbFipe = loadTableFile(tbFipeDataM, tbFipeFile, tbFipeCollumns, tbFipeMax)
		nRegistrostbMarca = loadTableFile(tbMarcaDataM, tbMarcaFile, tbMarcaCollumns, tbMarcaMax)
		nRegistrostbEstoque = loadTableFile(tbEstoqueDataM, tbEstoqueFile, tbEstoqueCollumns, tbEstoqueMax)

		enquanto (tlHome==verdadeiro){
			// Exiber na tela o cabeçalho e aguarda a selaçao de uma operaçao valida.
			limpa()
			showHeader(screenWidth , logo, logoHeight)
			centralizaTexto_Broda(" ")
			centralizaTexto_Broda("Selecione uma operação no menu abaixo.")
			centralizaTexto_Broda(" ")
			centralizaTexto_Broda("(1)Venda para Loja  (2)Alugue na Loja  (3)Compre na Loja  (4)Sair")
			centralizaTexto_Broda("")
			opcaoMenu = centralizaTexto_Leia("Aguardando seleção : ")
			// verifica se o operador selecionou uma operação valida e segue com o fluxo conforme o selecionado.
			se (txt.numero_caracteres(opcaoMenu)>1){opcaoMenu="5"}
			escolha (tipo.cadeia_para_caracter(opcaoMenu)){
			caso '1':
				se (nRegistrostbEstoque!=(tbEstoqueMax-1)){
					centralizaTexto_Broda("Iniciando modulo de Venda...")
					util.aguarde(100)
					limpa()
					venda()
					tlHome =  verdadeiro
				} senao {
					centralizaTexto_Broda("O pátio da loja esta CHEIO, compre um carro.")
					centralizaTexto_Broda("")
					util.aguarde(2500)
				}
			pare
			caso '2':

				se (nRegistrostbAlugado!=nRegistrostbEstoque){
					centralizaTexto_Broda("Iniciando modulo de Aluguel...")
					util.aguarde(100)
					limpa()
					aluguel()
					tlHome =  verdadeiro
				} senao {
					centralizaTexto_Broda("Desculpa, Todos os carros estao alugados.")
					centralizaTexto_Broda("")
					util.aguarde(2500)
				}
			pare
			caso '3':
				centralizaTexto_Broda("Iniciando modulo de Compra...")
				util.aguarde(100)
				limpa()
				compra()
				tlHome =  verdadeiro
			pare

			caso '4':
				centralizaTexto_Broda("Saindo...")
				util.aguarde(2000)
				limpa()
				tlHome =  falso
			pare

			caso contrario:
				centralizaTexto_Broda("Opção INVALIDA escolha novamente.")
				centralizaTexto_Broda("Reiniciando...")
				util.aguarde(2000)
				
				tlHome =  verdadeiro
			}
		}
	}
	funcao venda(){
	executaOperacao(tbEstoqueDataM, tbMarcaDataM, tbFipeDataM, creditoCliente, creditoLoja, "venda") 
	}
	funcao aluguel(){
	executaOperacao(tbEstoqueDataM, tbMarcaDataM, tbFipeDataM, creditoCliente, creditoLoja, "aluguel") 
	util.aguarde(2500)
	}
	funcao compra(){
	executaOperacao(tbEstoqueDataM, tbMarcaDataM, tbFipeDataM, creditoCliente, creditoLoja, "compra") 
	util.aguarde(2500)
	}

//	===============================    Inicio do bloco de funões	    ==================================
//	Exibe o texto dinamicamente ao centro respeitando o espaço entre as bordas e aguarda entrada de dados. 
	funcao cadeia centralizaTexto_Leia(cadeia msg){
	inteiro lineSize, startColunn , adjustColumnOdd
	cadeia entraOpcao = ""
		lineSize = txt.numero_caracteres(msg)
		startColunn = (((screenWidth -2)/2) - (lineSize/2)) 
			se (txt.numero_caracteres(msg)%2!=0){
				adjustColumnOdd = 1
			} senao adjustColumnOdd = 0
			msg = "\n|" + txt.preencher_a_esquerda(' ', startColunn-1, "") + msg 
		escreva(msg)
		leia(entraOpcao)
		escreva("|")
	retorne entraOpcao 	
	}
//	Exibe texto dinamicamente ao centro respeitando o espaço entre as bordas. 
	funcao centralizaTexto_Broda(cadeia msg){
	inteiro lineSize, startColunn , adjustColumnOdd
		lineSize = txt.numero_caracteres(msg)
		startColunn = (((screenWidth -2)/2) - (lineSize/2)) 
			se (txt.numero_caracteres(msg)%2!=0){
				adjustColumnOdd = 1
			} senao adjustColumnOdd = 0
			msg = "\n|" + txt.preencher_a_esquerda(' ', startColunn-1, "") + msg + 
			txt.preencher_a_esquerda(' ', startColunn-(adjustColumnOdd), "") + "|"
		escreva(msg)
	}
//	Exibe o texto dinamicamente posicionado nas laterais. 
	funcao justificaTexto_Broda(inteiro margem, inteiro screenW, cadeia msg1, cadeia msg2){
	inteiro adjustColumnOdd, msg1Size, msg2Size, justificador
		msg1Size = txt.numero_caracteres(msg1)
		msg2Size = txt.numero_caracteres(msg2)
		justificador = screenW-((margem*2)+msg1Size+msg2Size)-1
			se (txt.numero_caracteres(msg1)%2!=0){
				adjustColumnOdd = 1
			} senao adjustColumnOdd = 0
			msg1 = "\n|" + txt.preencher_a_esquerda(' ', margem-1, "") + msg1 + 
			txt.preencher_a_esquerda(' ', justificador, "") + msg2 + txt.preencher_a_esquerda(' ', margem-1, "")+"|"
		escreva(msg1)
	}
//	Carrega o arquivo txt que possui um padrão que seja usado como cabeçalho nas telas do app.
	funcao loadHeader(){
	inteiro contador
		 se (arq.arquivo_existe(logoFile)){
			escreva("\n Tabela com a Logo encontrado ")
			escreva("\n Carregando... ")
		 	contador = 0
			inteiro arquivo = arq.abrir_arquivo(logoFile, arq.MODO_LEITURA)
			para (inteiro i = 0 ; i < logoHeight ; i++){
				logo[i] = arq.ler_linha(arquivo)
			} 
			arq.fechar_arquivo(arquivo)
		} senao {
			escreva("\n Arquivo não encontrado : ", logoFile)
			util.aguarde(1000)
			tlHome = falso
			}
	}
//	Funçao exibe a logo na tela dinamicamente centralizada bordas [|]esquerda/direita[|]. 
//   a logo nao pode ultrapassar de (screenWidth  - 2) colunas de tamanho
	funcao showHeader(inteiro scrSize, cadeia logoM[], inteiro logoH){
	inteiro lineSize, startColunn, adjustColumnOdd
	cadeia creditoLojaCadeia, creditoClienteCadeia
		escreva("\n ",txt.preencher_a_esquerda('_', scrSize-3, ""))
		para (inteiro i = 0 ; i < logoH ; i++){
			centralizaTexto_Broda(logoM[i])
		} 
		justificaTexto_Broda(3, scrSize, "Carros em Estoque : " + nRegistrostbEstoque +"/" + (tbEstoqueMax-1) , "Carros Alugados : "+ nRegistrostbAlugado)
		creditoLojaCadeia = tipo.inteiro_para_cadeia(creditoLoja,10)  
		creditoClienteCadeia =  tipo.inteiro_para_cadeia(creditoCliente,10)  
		creditoLojaCadeia = exibeNumeroCadeiaFormatado(creditoLojaCadeia)
		creditoClienteCadeia = exibeNumeroCadeiaFormatado( creditoClienteCadeia)
		justificaTexto_Broda(3, scrSize, "Credito Loja     : R$ " + creditoLojaCadeia + ",00" , "Credito Cliente : R$ "+ creditoClienteCadeia + ",00" )
		escreva("\n|",txt.preencher_a_esquerda('_', scrSize-3, ""),"|")
	}
//	Funçao que carrega a o arrquivo txt conforme os parametros.
//	matrizData - matrix que ira receber as informaçoes.
//   file - caminho e nome do arquivo que seja trazido para memoria.
//	maxCollumns - define o limite do numero de colunas que se espera encontrar no arquivo para importadar.
//	maxLines - define o limite do numero de linhas que se espera r no arquivo para importadar.
	funcao inteiro loadTableFile(cadeia matrizData[][], cadeia file, inteiro maxCollumns, inteiro maxLines){
	cadeia 	lineData
	inteiro  	lineSize, posLaele, 
			nRegistros = 0, x = 0, i = 0
//   Verifica de o arquivo existe na constante tbEstoque antes de tentar abrir o arquivo
		se (arq.arquivo_existe(file)){
			nRegistros=0
			nRegistrostbAlugado=0
			inteiro arquivo = arq.abrir_arquivo(file, arq.MODO_LEITURA)	
			enquanto ((nao arq.fim_arquivo(arquivo)) e i<=(maxLines-1)){
				lineData = arq.ler_linha(arquivo)
				/*	Realiza a quebra da linha obtida no txt utilizando como separador o [ | ]
				Distribui as informaçoes na tbEstoqueDataM[tEstoqueMax][tColunns]   */
				lineSize = txt.numero_caracteres(lineData)
					se (lineSize>=1){
						nRegistros ++
						para (inteiro z = 0 ; z < lineSize ; z ++){
							posLaele = txt.posicao_texto("|",lineData, z)
							matrizData[i][x] = txt.extrair_subtexto(lineData, z, posLaele)
							z=posLaele
							se (x==5 e matrizData[i][x]=="0"){
								nRegistrostbAlugado ++
							}
							x++
						}
					}
			i++
			x=0
			}
			nRegistros --
			arq.fechar_arquivo(arquivo)
		} senao {
			escreva("\n Arquivo não encontrado : ", file)
			util.aguarde(3000)
			tlHome = falso
		}
	 retorne nRegistros
	}
//	Recebe um numero (cadeia) e o formata para ser exibito com o respectivo separado de ponto
	funcao cadeia exibeNumeroCadeiaFormatado( cadeia numeroEntrada){
	cadeia numeroFormatado = ""
	inteiro nCarateres
	nCarateres = txt.numero_caracteres(numeroEntrada)
		se (nCarateres%3>=1 e nCarateres>=6){
			numeroFormatado = txt.extrair_subtexto(numeroEntrada, 0, nCarateres%3)
			numeroFormatado = numeroFormatado + "." + txt.extrair_subtexto(numeroEntrada, nCarateres%3, nCarateres-3)
			numeroFormatado = numeroFormatado + "." + txt.extrair_subtexto(numeroEntrada, nCarateres -3, nCarateres)	
		} senao se (nCarateres%3>=1 e nCarateres<=5){
			numeroFormatado = txt.extrair_subtexto(numeroEntrada, nCarateres%1, nCarateres-3)
			numeroFormatado = numeroFormatado + "." + txt.extrair_subtexto(numeroEntrada, nCarateres -3, nCarateres)	
		} senao {
			numeroFormatado = txt.extrair_subtexto(numeroEntrada, nCarateres%3, nCarateres-3)
			numeroFormatado = numeroFormatado + "." + txt.extrair_subtexto(numeroEntrada, nCarateres -3, nCarateres)	

		}
		retorne numeroFormatado
	}
//	Realiza uma busca na matrix informada e remove um elemento completo, e reorganiza a matrix para nao haver espaços
	funcao deletarRegistroMemoria(cadeia matrizData[][], inteiro maxCollumns, inteiro maxLines, inteiro nRegDelete){
		para (inteiro x = nRegDelete+1 ; x<nRegistrostbEstoque+1; x++){
			para (inteiro y = 0 ; y<maxCollumns; y++){
			matrizData[x-1][y] = matrizData[x][y]
			}

		}
	nRegistrostbEstoque--
	}
//	Abre o arquivo txt com os carros em Estoque e adciona o carro negociado com o cliente.
	funcao armazenaCarroEstoqueDisco(inteiro registroSelecionado, cadeia novoIDCriado, cadeia file, cadeia matrizData[][] ){
		cadeia lineData = ""
		centralizaTexto_Broda("Salvando em disco...")
		inteiro arquivo1 = arq.abrir_arquivo(file, arq.MODO_ACRESCENTAR)	
		arq.escrever_linha(	+novoIDCriado+"|"+
						matrizData[registroSelecionado][1]+"|"+
						matrizData[registroSelecionado][3]+"|"+"SEMPLACA|"+
						matrizData[registroSelecionado][5]+"|"+
						"1|", arquivo1)
		arq.fechar_arquivo(arquivo1)
		
	}
//	SALVA DADOS NA MEMORIA SOBRE O ESTOQUE EM DISCO - utilizado quando a loja aluga um carro ou vende.
	funcao saveTableMemoriaParaArq(cadeia matrizData[][], cadeia file, inteiro maxCollumns, inteiro maxLines){
	cadeia 	lineData = ""
//   		Verifica de o arquivo existe na constante tbEstoque antes de tentar abrir o arquivo
			se (arq.arquivo_existe(file)){
//				escreva("\n Salvando em disco... ")
				centralizaTexto_Broda("Salvando em disco...")
				inteiro arquivo = arq.abrir_arquivo(file, arq.MODO_ESCRITA)	
				para (inteiro x = 0 ; x<nRegistrostbEstoque+1; x++){
					para (inteiro y = 0 ; y<maxCollumns; y++){
						lineData= lineData + matrizData[x][y]+"|"
					}
					arq.escrever_linha(lineData, arquivo)
					lineData = ""
				}
			arq.fechar_arquivo(arquivo)
			}
	}
//	Gera uma chace unica para ser utilizado como id na tabela
	funcao cadeia geraID (cadeia mEstoqueFipe[][], inteiro nRegistros, inteiro nMin, inteiro nMax){
	cadeia idGeradoTemp = "0", idGerado = "0"
	logico numExiste = verdadeiro
			faca{
				numExiste = falso
				idGeradoTemp= tipo.inteiro_para_cadeia(util.sorteia(nMin, nMax),10)
				para (inteiro i = 1 ; i<nRegistros+1 ; i++){
					se(mEstoqueFipe[i][0]==idGeradoTemp){
						numExiste = verdadeiro
					} 
				}
				se (numExiste == falso){
					idGerado = idGeradoTemp
				}
			} enquanto (numExiste== verdadeiro)
	retorne idGerado
	}
//   Busca pelo codigo da Marca e pela ID do viculo na tabela.
//	Se for nao for encontrado retorna [ 0 ] caso contrario retona o numero do resgistro.
	funcao inteiro encontraPosTabela (cadeia mEstoqueFipe[][], inteiro nRegistros, cadeia codigoMarca, cadeia codigoSel, cadeia operacao) {
	inteiro posEncontrado = 0
		se (operacao=="venda"){
			para (inteiro i = 1 ; i<nRegistros+1 ; i++){
				se(mEstoqueFipe[i][3]==codigoMarca e mEstoqueFipe[i][0]==codigoSel){
					posEncontrado= i	
				}
			}
		} se (operacao=="aluguel" ou operacao=="compra"){
			para (inteiro i = 1 ; i<nRegistros+1 ; i++){
				se(mEstoqueFipe[i][2]==codigoMarca e mEstoqueFipe[i][0]==codigoSel){
					posEncontrado= i	
				}
			}
		}
	retorne posEncontrado
	}
//   Busca pelo codigo da fipe na tabela referenciada, com os repectivos limitadores declarados.
//	Se for nao for encontrado retorna [ 0 ] caso contrario retona o numero do resgistro.
	funcao inteiro encontraPosTabelaFipe (cadeia mEstoqueFipe[][], inteiro nRegistros, cadeia codigoFip) {
	inteiro posEncontrado = 0
		para (inteiro i = 1 ; i<nRegistrostbFipe+1 ; i++){
			se(mEstoqueFipe[i][1]==codigoFip){
				posEncontrado= i	
				//escreva("codigoFip = " , codigoFip, " posEncontrado ",posEncontrado+ " ")
			}
		}
	retorne posEncontrado
	}
//  	Funcao Mestre que realiza as operaçoes dentro da Concessionária, recebe como parametro as matrizes com a base de dados previamente carregadas,
//	lista os carros no Estoque ou na Fipe, verifica se o operador escolheu opçoes validas dentro do esperado.
	funcao executaOperacao (cadeia mEstoque[][], cadeia mMarca[][], cadeia mFipe[][], inteiro credito, inteiro crediLoja, cadeia operacao) {
	cadeia confirmaOpcao = "S"
	cadeia selMarca = "", selModelo = "", msg, ctemp = "", novoIdRegistro , idFipe = ""
	inteiro contaCarrosDisponiveis = 0 , valorTransacao = 0, nTemp = 0, nRegistroSelecionado = 0, saldoFuturo =0, nRegistroFipeSelecionado = 0
	logico temSaldo= falso
	inteiro varTeste = 0
		//   Lista as opçoes de marca de veiculos e verifica se o cliente entrou com uma opcao valida.
		faca {
			//		cadeia msg1 = ""
			//		loadTableFile(mEstoque, tbEstoqueFile, tbEstoqueCollumns, tbEstoqueMax)
			limpa()
			msg = ""
			loopingMarca = verdadeiro
			loopingModelo = verdadeiro
			showHeader(screenWidth , logo, logoHeight)
			centralizaTexto_Broda("")
			//	Exibe opcoes de comando informando operaçao selecionada (aluguel/vender/comprar)
			se (operacao=="aluguel"){
				centralizaTexto_Broda("Selecione a marca do veiculo para deseja alugar")
			} senao se (operacao=="venda"){
				centralizaTexto_Broda("Selecione a marca do veiculo para deseja vender")
			} senao se (operacao=="compra"){
				centralizaTexto_Broda("Selecione a marca do veiculo que deseja comprar")
			}
				para (inteiro i = 1 ; i<=tbMarcaMax-1 ; i++){
						msg = msg + "("+ mMarca[i][0]+ ")" + mMarca[i][1] + "  "
				}
				centralizaTexto_Broda(" ")
				centralizaTexto_Broda(msg)
				centralizaTexto_Broda(" ")
				centralizaTexto_Broda("Digite um numero de " + mMarca[1][0] + " a " + mMarca[tbMarcaMax-1][0] + "  (0 para sair)")
				centralizaTexto_Broda(" ")
				selMarca = centralizaTexto_Leia("Aguardando seleção : ")
				//	Lista as marcas diponiveis para o operador carregadas de um txt para a memória.
				//	Pemanece nesta tela até que seja digitado algo diferente de [0].
				para (inteiro i = 1 ; i<=tbMarcaMax-1 ; i++){
						se (selMarca == mMarca[i][0]){
							loopingMarca = falso
							loopingModelo = verdadeiro
						}  senao se (selMarca=="0"){ 
							loopingMarca = falso 
							loopingModelo = falso
							tlHome =  verdadeiro
							}
							
			

								  
				}


					
				
		} enquanto ( loopingMarca == verdadeiro )
		//   Loop de selecao do MODELO do veiculo	
		enquanto ( loopingModelo == verdadeiro ){
					limpa()
					showHeader(screenWidth , logo, logoHeight)
					centralizaTexto_Broda("")
					centralizaTexto_Broda("Lista de veiculos em estoque da marca : " + txt.caixa_alta(mMarca[tipo.cadeia_para_inteiro(selMarca,10)][1]))
					centralizaTexto_Broda("--------------------------------------------------")
					centralizaTexto_Broda("")
					se (operacao=="aluguel"){
						justificaTexto_Broda(2, screenWidth, txt.preencher_a_esquerda(' ', 3, "COD ")  + "Modelo (Categoria)" ,"R$/Dia")
						centralizaTexto_Broda("")
						} senao se (operacao=="venda"){
							justificaTexto_Broda(2, screenWidth, txt.preencher_a_esquerda(' ', 3, "COD ")  + "Modelo (Valor Fipe em R$)" ,"Proposta R$")
							centralizaTexto_Broda("")
							} senao se (operacao=="compra"){
								justificaTexto_Broda(2, screenWidth, txt.preencher_a_esquerda(' ', 3, "COD ")  + "Modelo (Valor Fipe em R$)" ,"Proposta R$")
								centralizaTexto_Broda("")
								}
					//   Lista os carros disposniveis na FIPE compativeis com a marca selecionada pelo cliente,
					//	em uma operaçao de venda para a Loja.
					//   Esta operaçao faz ferecencia a dados na tabela Fipe, por isso é tratada em outro bloco.
					se ((operacao=="venda")){
						para (inteiro i =1 ; i<=nRegistrostbFipe; i++){
							se (selMarca==mFipe[i][3]){
								nTemp = tipo.real_para_inteiro((tipo.cadeia_para_inteiro(mFipe[i][2],10)*0.84))
								ctemp = exibeNumeroCadeiaFormatado(tipo.inteiro_para_cadeia(nTemp,10))
								justificaTexto_Broda(2, screenWidth, txt.preencher_a_esquerda(' ', 3, mFipe[i][0]) + " " 
								+mFipe[i][4] + " (R$ "+ exibeNumeroCadeiaFormatado( mFipe[i][2]) +")", " R$ " + ctemp)
								contaCarrosDisponiveis++
								}
						}
					}
					//   Lista os carros disposniveis em ESTOQUE compativeis com a marca selecionada pelo cliente, 
					//	em uma operaçao COMPRA ou ALUGUEL na Loja.
					se ((operacao=="compra") ou (operacao=="aluguel")){
						para (inteiro i = 1; i<=nRegistrostbEstoque+1; i++){
							para (inteiro x = 1 ; x<=nRegistrostbFipe; x++){
								se(mEstoque[i][1]==mFipe[x][1] e mFipe[x][3]==selMarca e mEstoque[i][5]=="1"){
									se (operacao=="aluguel"){
									justificaTexto_Broda(2, screenWidth, txt.preencher_a_esquerda(' ', 3, mEstoque[i][0]) + " " + +mFipe[x][4]+ " ("+ categoriaValorAluguel[tipo.cadeia_para_inteiro(mEstoque[i][4],10)][0]+")"," R$ " + categoriaValorAluguel[tipo.cadeia_para_inteiro(mEstoque[i][4],10)][1])
									contaCarrosDisponiveis++
									} senao {
										nTemp = tipo.real_para_inteiro((tipo.cadeia_para_inteiro(mFipe[x][2],10)*1.31))
										ctemp = exibeNumeroCadeiaFormatado(tipo.inteiro_para_cadeia(nTemp,10))
										justificaTexto_Broda(2, screenWidth, txt.preencher_a_esquerda(' ', 3, mEstoque[i][0]) + " " + +mFipe[x][4]+ " (R$ "+ exibeNumeroCadeiaFormatado(mFipe[x][2])+")"," R$ " + ctemp)
										contaCarrosDisponiveis++
									}
								}
							}
						}
					}

					centralizaTexto_Broda("")
					centralizaTexto_Broda("Digite o codigo do veiculo desejado (0 para retornar):")
					centralizaTexto_Broda(" ")
					selModelo = centralizaTexto_Leia("Aguardando seleção : ")

					//	Verifica se o usurio digitou um codigo valido ou se deseja sair, 
					//	Realiza a busca pela numero de registro na tabela onde o carro esta armazenado.
					//	Se nao for encontraro, sera informado ao usurario e lhe sera solicitado novo codigo.
					se (operacao=="venda"){
						nRegistroSelecionado = encontraPosTabela (mFipe, nRegistrostbFipe, selMarca, selModelo, operacao)
						} senao se (operacao=="aluguel"){
						nRegistroSelecionado = encontraPosTabela (mEstoque, nRegistrostbEstoque, selMarca, selModelo, operacao)
							} senao se (operacao=="compra"){
							nRegistroSelecionado = encontraPosTabela (mEstoque, nRegistrostbEstoque, selMarca, selModelo, operacao)
							nRegistroFipeSelecionado = encontraPosTabelaFipe(mFipe, nRegistrostbFipe, mEstoque[nRegistroSelecionado][1]) 
							}
					
				
					se (selModelo!="0" e nRegistroSelecionado!=0){



						se (operacao=="venda"){
							valorTransacao = tipo.real_para_inteiro(tipo.cadeia_para_inteiro(mFipe[nRegistroSelecionado][2],10)*0.84)	
							saldoFuturo= creditoLoja - valorTransacao 
								} senao se (operacao=="aluguel" ){ 
									valorTransacao = tipo.cadeia_para_inteiro(categoriaValorAluguel[tipo.cadeia_para_inteiro(mEstoque[nRegistroSelecionado][4],10)][1],10)
									saldoFuturo= creditoCliente - valorTransacao 
									} senao se (operacao=="compra" ){
										nRegistroSelecionado = encontraPosTabela (mEstoque, nRegistrostbEstoque, selMarca, selModelo, operacao)
										nRegistroFipeSelecionado = encontraPosTabelaFipe(mFipe, nRegistrostbFipe, mEstoque[nRegistroSelecionado][1]) 
										valorTransacao = tipo.real_para_inteiro(tipo.cadeia_para_inteiro(mFipe[nRegistroFipeSelecionado][2],10)*1.31)
										saldoFuturo= creditoCliente - valorTransacao 
										}

							se (saldoFuturo>=0){ 
								temSaldo= verdadeiro
								centralizaTexto_Broda("Confirma " + operacao + " deste veiculo ?")
								opcaoMenu=centralizaTexto_Leia("Digite (S) para Sim ou (N) para cancelar : ")
								centralizaTexto_Broda("")
									se (txt.caixa_alta(opcaoMenu)=="N"){
										selModelo="0"	
									}
//								util.aguarde(3500)
								} senao { temSaldo= falso	}
						se ( temSaldo== falso){
							selModelo="0"	
							centralizaTexto_Broda("A loja não possui saldo para comprar este carro.")
							centralizaTexto_Broda("Compre carros de nosso estoque para obter credito.")
							centralizaTexto_Broda("")
							util.aguarde(500)
						}
						//	Se o clicnete confirmar a operacao e houver saldo, concluimos a operacao.
						se (temSaldo e txt.caixa_alta(opcaoMenu)=="S"){

							se (operacao=="venda"){
							centralizaTexto_Broda("Seu carro foi comprado, a CARS agradece.")
							centralizaTexto_Broda("")
							//	Gerando um novo ID para ser usado com o novo carro ao Estoque.
							novoIdRegistro= geraID (mEstoque, nRegistrostbEstoque, 1, tbEstoqueMax-1)
							armazenaCarroEstoqueDisco(nRegistroSelecionado, novoIdRegistro, tbEstoqueFile, mFipe )
							nRegistrostbEstoque = loadTableFile(tbEstoqueDataM, tbEstoqueFile, tbEstoqueCollumns, tbEstoqueMax)
							creditoCliente = creditoCliente + valorTransacao
							creditoLoja = creditoLoja - valorTransacao
							selModelo="0"
							util.aguarde(500)
							}
							se (operacao=="aluguel"){
							centralizaTexto_Broda("Seu carro foi alugado, a CARS agradece.")
							centralizaTexto_Broda("")
							mEstoque[nRegistroSelecionado][5]="0"
							saveTableMemoriaParaArq(mEstoque, tbEstoqueFile, tbEstoqueCollumns, tbEstoqueMax)
							nRegistrostbEstoque = loadTableFile(tbEstoqueDataM, tbEstoqueFile, tbEstoqueCollumns, tbEstoqueMax)
							creditoCliente = creditoCliente - valorTransacao
							creditoLoja = creditoLoja + valorTransacao
							selModelo="0"
							util.aguarde(500)
							}
							se (operacao=="compra"){
							centralizaTexto_Broda("Seu carro foi vendido, a CARS agradece.")
							centralizaTexto_Broda("")
							// carrega funcao que remover aquivodoEstoque
							deletarRegistroMemoria(mEstoque, tbEstoqueCollumns, tbEstoqueMax, nRegistroSelecionado)
							saveTableMemoriaParaArq(mEstoque, tbEstoqueFile, tbEstoqueCollumns, tbEstoqueMax)
							nRegistrostbEstoque = loadTableFile(tbEstoqueDataM, tbEstoqueFile, tbEstoqueCollumns, tbEstoqueMax)
							creditoCliente = creditoCliente - valorTransacao
							creditoLoja = creditoLoja + valorTransacao
							selModelo="0"
							util.aguarde(4500)
							}
						}
					// Verifica se o cliente digitou um codigo de veiculo valido.						
					} senao se (selModelo!="0" e nRegistroSelecionado==0){
						centralizaTexto_Broda("Codigo digitado Invalido.")
						centralizaTexto_Broda("Entre com o codigo de um carro acima.")
						util.aguarde(2500)
						}
	
			//	Verifica se o usuario deseja sair da seleçao e se não carros disponiveis para selecionar
			//	em ambos os casos o usuario é informado e redirecionado a tela inicial.
			se (selModelo=="0") {
				centralizaTexto_Broda("Retornando ao Inicio...")
				loopingModelo = falso
				tlHome =  verdadeiro
				util.aguarde(500)	
			}	senao se (contaCarrosDisponiveis<1){
				centralizaTexto_Broda("Não há carros desta marca disponiveis...")
				loopingModelo = falso
				tlHome =  verdadeiro
				util.aguarde(1500)	
			}
		
		} 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 631; 
 * @DOBRAMENTO-CODIGO = [238, 267, 280, 298, 336];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, matriz, funcao;
 */