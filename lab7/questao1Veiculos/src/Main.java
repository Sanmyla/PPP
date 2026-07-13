import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Preto", "Honda", "Civic"));
        veiculos.add(new Bicicleta("Azul"));
        veiculos.add(new Onibus(45, 2018));

        // Instanciando as operações (Visitors)
        Visitor impressora = new ImprimirDadosVisitor();
        Visitor mensageiro = new EnviarMensagemVisitor();

        System.out.println("--- Executando Impressao de Dados ---");
        for (Veiculo v : veiculos) {
            v.accept(impressora);
        }

        System.out.println("\n--- Executando Envio de Mensagens ---");
        for (Veiculo v : veiculos) {
            v.accept(mensageiro);
        }
    }
}