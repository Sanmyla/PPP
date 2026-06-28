package frete;


public class FreteSedex implements FreteStrategy {
    private static final double taxaKG = 8.50;

    @Override
    public double calcular(double pesoTotal) {
        return pesoTotal * taxaKG;
    }
}
