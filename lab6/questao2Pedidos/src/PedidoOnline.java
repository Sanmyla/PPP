public class PedidoOnline extends ProcessadorPedido {
    @Override
    protected void processarPagamento(double valor, String formaPagamento) {
        System.out.println("Processando pagamento ONLINE via [" + formaPagamento + "] no valor de R$ " + valor);
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Entrega necessária: Gerando código de rastreamento e enviando para a transportadora.");
    }
}