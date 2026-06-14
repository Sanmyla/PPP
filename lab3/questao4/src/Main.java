import Interfaces.ServicoDownload;
import Modelos.ServicoDownloadProxy;

// === CLIENTE ===
// O cliente nunca conversa diretamente com o ServicoDownloadReal
public class Main {
    public static void main(String[] args) {

        /*DESCRICAO DO PROBLEMA
        * Em um portal universitário, existe um serviço que faz o download de gabaritos de provas armazenados
        *  em um servidor pesado (Objeto Base). Para proteger o servidor e economizar banda, implementamos um
        *  Proxy. Esse intermediário faz duas coisas:
        *      Controle de Acesso: Verifica se o usuário tentando baixar o arquivo é um aluno matriculado ou
        *       se tem a permissão correta.
        *      Cache: Se o arquivo já foi baixado uma vez, o proxy entrega a cópia local imediatamente, sem
        *      sobrecarregar o servidor real.
        * */


        // Criacao do Proxy
        ServicoDownload portalUniversitario = new ServicoDownloadProxy();

        System.out.println("=== 1º TESTE: Tentativa de acesso sem login válido ===");
        portalUniversitario.baixarArquivo("Gabarito_Calculo3.pdf", "VISITANTE");

        System.out.println("\n=== 2º TESTE: Aluno baixando o arquivo pela primeira vez (Aciona o Servidor Real) ===");
        portalUniversitario.baixarArquivo("Gabarito_Calculo3.pdf", "ALUNO");

        System.out.println("\n=== 3º TESTE: Outro aluno pede o mesmo arquivo (Aciona o Cache do Proxy) ===");
        portalUniversitario.baixarArquivo("Gabarito_Calculo3.pdf", "ALUNO");
    }
}