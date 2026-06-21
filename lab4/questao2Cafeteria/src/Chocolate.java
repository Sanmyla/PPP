class Chocolate extends CondimentoDecorator {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.50;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Chocolate";
    }
}
