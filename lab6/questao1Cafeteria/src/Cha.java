public class Cha extends Bebida {
    @Override
    protected void prepararBebida() {
        System.out.println("Infundindo o sachê de chá...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando rodelas de limão...");
    }
}