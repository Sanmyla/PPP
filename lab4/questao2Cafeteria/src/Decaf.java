class Decaf implements Bebida {
    @Override
    public double calculaCusto() {
        return 4.00;
    }

    @Override
    public String getDescricao() {
        return "Café Descafeinado";
    }
}