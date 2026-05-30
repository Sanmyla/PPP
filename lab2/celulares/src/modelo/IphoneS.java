package modelo;
import interfaces.Celular;

public class IphoneS implements Celular {
    @Override
    public void fazLigacao() {
        System.out.println("IphoneS em Ligacao...");
    }

    @Override
    public void tiraFoto() {
        System.out.println("IphoneS 'Flash!!!'...");
    }
}
