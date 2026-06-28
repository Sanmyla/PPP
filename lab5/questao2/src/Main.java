import frete.*;
import pagamento.*;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Item notebook = new Item("Notebook", 3500.00);
        Item mouse    = new Item("Mouse", 150.00);

        carrinho.adicionaItem(notebook,2.5);
        carrinho.adicionaItem(mouse,0.1);

        System.out.println("=== Pagamento com Pix + Frete Sedex ===");
        carrinho.realizaPagamento(new PixPagamento(), new FreteSedex());

        System.out.println("\n=== Pagamento com Boleto + Frete Normal ===");
        carrinho.realizaPagamento(new BoletoPagamento(), new FreteNormal());
    }
}
