package modelo;
import interfaces.Celular;

public class IphoneX implements Celular {
    @Override
    public void fazLigacao() {
        System.out.println("IphoneX em Ligacao...");
    }

    @Override
    public void tiraFoto() {
        System.out.println("IphoneX 'Flash!!!'...");
    }
}
