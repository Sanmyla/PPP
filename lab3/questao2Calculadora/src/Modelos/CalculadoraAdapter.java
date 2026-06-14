package Modelos;

import Interfaces.CalculadoraDecimal;

public class CalculadoraAdapter implements CalculadoraDecimal {
    private CalculadoraBinaria calcBin;
    public CalculadoraAdapter(CalculadoraBinaria calcBin) {
        this.calcBin = calcBin;
    }
    public CalculadoraBinaria getCalcBin() {
        return calcBin;
    }
    public void setCalcBin(CalculadoraBinaria calcBin) {
        this.calcBin = calcBin;
    }
    @Override
    public int somar(int a, int b){
        String aBin = Integer.toBinaryString(a);
        String bBin = Integer.toBinaryString(b);

        String resultBin = calcBin.somar(aBin, bBin);

        return Integer.parseInt(resultBin, 2);
    }

    @Override
    public int subtrair(int a, int b){
        String aBin = Integer.toBinaryString(a);
        String bBin = Integer.toBinaryString(b);

        String resultBin = calcBin.subtrair(aBin, bBin);
        return Integer.parseInt(resultBin, 2);
    }
    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }
}
