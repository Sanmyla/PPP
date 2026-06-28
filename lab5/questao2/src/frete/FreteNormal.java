package frete;
public class FreteNormal implements FreteStrategy {
    private static final double taxaKG = 4.00;

    @Override
    public double calcular(double pesoTotal) {
        return pesoTotal * taxaKG;
    }
}
