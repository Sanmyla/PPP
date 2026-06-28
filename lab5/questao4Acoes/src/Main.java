public class Main {
    public static void main(String[] args) {
        // 1. Criando o Broker
        AcaoBroker broker = new AcaoBroker();

        AcaoSujeito acaoUFU = new AcaoSujeito("FACOM4", 50.0);

        InvestidorObserver inv1 = new InvestidorConcreto("Maria", 40.0, 60.0, broker);
        InvestidorObserver inv2 = new InvestidorConcreto("Joao", 45.0, 55.0, broker);
        acaoUFU.registrarInvestidor(inv1);
        acaoUFU.registrarInvestidor(inv2);

        System.out.println("--- Variação de Mercado 1 ---");
        acaoUFU.setPreco(53.0); // Ambos recebem, ninguém vende ainda

        System.out.println("\n--- Variação de Mercado 2 ---");
        acaoUFU.setPreco(56.0); // Bate o limite máximo de Igor. O broker vende as dele.

        System.out.println("\n--- Variação de Mercado 3 ---");
        acaoUFU.setPreco(62.0); // Bate o limite máximo de Sanmyla. O broker vende as dela.
    }
}