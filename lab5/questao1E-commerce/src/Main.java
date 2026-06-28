public class Main {

    public static void main(String ... args){

        PagamentoStrategy strategy = new PixPagamento();
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(strategy);

        // adicionou itens
        Item arroz = new Item();
        arroz.setPreco(23.99);

        carrinho.adicionaItem(arroz);
        carrinho.realizaPagamento();


    }
}