// Interface que define as operações que podem ser realizadas sobre os elementos
interface Visitor {
    void visit(Carro carro);
    void visit(Bicicleta bicicleta);
    void visit(Onibus onibus);
}