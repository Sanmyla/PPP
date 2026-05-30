package modelo;
import interfaces.Celular;

public class Galaxy8 implements Celular {
    @Override
    public void fazLigacao() {
        System.out.println("Galaxy8 em Ligacao...");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Galaxy8 'Flash!!!'...");
    }
}
