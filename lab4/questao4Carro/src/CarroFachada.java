class CarroFachada {
    private final Motor motor;
    private final Porta porta;
    private final CintoSeguranca cinto;
    private final Farol farol;
    private final Radio radio;
    private final String estacaoPreferida;

    public CarroFachada(String estacaoPreferida) {
        this.motor = new Motor();
        this.porta = new Porta();
        this.cinto = new CintoSeguranca();
        this.farol = new Farol();
        this.radio = new Radio();
        this.estacaoPreferida = estacaoPreferida;
    }

    public void dirigir() {
        System.out.println("--- Preparando o carro para dirigir ---");
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar(estacaoPreferida);
        System.out.println("Carro pronto para seguir viagem!\n");
    }

    public void finalizarCorrida() {
        System.out.println("--- Finalizando a corrida ---");
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
        System.out.println("Carro desligado.\n");
    }
}
