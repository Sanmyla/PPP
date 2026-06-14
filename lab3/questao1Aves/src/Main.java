import Interfaces.Ave;
import Modelos.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ave> aves = new ArrayList<>();
        Ave patoDomestico = new Pato();
        PavaoAzul pavaoAzul = new PavaoAzul();
        PavaoAdapter pavaoAdapter = new PavaoAdapter(pavaoAzul);
        aves.add(patoDomestico);
        aves.add(pavaoAdapter);


        for(Ave ave: aves){
            System.out.println(ave.getClass().getSimpleName() + " : ");
            ave.emitirSom();
            ave.voar();
        }
    }

}