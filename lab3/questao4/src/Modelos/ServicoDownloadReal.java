package Modelos;

import Interfaces.ServicoDownload;

// === OBJETO BASE ===
// conectar ao servidor
public class ServicoDownloadReal implements ServicoDownload {

    @Override
    public void baixarArquivo(String nomeArquivo, String tipoUsuario) {
        System.out.println(">> [Servidor Real] Conectando ao banco de dados...");
        System.out.println(">> [Servidor Real] Baixando o arquivo '" + nomeArquivo + "' do disco rígido principal.");
        System.out.println(">> Download concluído com sucesso!");
    }
}