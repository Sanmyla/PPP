package Modelos;
import Interfaces.Ave;

public class PavaoAdapter implements Ave {
    private PavaoAzul pavaoAzul;
    public PavaoAdapter(PavaoAzul pavaoAzul){
        this.pavaoAzul = pavaoAzul;
    }

    @Override
    public void emitirSom(){
        pavaoAzul.cantar();
    }

    /*
    * O adapter está servindo para conseguirmos adaptar o metodo voar de Ave.
    * Assim conseguimos usar a classe PavaoAzul sem grandes modificações,
    * o que garante mais integridade para o projeto e evita alterar uma
    * classe já existente
    * */
    @Override
    public void voar(){
        //Adapter
        System.out.println("Pavao nao voa :(");
    }
}
