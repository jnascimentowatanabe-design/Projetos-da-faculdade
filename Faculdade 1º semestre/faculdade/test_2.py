def menu():
    # Mostrar o menu e selecionar a função correspondente ao pedido do usuário
    print(""" -------------- M E N U ---------------
    1. Atividade 1
    2. atividade 2
    3. atividade 3
    4. atividade 4
    5. atividade 5
    6. atividade 6
    7. atividade 7
    8. atividade 8
    9. atividade 9
    10. atividade 10
    11. sair
    """)

    selecionado = input('Qual opção você quer selecionar? (use os números): ')

    if selecionado == '1':
        atividade_1()
    elif selecionado == '2':
        atividade_2()
    elif selecionado == '3':
        atividade_3()
    elif selecionado == '4':
        atividade_4()
    elif selecionado == '5':
        atividade_5()
    elif selecionado == '6':
        atividade_6()
    elif selecionado == '7':
        atividade_7()
    elif selecionado == '8':
        atividade_8()
    elif selecionado == '9':
        atividade_9()
    elif selecionado == '10':
        atividade_10()
    elif selecionado == '11':
        sair()


def atividade_1():
    """
    Demonstra operações básicas com listas.
    Exibe uma lista de frutas, acessa o primeiro e último elemento,
    e mostra o total de itens na lista.
    """
    lista_de_frutas = ['maçã', 'banana', 'laranja', 'uva', 'morango']
    print(f"""
    As frutas são: {lista_de_frutas}
    A primeira fruta: {lista_de_frutas[0]}
    A última fruta: {lista_de_frutas[-1]}
    Total de frutas: {len(lista_de_frutas)}""")

    return menu()

def atividade_2():
    """
    Gerencia uma lista de tarefas.
    Cria uma lista, adiciona tarefas, exibe a lista, remove a primeira tarefa
    e exibe a lista atualizada.
    """ 
    tarefas = []

    tarefas.append('Estudar Python')
    tarefas.append('Fazer Exercícios')
    tarefas.append('Ler livro')

    print(tarefas)
    print(f'Removendo da lista de tarefas: {tarefas[0]}')
    tarefas.remove('Estudar Python')

    print(tarefas)
    return menu()

def atividade_3():
    """
    Trabalha com dicionários para armazenar informações de um aluno.
    Itera sobre os pares chave-valor, exibe cada dado, adiciona uma nova chave (nota)
    e mostra o dicionário atualizado.
    """
    dicionario_aluno = {'nome': 'João Silva', 'idade': 20, 'curso': 'Ciência da Computação'}

    for chave, valor in dicionario_aluno.items():
        print(f'{chave} : {valor}')

    dicionario_aluno['nota'] = 8.5

    print(f'Dicionário Atualizado: {dicionario_aluno} ')

    return menu()
    
def atividade_4():
    """
    Demonstra o desempacotamento de tuplas.
    Cria tuplas com coordenadas (x, y, z), exibe os valores,
    modifica uma variável e trabalha com uma segunda tupla.
    """
    x, y, z = (10, 20, 30)
    
    print(f'ponto A: {x, y, z}')
    print(f"""Ponto x: {x}
    Ponto y: {y}
    Ponto z: {z} """)

    x = 40

    a, b, c = (5, 15, 25)
    print(f'ponto B: {a, b, c}')

    return menu()

def atividade_5():
    """
    Gerencia um inventário de produtos.
    Armazena produtos em uma lista de dicionários com nome, preço e quantidade,
    exibe cada produto formatado e calcula o valor total do estoque.
    """
    lista_de_objetos = [{'Nome' :'Notebook', 'Preço': 3000.0, 'quantidade' : '5'},
    {'Nome': 'Mouse','Preço': 50.00,'quantidade': '20'},
    {'Nome': 'Teclado','Preço': 150.00,'quantidade': '15'}]

    for i in lista_de_objetos:
    	print(f'Produto: {i["Nome"]} | Preço: {i["Preço"]} | Quantidade: {i["quantidade"]}')

    preco_total = lista_de_objetos[0]['Preço'] + lista_de_objetos[1]['Preço'] + lista_de_objetos[2]['Preço'] 

    print(f'Valor total do estoque: {preco_total}')

    return menu()

def atividade_6():
	"""
	Classifica números em duas listas: pares e ímpares.
	Itera sobre uma lista de números, separa-os conforme sua paridade
	e exibe as três listas (original, pares e ímpares).
	"""
	lista_de_numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	lista_impares = []
	lista_pares = []

	for i in lista_de_numeros: 
		if i % 2 == 0:
			lista_pares.append(i)
		else:
			lista_impares.append(i)

	print(f"""Lista de Números {lista_de_numeros}
	Lista de pares: {lista_pares}
	Lista de impares: {lista_impares}
	""") 

	return menu()

