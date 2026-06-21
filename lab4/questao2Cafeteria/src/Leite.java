class Leite extends CondimentoDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 1.00;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Leite";
    }
}
