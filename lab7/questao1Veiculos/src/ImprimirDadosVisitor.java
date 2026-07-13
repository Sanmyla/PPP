// Visitor responsável por imprimir os dados de cada tipo de veículo
class ImprimirDadosVisitor implements Visitor {
    @Override
    public void visit(Carro carro) {
        System.out.println("Carro -> Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo() + ", Cor: " + carro.getCor());
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Bicicleta -> Cor: " + bicicleta.getCor());
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Ônibus -> Lugares: " + onibus.getQuantidadeLugares() + ", Ano: " + onibus.getAnoFabricacao());
    }
}