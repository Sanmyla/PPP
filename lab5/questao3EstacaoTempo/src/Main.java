public class Main {

    public static void main(String ... args){
        EstacaoTempo estacao = new EstacaoTempo();

        AeroportoObserver aeroporto = new AeroportoObserver();
        estacao.addObserver(aeroporto);

        PrefeituraObserver prefeitura = new PrefeituraObserver();
        estacao.addObserver(prefeitura);

        estacao.setVelocidadeVento(130.0);
        estacao.setTemperatura(25.0);
        estacao.setUmidade(50.0);

        estacao.setUmidade(10.0);
    }

}