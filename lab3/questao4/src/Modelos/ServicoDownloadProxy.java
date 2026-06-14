package Modelos;

import Interfaces.ServicoDownload;
import java.util.HashSet;

/* === PROXY ===  */
// Controla o acesso ao objeto base e gerencia um cache local de arquivos já baixados
public class ServicoDownloadProxy implements ServicoDownload {
    // Referência para o objeto base real
    private ServicoDownloadReal servicoReal;
    // Simulação de um cache de arquivos salvos na memória do proxy
    private HashSet<String> cacheArquivos;

    public ServicoDownloadProxy() {
        this.servicoReal = new ServicoDownloadReal(); // O objeto real só é acessado por aqui
        this.cacheArquivos = new HashSet<>();
    }

    @Override
    public void baixarArquivo(String nomeArquivo, String tipoUsuario) {
        System.out.println("[Proxy] Interceptando requisição para o arquivo: " + nomeArquivo);

        //BARREIRA DE SEGURANÇA (Controle de Acesso)
        if (!tipoUsuario.equalsIgnoreCase("PROFESSOR") && !tipoUsuario.equalsIgnoreCase("ALUNO")) {
            System.out.println("[Proxy - ERRO] Acesso negado! Usuários do tipo '" + tipoUsuario + "' não têm permissão.");
            return;
        }

        //MECANISMO DE CACHE
        if (cacheArquivos.contains(nomeArquivo)) {
            System.out.println("[Proxy - CACHE] O arquivo '" + nomeArquivo + "' já está no cache local!");
            System.out.println("[Proxy - CACHE] Entregando arquivo instantaneamente. Servidor Real poupado.");
            return;
        }

        //SE PASSOU NAS REGRAS, ENVIA PARA O OBJETO BASE
        System.out.println("[Proxy] Arquivo não está no cache. Encaminhando pedido ao Servidor Real...");
        servicoReal.baixarArquivo(nomeArquivo, tipoUsuario);

        // Salva no cache para a próxima vez
        cacheArquivos.add(nomeArquivo);
    }
}