import java.util.ArrayList;
import java.util.List;

public class AcaoSujeito {
    private String codigo;
    private double preco;
    private List<InvestidorObserver> investidores = new ArrayList<>();

    public AcaoSujeito(String codigo, double precoInicial) {
        this.codigo = codigo;
        this.preco = precoInicial;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
        notificarInvestidores();
    }

    // Métodos do padrão Observer para registrar/remover observadores
    public void registrarInvestidor(InvestidorObserver investidor) {
        investidores.add(investidor);
    }

    public void removerInvestidor(InvestidorObserver investidor) {
        investidores.remove(investidor);
    }

    private void notificarInvestidores() {
        // evitar ConcurrentModificationException
        // caso um investidor decida deixar de seguir a ação imediatamente após a venda.
        List<InvestidorObserver> copiaInvestidores = new ArrayList<>(this.investidores);
        for (InvestidorObserver investidor : copiaInvestidores) {
            investidor.atualizar(this, this.preco);
        }
    }
}