
class Canela extends CondimentoDecorator {
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.50;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Canela";
    }
}
