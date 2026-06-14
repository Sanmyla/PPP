package Interfaces;

//o objeto base e o proxy, devem implementar essa interface
public interface ServicoDownload {
    void baixarArquivo(String nomeArquivo, String tipoUsuario);
}