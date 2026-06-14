package Modelos;

import Interfaces.FerramentaEscrita;

public class CanetaAdapter implements FerramentaEscrita {
    private CanetaTermossensivel caneta;

    public CanetaAdapter(CanetaTermossensivel caneta){
        this.caneta = caneta;
    }
    @Override
    public void escrever() {
        caneta.escreverTintaTermica();
    }

    @Override
    public void apagar() {
        caneta.aplicarCalor();
    }
}
