import Interfaces.*;
import Modelos.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PavaoAzul pavaoAzul = new PavaoAzul();
        PatoDomestico patoDomestico = new PatoDomestico();

        Ave avePavao = new PavaoAdapter(pavaoAzul);
        avePavao.emitirSom();
        avePavao.voar();

        Ave avePato = new PatoAdapter(patoDomestico);
        avePato.emitirSom();
        avePato.voar();
    }

}