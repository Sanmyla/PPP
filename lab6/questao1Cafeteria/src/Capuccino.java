public class Capuccino extends Bebida {
    @Override
    protected void prepararBebida() {
        System.out.println("Extraindo o café expresso e vaporizando o leite...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Salpicando canela em pó...");
    }
}