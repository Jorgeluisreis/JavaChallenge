
# Documentação da Calculadora Simples em Java

  

## Visão Geral

  

Este programa feito para o repositório [Java Challenge](https://github.com/Jorgeluisreis/JavaChallenge) implementa uma calculadora simples que aceita dois números inteiros e realiza operações aritméticas básicas (soma, subtração, multiplicação ou divisão) com base na escolha do usuário. O programa utiliza tratamento de exceções para gerenciar entradas inválidas e lida com erros específicos, como a divisão por zero.

  

---

  

## Estrutura Geral do Código

  

-  **Pacote**: O código está no pacote `com.Jorgeluisreis.Calculadora`, organizando a classe dentro de um namespace específico.

-  **Classe Principal**: Há uma única classe chamada `Main`, que contém o método `main`, o ponto de entrada da aplicação.

-  **Importações**: O código importa a biblioteca `java.util.*`, usando tudo que for necessário nesta aplicação.

  

---

  

## Detalhes do Fluxo do Programa

  

1.  **Inicialização**: O programa começa criando uma instância de `Scanner` para ler a entrada do usuário e define algumas variáveis para armazenar os números e a operação.

2.  **Entrada de Dados**: Utiliza um loop `do-while` para solicitar ao usuário que insira dois números inteiros e uma operação. O loop continua até que a entrada seja válida.

  

3.  **Tratamento de Exceções**: Dentro do loop, um bloco `try-catch` é utilizado para capturar exceções:

-  **InputMismatchException**: Captura erros quando o usuário insere um tipo de dado incorreto (não inteiro).

-  **IllegalArgumentException**: Pode ser usada para lançar erros relacionados a argumentos inválidos.

-  **StringIndexOutOfBoundsException**: Captura erros quando o usuário não fornece uma operação.

  

4.  **Cálculo e Exibição do Resultado**: Após obter entradas válidas, um `switch` é utilizado para determinar qual operação executar com base na escolha do usuário. As operações suportadas são:

-  **Soma**: Se o usuário escolher `+`, o programa calcula e exibe a soma.

-  **Subtração**: Para `-`, o programa calcula e exibe a diferença.

-  **Multiplicação**: Para `*`, o programa calcula e exibe o produto.

-  **Divisão**: Para `/`, o programa verifica se o divisor é zero. Se for, exibe uma mensagem de erro; caso contrário, calcula e exibe o quociente.

  

5.  **Fechamento do Scanner**: Ao final do programa, o objeto `Scanner` é fechado para liberar recursos.

  

---

  

## Tratamento de Erros

  

O tratamento de erros é uma parte crucial do programa, pois garante que o usuário tenha uma experiência suave. Se uma entrada inválida for fornecida, uma mensagem de erro apropriada é exibida, e o usuário é solicitado a tentar novamente, até que entradas válidas sejam recebidas.

  

---

  

## Conclusão

  

Esse programa fornece uma implementação básica de uma calculadora em Java, destacando conceitos fundamentais como controle de fluxo, manipulação de exceções e operações aritméticas. Ele pode ser expandido para incluir funcionalidades adicionais, como suporte a operações mais complexas ou uma interface gráfica para melhorar a interação do usuário.