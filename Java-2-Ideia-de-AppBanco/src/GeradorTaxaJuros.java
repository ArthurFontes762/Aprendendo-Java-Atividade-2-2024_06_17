import java.util.Random;

// Essa é a classe para gerar uma nova taxa de juros aleatória utilizando o "import java.util.Random;"
class GeradorTaxaJuros {
    public static double gerarTaxaJurosAleatoria() {
        Random random = new Random();
        return random.nextDouble() * 0.1; // Gera uma taxa de juros entre 0% e 10%
    }
}