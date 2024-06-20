import java.util.Scanner;

// Classe principal de interação ao usuário
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSeja bem vindo ao aplicativo do Banco. O que gostaria de fazer?");
            System.out.println("1. Cálculo de juros simples");
            System.out.println("2. Cálculo de juros compostos");
            System.out.println("3. Calcular investimento para alcançar um valor exato");
            System.out.println("4. Gerar uma nova taxa de juros aleatória");
            System.out.println("5. Funcionalidade a minha escolha com Math.max ou Math.min");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o capital, taxa de juros (decimal) e tempo (em anos):");
                    double capital1 = scanner.nextDouble();
                    double taxaJuros1 = scanner.nextDouble();
                    double tempo1 = scanner.nextDouble();
                    double jurosSimples = JurosSimples.calcularJurosSimples(capital1, taxaJuros1, tempo1);
                    System.out.println("O juro simples calculado é: " + jurosSimples);
                    break;
                case 2:
                    System.out.println("Informe o capital, taxa de juros (decimal) e tempo (em anos):");
                    double capital2 = scanner.nextDouble();
                    double taxaJuros2 = scanner.nextDouble();
                    double tempo2 = scanner.nextDouble();
                    double montante = JurosCompostos.calcularJurosCompostos(capital2, taxaJuros2, tempo2);
                    System.out.println("O montante calculado é: " + montante);
                    break;
                case 3:
                    System.out.println("Informe o valor futuro desejado, taxa de juros (decimal) e tempo (em anos):");
                    double valorFuturo = scanner.nextDouble();
                    double taxaJuros3 = scanner.nextDouble();
                    double tempo3 = scanner.nextDouble();
                    double valorAtual = CalcularInvestimento.calcularValorAtual(valorFuturo, taxaJuros3, tempo3);
                    System.out.println("Você deve investir atualmente: " + valorAtual);
                    break;
                case 4:
                    double novaTaxaJuros = GeradorTaxaJuros.gerarTaxaJurosAleatoria();
                    System.out.println("Nova taxa de juros gerada: " + novaTaxaJuros);
                    break;
                case 5:
                    System.out.println("Informe dois números para encontrar o máximo:");
                    double num1 = scanner.nextDouble();
                    double num2 = scanner.nextDouble();
                    double maximo = OutraFuncionalidade.calcularMaximo(num1, num2);
                    System.out.println("O máximo entre os números é: " + maximo);
                    break;
                case 0:
                    System.out.println("Encerrando o programa, obrigado por usa-lo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}

/* Este é um exemplo de um aplicativo de banco, mostrando 5 funções sendo que uma das funções
era de minha escolha e eu decidi escrever isso pois estou em fase de aprendizado de Java e
gostaria de aprender mais. Eu queimei meus neurônios para esse desafio hahaha. */