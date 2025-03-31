# Try Catch
## DESENVOLVIMENTO DE SISTEMAS
## INSTRUTOR: PAULO ROBERTO MARTINS
Atividade desenvolvida para o curso desenvolvimento de sistema do SENAI CTTI, instruida pelo pofessor Paulo Roberto


## Enunciados
###Exercício 1 - Divisão por Zero
Crie um programa que solicite ao usuário dois números inteiros e realize a divisão entre
eles. Utilize um bloco try-catch para capturar e tratar a exceção de divisão por zero
(ArithmeticException), exibindo uma mensagem de erro caso o usuário tente dividir por
zero.

### Exercício 2 - Conversão de String para Número
Crie um programa que peça ao usuário para inserir um número. Use try-catch para capturar
e tratar a exceção NumberFormatException caso o usuário insira um valor inválido.

###Exercício 3 - Raiz Quadrada de um Número
Crie um programa que peça ao usuário para inserir um número e calcule sua raiz
quadrada. Use try-catch para capturar e tratar a exceção IllegalArgumentException
caso o usuário insira um número negativo.

###Exercício 4 - Soma de Dois Números
Crie um programa que solicite ao usuário dois números e realize a soma. Utilize try-
catch para capturar e tratar a exceção InputMismatchException caso o usuário insira
um valor que não seja um número.

###Exercício 5 - Acesso a Índice Inválido em um Array
Crie um programa que solicite ao usuário um índice e tente acessar um elemento de um
array fixo de números inteiros. Utilize try-catch para capturar e tratar a exceção
ArrayIndexOutOfBoundsException, caso o usuário informe um índice fora dos limites do
array.

###Exercício 6 - Cadastro de Usuário com Validação
Crie um programa que solicite ao usuário um nome e uma idade. Se o usuário inserir um
nome vazio ou uma idade negativa, o programa deve lançar e capturar uma exceção
personalizada chamada DadosInvalidosException.

###Exercício 7 - Calculadora de Média de Notas
Crie um programa que calcule a média de três notas inseridas pelo usuário. Utilize try-catch
para capturar e tratar exceções, como InputMismatchException, caso o usuário insira um
valor que não seja um número.

###Exercício 8 - Verificação de Idade para Maioridade
Crie um programa que peça a idade de uma pessoa e verifique se ela é maior de idade (18
anos ou mais). Caso o valor inserido seja negativo, lance e trate uma exceção
personalizada chamada IdadeInvalidaException.

###Exercício 9 - Conversão de Temperatura com Verificação de Intervalo
Crie um programa que converta a temperatura de Celsius para Fahrenheit. O programa
deve solicitar ao usuário a temperatura em Celsius e, caso a temperatura fornecida seja
menor que -273.15 (o zero absoluto), lance uma exceção personalizada chamada
TemperaturaInvalidaException. Caso o usuário insira um valor não numérico, o programa
deve capturar e tratar a exceção InputMismatchException.

###Exercício 10 - Calculadora de Fatorial com Exceção para Limite de Recursão
Crie um programa que calcule o fatorial de um número fornecido pelo usuário. O cálculo de
fatorial deve ser feito utilizando recursão. Caso o número fornecido seja negativo, o
programa deve lançar uma exceção personalizada chamada NumeroNegativoException.
Além disso, o programa deve garantir que o número fornecido não seja maior que 20 (para
evitar problemas com a recursão e estouro de pilha) e lançar uma exceção
LimiteFatorialExcedidoException caso o número seja maior que 20.
