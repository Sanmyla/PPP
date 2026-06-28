import pagamento.*;
import frete.*;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens = new ArrayList<>();
    private double pesoTotal = 0.0;

    public void adicionaItem(Item item, double pesoKg) {
        itens.add(item);
        pesoTotal += pesoKg;
    }

    public void removeItem(Item item, double pesoKg) {
        if (itens.remove(item)) {
            pesoTotal -= pesoKg;
        }
    }

    public double calculaTotal() {
        return itens.stream()
                .mapToDouble(Item::getPreco)
                .sum();
    }

    public double calculaFrete(FreteStrategy estrategiaFrete) {
        return estrategiaFrete.calcular(pesoTotal);
    }

    public void realizaPagamento(PagamentoStrategy estrategiaPagamento,
                                 FreteStrategy estrategiaFrete) {
        double total = calculaTotal() + calculaFrete(estrategiaFrete);
        estrategiaPagamento.pagar(total);
    }
}
