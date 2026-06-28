public class InvestidorConcreto implements InvestidorObserver {
    private String nome;
    private double limiteMinimo;
    private double limiteMaximo;
    private AcaoBroker broker;

    public InvestidorConcreto(String nome, double limiteMinimo, double limiteMaximo, AcaoBroker broker) {
        this.nome = nome;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
        this.broker = broker;
    }

    @Override
    public void atualizar(AcaoSujeito acao, double novoPreco) {
        System.out.println("[Notificacao] " + nome + " recebeu atualização da " + acao.getCodigo() + ": R$ " + novoPreco);

        if (novoPreco >= limiteMaximo) {
            broker.vender(acao, this.nome);
        } else if (novoPreco <= limiteMinimo) {
            System.out.println("[Aviso] " + nome + " notou que a ação " + acao.getCodigo() + " está muito barata (Abaixo do mínimo de R$ " + limiteMinimo + ").");
        }
    }
}