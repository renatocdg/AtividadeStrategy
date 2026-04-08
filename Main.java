public class Main {
    public static void main(String[] args) {

        // Cenário 1 - Cartão
        Pedido pedidoCartao = new Pedido(200, new PagamentoCartao());
        System.out.println("Pagamento com Cartão: R$ " + pedidoCartao.calcularTotal());

        // Cenário 2 - Pix
        Pedido pedidoPix = new Pedido(200, new PagamentoPix());
        System.out.println("Pagamento com Pix: R$ " + pedidoPix.calcularTotal());

        // Cenário 3 - Boleto
        Pedido pedidoBoleto = new Pedido(200, new PagamentoBoleto());
        System.out.println("Pagamento com Boleto: R$ " + pedidoBoleto.calcularTotal());

        // Cenário 4 - Troca de estratégia
        Pedido pedidoTroca = new Pedido(200, new PagamentoCartao());

        System.out.println("\nAlterando forma de pagamento...");

        pedidoTroca.alterarEstrategia(new PagamentoPix());
        System.out.println("Novo total com Pix: R$ " + pedidoTroca.calcularTotal());
    }
}
