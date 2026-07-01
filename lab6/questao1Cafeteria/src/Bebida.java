public abstract class Bebida {

    // O Método Template - define a estrutura do algoritmo
    public final void prepararReceita() {
        aquecerAgua();
        prepararBebida();
        colocarNaXicara();
        adicionarCondimentos();
        System.out.println("--- Bebida pronta! ---\n");
    }

    // Passos comuns
    private void aquecerAgua() {
        System.out.println("Aquecendo a água...");
    }

    private void colocarNaXicara() {
        System.out.println("Colocando a bebida na xícara...");
    }

    // Passos específicos que as subclasses devem implementar
    protected abstract void prepararBebida();
    protected abstract void adicionarCondimentos();
}