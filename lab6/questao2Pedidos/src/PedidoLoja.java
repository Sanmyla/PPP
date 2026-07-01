public class PedidoLoja extends ProcessadorPedido {
    @Override
    protected void processarPagamento(double valor, String formaPagamento) {
        System.out.println("Processando pagamento no CAIXA DA LOJA via [" + formaPagamento + "] no valor de R$ " + valor);
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Entrega desnecessária: Cliente efetuará a retirada imediata do produto no balcão.");
    }
}