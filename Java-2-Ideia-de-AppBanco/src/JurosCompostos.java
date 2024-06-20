// Essa é a classe para cálculo de juros compostos
class JurosCompostos {
    public static double calcularJurosCompostos(double capital, double taxaJuros, double tempo) {
        return capital * Math.pow(1 + taxaJuros, tempo);
    }
}