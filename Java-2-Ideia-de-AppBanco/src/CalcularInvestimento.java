// Essa é a classe para calcular o quanto investir para chegar a um valor exato
class CalcularInvestimento {
    public static double calcularValorAtual(double valorFuturo, double taxaJuros, double tempo) {
        return valorFuturo / Math.pow(1 + taxaJuros, tempo);
    }
}