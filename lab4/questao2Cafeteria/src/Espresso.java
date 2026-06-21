class Espresso implements Bebida {
    @Override
    public double calculaCusto() {
        return 4.50;
    }

    @Override
    public String getDescricao() {
        return "Espresso";
    }
}