def atividade_7():
	"""
	Calcula e exibe a média de notas por disciplina.
	Armazena disciplinas com suas respectivas notas em uma lista de dicionários,
	calcula a média de cada disciplina e identifica qual teve o melhor desempenho.
	"""
	disciplinas = [{'Matemática' : [8.0, 7.5, 9.0, 8.5]}, {'Português' : [7.0, 8.0, 7.5, 8.5]}, {'História' : [9.0, 9.5, 8.5, 9.0]}]

	print('__________Menu de Notas__________')

	for i in disciplinas: 
		for chave in i:
			media = sum(i[chave]) / len(i[chave])
			lista_de_media = []
			lista_de_media.append(media)
			print(f""" {chave}: notas {i[chave]} - Média: {media}""")
	for j in lista_de_media:
		print(f'O melhor desempenho foi: {chave} ({max(lista_de_media)})')

	return menu()

def atividade_8():
	"""
	Busca contatos por nome em uma agenda.
	Armazena contatos em uma lista de dicionários, permite buscar um contato
	por nome, exibe o resultado da busca e mostra a lista completa de contatos.
	"""
	contatos = [{'João' : '(11) 1234-5678'}, {'Maria' :'(11) 8765-4321'}, {'Pedro' : '(21) 9999-8888'}, {'Ana' : '(85) 7777-6666'}]

	selecao = input('Buscar contatos: ')

	for i in contatos:
		for chave in i:
			
			if selecao == chave:
				print(f'Nome: {chave} | telefone: {i[chave]}')                    
	if selecao not in [chave for contato in contatos for chave in contato]:
		print('Não encontrado')
					

	print('=== LISTA DE CONTATOS ===')
	for i in contatos:
		for chave in i:
			print(f'{chave}: {i[chave]}')
	return menu()			

def atividade_9():
	"""
	Gera um relatório detalhado de vendas.
	Armazena dados de vendas (produto, quantidade, valor unitário),
	calcula o total por venda, o total geral de faturamento
	e exibe um relatório formatado de todas as transações.
	"""
	vendas = [
    {"produto": "Notebook", "quantidade": 2, "valor_unitario": 3000.00},
    {"produto": "Mouse",    "quantidade": 5, "valor_unitario": 50.00},
    {"produto": "Teclado",  "quantidade": 3, "valor_unitario": 150.00},
	]

	print("=== RELATÓRIO ===")

	total_geral = 0

	for i, venda in enumerate(vendas, start=1):  

		total = venda["quantidade"] * venda["valor_unitario"]

		total_geral += total  # 

		print(f"\nVenda {i}: {venda['produto']}")
		print(f"  Quantidade: {venda['quantidade']}")
		print(f"  Valor unitário: R$ {venda['valor_unitario']:.2f}")
		print(f"  Total: R$ {total:.2f}")

		print(f"\nTOTAL GERAL: R$ {total_geral:.2f}")

	return menu()

def atividade_10():
	"""
	Busca e analisa uma biblioteca de livros.
	Armazena livros com título, autor, ano e categorias, permite buscar por categoria,
	exibe os livros encontrados e mostra estatísticas (total de livros, mais novo e mais antigo).
	"""
	livros = [{'Título': 'Python para Iniciantes', 'Autor' : 'Luciano Ramalho', 'ano': 2024, 'categorias': ['programação', 'iniciantes']},
	{'Título': 'Algoritmos em Python', 'Autor' : 'Luciano Ramalho', 'ano': 2023, 'categorias': ['programação', 'algoritmos']},
	{'Título': 'AI Engineering: Building Applications with Foundation Models ', 'Autor' : 'Chip Huyen', 'ano': 2023, 'categorias': ['IA', 'engenharia']},
	{'Título': 'Projetando sistemas de machine learning: ', 'Autor' : 'André Esteva', 'ano': 2022, 'categorias': ['machine learning', 'projeto']} ]

	selecao = input('Selecione uma categoria de livro: ')

	print('============LIVROS ENCONTRADOS=============')

	encontrado = False

	for i in livros:

		if selecao in i['categorias']:
			print(f'Os livros da categoria são: \n {i}')
			encontrado = True

	if not encontrado:
		print('Nenhum livro encontrado para a categoria selecionada.')

	anos = [i['ano'] for i in livros]

	total_de_livros = len(livros)
	livro_novo = max(anos)
	livro_velho = min(anos)

	print(f' =====Estátistica===== \n Total de livros: {total_de_livros} \n Livro mais novo: {livro_novo} \n Livro mais velho: {livro_velho}')

	return menu()


def sair():
	"""
	Encerra o programa exibindo uma mensagem de despedida.
	"""
	print('Saindo do programa...')


menu()

