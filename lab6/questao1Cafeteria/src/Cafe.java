public class Cafe extends Bebida {
    @Override
    protected void prepararBebida() {
        System.out.println("Passando o café pelo filtro...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando açúcar...");
    }
}