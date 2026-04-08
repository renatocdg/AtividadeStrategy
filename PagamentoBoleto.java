public class PagamentoBoleto implements PagamentoStrategy {

    @Override
    public double calcular(double valor) {
        double comDesconto = valor * 0.95;
        return comDesconto + 2;
    }
}
