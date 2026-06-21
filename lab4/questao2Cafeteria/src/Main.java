import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bebida> pedidos = new ArrayList<>();

        pedidos.add(new Espresso());

        Bebida pedido2 = new Espresso();
        pedido2 = new Leite(pedido2);
        pedido2 = new Chocolate(pedido2);
        pedidos.add(pedido2);

        Bebida pedido3 = new Decaf();
        pedido3 = new Canela(pedido3);
        pedido3 = new Leite(pedido3);
        pedido3 = new Chocolate(pedido3);
        pedidos.add(pedido3);

        Bebida pedido4 = new Canela(new Decaf());
        pedidos.add(pedido4);

        System.out.println(" ----- Pedidos da Cafeteria -----");
        for (Bebida pedido : pedidos) {
            imprimirPedido(pedido);
        }
    }

    private static void imprimirPedido(Bebida bebida) {
        System.out.printf("%-55s R$ %.2f%n", bebida.getDescricao(), bebida.calculaCusto());
    }
}