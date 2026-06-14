#DESCRIÇÃO DO PROBLEMA
        * Um sistema de desenho ou escrita foi projetado para manipular objetos que herdam
        * de uma interface chamada FerramentaEscrita. Esse contrato exige que o objeto saiba escrever() e apagar().
        * O sistema recebe uma classe externa chamada CanetaTermossensivel (Caneta que Apaga).
        * O problema é que ela possui métodos diferentes: em vez de apagar com uma borracha comum, ela apaga
        * através de calor (aplicarCalor()), e sua escrita é à base de tinta (escreverComTinta()).
        * Para que o sistema consiga usar essa caneta especial no lugar de um lápis sem precisar
        * mudar o código principal, é preciso criar um Adapter que faz a tradução dos métodos.
        * 
