
import Interfaces.CalculadoraDecimal;
import Modelos.CalculadoraBinaria;
import Modelos.CalculadoraAdapter;

public class Main {
    public static void main(String[] args) {
        CalculadoraBinaria calcBinaria = new CalculadoraBinaria();

        CalculadoraDecimal calcAdaptada = new CalculadoraAdapter(calcBinaria);


        int a = 10;
        int b = 5;

        System.out.println("Operação Desejada (Decimal): " + a + " + " + b);

        System.out.println("\n[Bastidores do Adaptador]:");
        System.out.println("-> Convertendo " + a + " para Binário: " + Integer.toBinaryString(a));
        System.out.println("-> Convertendo " + b + " para Binário: " + Integer.toBinaryString(b));
        int resultadoFinal = calcAdaptada.somar(a, b);

        System.out.println("\n[Resultado Final]:");
        System.out.println("Resultado em Decimal: " + resultadoFinal);
        System.out.println("Resultado correspondente em Binário: " + Integer.toBinaryString(resultadoFinal));

        System.out.println("=========================================");

        System.out.println("Operação Desejada (Decimal): " + a + " - " + b);
        System.out.println("\n[Bastidores do Adaptador]:");
        resultadoFinal = calcAdaptada.subtrair(a, b);

        System.out.println("\n[Resultado Final]:");
        System.out.println("Resultado em Decimal: " + resultadoFinal);
        System.out.println("Resultado correspondente em Binário: " + Integer.toBinaryString(resultadoFinal));

        System.out.println("=========================================");

        System.out.println("Operação Desejada (Decimal): " + a + " x " + b);
        System.out.println("\n[Bastidores do Adaptador]:");
        resultadoFinal = calcAdaptada.multiplicar(a, b);

        System.out.println("\n[Resultado Final]:");
        System.out.println("Resultado em Decimal: " + resultadoFinal);
        System.out.println("Resultado correspondente em Binário: " + Integer.toBinaryString(resultadoFinal));

        System.out.println("=========================================");
    }
}