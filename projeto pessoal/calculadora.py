class Pilha():
    def __init__(self):
        self.elementos = []
    def push(self, elemento):
        self.elementos.append(elemento)
    def pop(self):
        if not self.esta_vazia():
            return self.elementos.pop()
        return None
    def peek(self):
        if not self.esta_vazia():
            return self.elementos[-1]
        return None
    def esta_vazia(self):
        return len(self.elementos) == 0

def menu():
    print(''' ===== c a l c u l a d o r a ===== 
    operações disponíveis (com 2 ou mais números): 
    1 --> somatória 
    2 --> subtração
    3 --> multiplicação
    4 --> divisão
    operações disponíveis (com 1 número):
    5 --> raiz quadrada
    6 --> fatorial 
    para sair do total acumulativo é só clicar no 0, quando for inserir a operação
    [Confira as atualizações dessa calculadora: 
    - Com a função de pilha, ao realizar o cálculo, o total torna acumulativo]''')

    if not pilha.esta_vazia():
        print(f'Total acumulativo: {pilha.peek()}')
    selecionado = input('Qual operação você quer selecionar? (use os números): ')
    if selecionado == '1':
        somatoria()
    elif selecionado == '2':
        subtracao()
    elif selecionado == '3':
        multiplicacao()
    elif selecionado == '4':
        divisao()
    elif selecionado == '5':
        raiz_quadrada()
    elif selecionado == '6':
        fatorial()
    elif selecionado == '0':
        pilha.elementos.clear()  # Limpa a pilha para reiniciar o total acumulativo
        print('Total acumulativo resetado.')
        return menu()

def somatoria():
    numeros = input('Digite os números para somar, separados por espaço: ')
    numeros = list(map(float, numeros.split()))
    resultado = sum(numeros)
    pilha.push(resultado)  # Adiciona o resultado à pilha
    print(f'Resultado da somatória: {resultado}')
    return menu()

def subtracao():
    numeros = input('Digite os números para subtrair, separados por espaço: ')
    numeros = list(map(float, numeros.split()))
    resultado = numeros[0]
    for num in numeros[1:]:
        resultado -= num
    pilha.push(resultado)  # Adiciona o resultado à pilha
    print(f'Resultado da subtração: {resultado}')
    return menu()

def multiplicacao():
    numeros = input('Digite os números para multiplicar, separados por espaço: ')
    numeros = list(map(float, numeros.split()))
    resultado = 1
    for num in numeros[1:]:
        resultado *= num 
    pilha.push(resultado)
    print(f'Resultado da multiplicação: {resultado}')
    return menu()

def divisão():
    



