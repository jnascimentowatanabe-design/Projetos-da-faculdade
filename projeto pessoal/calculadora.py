#calculadora 
lista_de_numeros = []
conta = input('selecione a conta que você quer ralizar: ')

for i in range(2):
    numeros = float(input('selecione números que deseja: '))
    lista_de_numeros.append(numeros)

def somatoria (lista_de_numeros):
    resultado = lista_de_numeros[0] + lista_de_numeros[1]
    return resultado 

def subtracao (lista_de_numeros):
    resultado = lista_de_numeros[0] - lista_de_numeros[1]
    return resultado 

def multiplicacao (lista_de_numeros):
    resultado = lista_de_numeros[0] * lista_de_numeros[1]
    return resultado 

def divisao (lista_de_numeros):
    if lista_de_numeros[1] <= 0:
        print('não tem como realizar a conta se o divisor é menor ou igual a 0')
    else:
        resultado = lista_de_numeros[0] / lista_de_numeros[1]
        return resultado 

if conta == 'soma':
    resultado = somatoria(lista_de_numeros)
    print(f'a soma é: {resultado}')
elif conta == 'subtração':
    resultado = subtracao(lista_de_numeros)
    print(f' a subtração é: {resultado}')
elif conta == 'multiplicação':
    resultado = multiplicacao(lista_de_numeros)
    print(f'a multiplicação é: {resultado}')
elif conta == 'divisão': 
    resultado = divisao(lista_de_numeros)
    print(f'a divisão é: {resultado}')



