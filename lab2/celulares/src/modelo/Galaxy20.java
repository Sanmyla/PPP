package modelo;
import interfaces.Celular;

public class Galaxy20 implements Celular {
    @Override
    public void fazLigacao() {
        System.out.println("Galaxy20 em Ligacao...");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Galaxy20 'Flash!!!'...");
    }
}
