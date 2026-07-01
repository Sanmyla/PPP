public class PedidoCripto extends ProcessadorPedido {
    @Override
    protected void processarPagamento(double valor, String formaPagamento) {
        System.out.println("Processando pagamento via CRIPTOMOEDA (" + formaPagamento + "). Aguardando confirmações na blockchain para o valor de R$ " + valor);
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Verificando preferência: O cliente escolheu receber a chave digital de liberação por e-mail.");
    }
}