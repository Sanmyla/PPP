public abstract class ProcessadorPedido {

    // Método Template
    public final void processarPedido(int quantidade, double valorItem, String formaPagamento) {
        double valorTotal = quantidade * valorItem;
        System.out.println("Iniciando processamento do pedido. Valor Total: R$ " + valorTotal);

        processarPagamento(valorTotal, formaPagamento);
        decidirEntrega();

        System.out.println("Pedido finalizado com sucesso!\n");
    }

    // Passos abstratos a serem definidos pelas regras de cada tipo de pedido
    protected abstract void processarPagamento(double valor, String formaPagamento);
    protected abstract void decidirEntrega();
}