//contas 
function somatoria(a, b) {
    return soma = a + b;
}

function subtracao(a, b) {
    return menos = a - b;
}

function multiplicacao(a, b) {
    return multiplicacao = a * b;
}

function divisao(a, b) {
    if (b !== 0) {
        divisao = a / b;
    } else {
        alert('conta inválida');
    }
}
// comando de funcionamento.

function calculadora(operacao, a, b) {
    switch (operacao) {
        case 'soma':
            return somatoria(a, b);

        case 'subtracao':
            return subtracao(a, b);

        case 'multiplicação':
            return multiplicacao(a, b);

        case 'divisão':
            return divisao(a, b);
        
        default:
            alert('operação inválida');
    }
}

//tornando o código real
let resultado = calculadora(operação, a, b)

operacao = prompt('qual é a operação que deseja: ')
a = parseInt(prompt('selecione um número: '))
b = parseInt(prompt('selecione outro número: '))

alert(resultado)
