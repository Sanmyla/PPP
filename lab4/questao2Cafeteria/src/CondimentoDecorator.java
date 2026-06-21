// Classe abstrata que implementa Bebida e mantém uma referência ao objeto
// decorado (composição), permitindo envolver qualquer Bebida com novas
// responsabilidades sem alterar suas classes originais
abstract class CondimentoDecorator implements Bebida {
    protected Bebida bebida;

    public CondimentoDecorator(Bebida bebida) {
        this.bebida = bebida;
    }
}