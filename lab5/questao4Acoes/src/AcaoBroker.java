public class AcaoBroker {
    public void comprar(AcaoSujeito acao, String nomeInvestidor) {
        System.out.println("[Broker] Comprando acoes da " + acao.getCodigo() + " para " + nomeInvestidor);
    }

    public void vender(AcaoSujeito acao, String nomeInvestidor) {
        System.out.println("[Broker] ALERTA: Limite maximo atingido! Vendendo acoes da " + acao.getCodigo() + " de " + nomeInvestidor);
    }
}