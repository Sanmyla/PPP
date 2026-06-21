public class Cinemateca {

    Pipoqueira pipo = new Pipoqueira();
    Luzes luzes = new Luzes();
    Telao telao = new Telao();
    Projetor projetor = new Projetor();
    Amplificador amp = new Amplificador();
    Player player = new Player();

    public void ritualDomingo(){

        pipo.liga();
        pipo.rebenta();
        luzes.desliga();
        telao.abaixa();
        projetor.liga();
        amp.liga();
        amp.volume(10);
        player.liga();
        player.play();

    }

    public void fimDoFilme(){

    }

}