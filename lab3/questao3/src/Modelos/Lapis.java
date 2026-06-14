package Modelos;
import Interfaces.FerramentaEscrita;

public class Lapis implements FerramentaEscrita {
    @Override
    public void escrever() {
        System.out.println("[LAPIS] -> Grafite sendo usado");
    }
    @Override
    public void apagar() {
        System.out.println("[BORRACHA CONVENCIONAL] -> apagando");
    }
}
