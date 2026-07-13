// Visitor responsável por disparar mensagens customizadas para os donos
class EnviarMensagemVisitor implements Visitor {
    @Override
    public void visit(Carro carro) {
        System.out.println("Mensagem para dono do Carro: favor atualizar dados do IPVA");
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Mensagem para dono da Bicicleta: comemore no parque o dia do ciclismo");
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Mensagem para dono do Onibus: atencao para atualizacao das licencas\"");
    }
}