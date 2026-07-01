/**
 * DIFERENÇA ENTRE TEMPLATE METHOD E DECORATOR:
 * * O Template Method é um padrão comportamental baseado em herança. Ele define a
 * estrutura fixa de um algoritmo em uma superclasse, permitindo que as subclasses
 * redefinam ou alterem etapas específicas desse algoritmo sem mudar a sua estrutura global.
 * * O Decorator é um padrão estrutural baseado em composição e delegação. Ele permite
 * adicionar novas responsabilidades e comportamentos a um objeto dinamicamente em
 * tempo de execução, sem a necessidade de herança ou
 * de alterar o esqueleto de um algoritmo fixo.
 */
public class Main {
    public static void main(String[] args) {

        ProcessadorPedido pedido1 = new PedidoOnline();
        pedido1.processarPedido(2, 150.00, "Cartão de Crédito");

        ProcessadorPedido pedido2 = new PedidoLoja();
        pedido2.processarPedido(1, 45.50, "Dinheiro");

        ProcessadorPedido pedido3 = new PedidoCripto();
        pedido3.processarPedido(5, 1200.00, "Bitcoin");
    }
}