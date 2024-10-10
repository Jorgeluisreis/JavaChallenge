# Documentação do SistemaCadastro em Java

## Visão Geral

Este programa, parte do repositório [Java Challenge](https://github.com/Jorgeluisreis/JavaChallenge), implementa um sistema simples de cadastro de pessoas que armazena nomes, idades e cidades. Ele permite realizar operações como exibir todas as pessoas cadastradas, filtrar pessoas por cidade, buscar por nome, verificar maioridade e realizar ordenações por nome ou idade. O sistema foi projetado com foco nos fundamentos de Java, como controle de fluxo, manipulação de strings, métodos e estruturas de dados como arrays, listas, sets e mapas.

---

## Estrutura Geral do Código

- **Pacote**: Não há pacotes definidos, o código está contido diretamente em um único arquivo `Main.java`, com o foco em aplicar os fundamentos de Java.
- **Classe Principal**: O código está na classe principal `Main`, que contém o método `main` como ponto de entrada da aplicação.

- **Coleções Utilizadas**:
  - `List` para armazenar nomes, idades e cidades.
  - `Set` para garantir que não haja nomes duplicados.
  - `Map` para contar o número de habitantes por cidade.

---

## Detalhes do Fluxo do Programa

1. **Inicialização**:

   - São criadas listas (`nomes`, `idades`, `cidades`) para armazenar as informações cadastradas.
   - Um `Set` (`nomesSet`) é usado para evitar a inserção de nomes duplicados.
   - Um `Map` (`habitantesPorCidade`) armazena a quantidade de habitantes por cidade.

2. **Cadastro de Pessoas**:

   - O método `cadastrarPessoa` recebe o nome, a idade e a cidade de uma pessoa. Se o nome for único (verificado pelo `Set`), ele é adicionado às listas.
   - Caso o nome já exista, uma mensagem de erro é exibida.
   - O número de habitantes por cidade é atualizado no `Map`.

3. **Exibição dos Cadastros**:

   - O método `exibirPessoas` imprime todas as pessoas cadastradas, exibindo nome, idade e cidade.

4. **Filtragem e Busca**:

   - O método `filtrarPorCidade` exibe as pessoas cadastradas em uma cidade específica.
   - O método `buscarPessoaPorNome` permite encontrar uma pessoa pelo nome, exibindo suas informações se encontrada.

5. **Verificação de Maioridade**:

   - O método `verificarMaioridade` recebe uma idade e exibe se a pessoa é maior ou menor de idade.

6. **Operações com Idades**:

   - Um método simples, `calcularSomaDeIdades`, recebe duas idades e retorna sua soma.

7. **Iteração e Ordenação**:
   - O método `percorrerComIterator` usa um `Iterator` para percorrer a lista de nomes e exibi-los.
   - Métodos como `ordenarPorNome` e `ordenarPorIdade` ordenam e exibem as listas de nomes ou idades em ordem crescente.

---

## Tratamento de Erros

O tratamento de erros no sistema ocorre principalmente na fase de cadastro de pessoas:

- Ao tentar cadastrar uma pessoa com um nome já existente, uma mensagem de "Nome duplicado" é exibida.
- Nas demais operações, o programa assume que as entradas estão corretas, sendo um sistema básico sem interface de entrada dinâmica de dados.

---

## Conclusão

Este programa de cadastro é uma implementação simples que utiliza conceitos fundamentais de Java, como controle de fluxo, métodos reutilizáveis e coleções. Ele é fácil de expandir, podendo incluir funcionalidades adicionais como remoção de cadastros, atualização de dados ou mesmo uma interface gráfica para melhorar a experiência do usuário. O código exemplifica o uso de listas, conjuntos e mapas para manipular dados de maneira eficiente e garantir a integridade das informações.
