import java.util.*;

public class Main {

    // Lista para armazenar os nomes das pessoas
    private static List<String> nomes = new ArrayList<>();
    // Lista para armazenar as idades das pessoas
    private static List<Integer> idades = new ArrayList<>();
    // Lista para armazenar as cidades das pessoas
    private static List<String> cidades = new ArrayList<>();
    // Set para garantir que não haja nomes duplicados
    private static Set<String> nomesSet = new HashSet<>();
    // Map para armazenar a quantidade de habitantes por cidade
    private static Map<String, Integer> habitantesPorCidade = new HashMap<>();

    public static void main(String[] args) {
        // Cadastro de exemplo
        cadastrarPessoa("Ana", 25, "São Paulo");
        cadastrarPessoa("Carlos", 17, "Rio de Janeiro");
        cadastrarPessoa("Maria", 19, "São Paulo");

        // Exibir todas as pessoas cadastradas
        exibirPessoas();

        // Filtrar pessoas por cidade
        filtrarPorCidade("São Paulo");

        // Exibir o número de habitantes por cidade
        exibirHabitantesPorCidade();

        // Buscar pessoa por nome
        buscarPessoaPorNome("Ana");

        // Verificar maioridade
        verificarMaioridade(25); // Exemplo de verificação

        // Operações matemáticas com idades
        int soma = calcularSomaDeIdades(25, 17);
        System.out.println("Soma das idades: " + soma);

        // Percorrer a lista com Iterator
        percorrerComIterator();

        // Ordenar por nome e exibir
        ordenarPorNome();

        // Ordenar por idade e exibir
        ordenarPorIdade();
    }

    // Método para cadastrar pessoa
    public static void cadastrarPessoa(String nome, int idade, String cidade) {
        if (nomesSet.add(nome)) { // Verifica se o nome já existe no Set (para evitar duplicação)
            nomes.add(nome);
            idades.add(idade);
            cidades.add(cidade);

            // Atualizar o número de habitantes por cidade
            habitantesPorCidade.put(cidade, habitantesPorCidade.getOrDefault(cidade, 0) + 1);
        } else {
            System.out.println("Nome duplicado: " + nome);
        }
    }

    // Método para exibir todas as pessoas cadastradas
    public static void exibirPessoas() {
        System.out.println("Pessoas cadastradas:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i) + ", Idade: " + idades.get(i) + ", Cidade: " + cidades.get(i));
        }
    }

    // Método para filtrar pessoas por cidade
    public static void filtrarPorCidade(String cidade) {
        System.out.println("Pessoas na cidade " + cidade + ":");
        for (int i = 0; i < cidades.size(); i++) {
            if (cidades.get(i).equalsIgnoreCase(cidade)) {
                System.out.println("Nome: " + nomes.get(i) + ", Idade: " + idades.get(i));
            }
        }
    }

    // Método para exibir número de habitantes por cidade
    public static void exibirHabitantesPorCidade() {
        System.out.println("Habitantes por cidade:");
        for (Map.Entry<String, Integer> entry : habitantesPorCidade.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Método para buscar pessoa por nome
    public static void buscarPessoaPorNome(String nome) {
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase(nome)) {
                System.out.println("Detalhes da pessoa: Nome: " + nomes.get(i) + ", Idade: " + idades.get(i)
                        + ", Cidade: " + cidades.get(i));
                return;
            }
        }
        System.out.println("Pessoa com nome " + nome + " não encontrada.");
    }

    // Método para verificar se a pessoa é maior de idade
    public static void verificarMaioridade(int idade) {
        if (idade >= 18) {
            System.out.println("Pessoa maior de idade.");
        } else {
            System.out.println("Pessoa menor de idade.");
        }
    }

    // Método para calcular a soma de duas idades
    public static int calcularSomaDeIdades(int idade1, int idade2) {
        return idade1 + idade2;
    }

    // Método para percorrer a lista com Iterator
    public static void percorrerComIterator() {
        System.out.println("Percorrendo a lista com Iterator:");
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println(nome);
        }
    }

    // Método para ordenar a lista de pessoas por nome
    public static void ordenarPorNome() {
        List<String> nomesOrdenados = new ArrayList<>(nomes);
        Collections.sort(nomesOrdenados);
        System.out.println("Pessoas ordenadas por nome:");
        for (String nome : nomesOrdenados) {
            System.out.println(nome);
        }
    }

    // Método para ordenar a lista de pessoas por idade
    public static void ordenarPorIdade() {
        List<Integer> idadesOrdenadas = new ArrayList<>(idades);
        Collections.sort(idadesOrdenadas);
        System.out.println("Pessoas ordenadas por idade:");
        for (int idade : idadesOrdenadas) {
            int index = idades.indexOf(idade);
            System.out.println("Nome: " + nomes.get(index) + ", Idade: " + idade);
        }
    }
}
