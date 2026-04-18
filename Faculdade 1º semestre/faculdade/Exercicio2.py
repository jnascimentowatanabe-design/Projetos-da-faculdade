senha = input('crie uma senha (8 caracteres e 1 número): ')
lista_senha = senha.split()

for caractere in lista_senha:
    if len(lista_senha) != 8 and not senha.isdigit():
        print('erro, senha não válida')
        return
    else:
        print('senha válida')