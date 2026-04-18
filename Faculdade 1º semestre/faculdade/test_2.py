contagem = 10 
lista = []

while 0 < contagem <= 10:
	contagem -= 1
	lista.append(contagem)
	if contagem == 0:
		status = 'tempo esgotrado'
		lista.append(status)
	elif contagem % 2 == 0:
		status = '- par'
		lista.append(status)
	else:
		status = '- impar'
		lista.append(status)
print(lista)
		