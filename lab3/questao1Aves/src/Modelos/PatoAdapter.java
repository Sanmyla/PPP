package Modelos;
import Interfaces.*;

public class PatoAdapter implements Ave {

    private Pato pato;

    public PatoAdapter(Pato p) {
        this.pato = p;
    }

    public void voar() {
        pato.voar();
    }

    public void emitirSom() {
        pato.grasnar();
    }
}
