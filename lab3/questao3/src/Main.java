
import Interfaces.FerramentaEscrita;
import Modelos.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /* #DESCRIÇÃO DO PROBLEMA
        * Um sistema de desenho ou escrita foi projetado para manipular objetos que herdam
        * de uma interface chamada FerramentaEscrita. Esse contrato exige que o objeto saiba escrever() e apagar().
        * O sistema recebe uma classe externa chamada CanetaTermossensivel (Caneta que Apaga).
        * O problema é que ela possui métodos diferentes: em vez de apagar com uma borracha comum, ela apaga
        * através de calor (aplicarCalor()), e sua escrita é à base de tinta (escreverComTinta()).
        * Para que o sistema consiga usar essa caneta especial no lugar de um lápis sem precisar
        * mudar o código principal, é preciso criar um Adapter que faz a tradução dos métodos.
        * */


        FerramentaEscrita lapis = new Lapis();
        lapis.escrever();
        lapis.apagar();

        CanetaTermossensivel canetaEspecial = new CanetaTermossensivel();
        FerramentaEscrita caneta = new CanetaAdapter(canetaEspecial);
        System.out.println("=== CANETA QUE APAGA ===");
        caneta.escrever();
        System.out.println("\nIh, errei! Chamando o método apagar():");
        caneta.apagar();
    }
}