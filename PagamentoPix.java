public class PagamentoPix implements PagamentoStrategy {

    @Override
    public double calcular(double valor) {
        return valor * 0.90;
    }
}
