import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DocumentElement> document = new ArrayList<>();

        document.add(new Paragraph("Bem-vindo ao editor de texto"));
        document.add(new Image("imagens/diagrama.png", "Diagrama de arquitetura do padrão Visitor"));

        String[][] dadosTabela = {
                {"Nome", "Função"},
                {"Sanmyla", "Desenvolvedora"},
                {"Cadu", "Parceiro de Projeto"}
        };
        document.add(new Table(dadosTabela));
        document.add(new Paragraph("Fim do documento experimental de testes."));

        // exportação para HTML
        System.out.println("======= EXPORTAÇÃO HTML =======");
        DocumentVisitor htmlExporter = new ExportToHTMLVisitor();
        for (DocumentElement element : document) {
            element.accept(htmlExporter);
        }

        // exportação para PDF
        System.out.println("\n======= EXPORTAÇÃO PDF =======");
        DocumentVisitor pdfExporter = new ExportToPDFVisitor();
        for (DocumentElement element : document) {
            element.accept(pdfExporter);
        }

        // contagem de palavras do documento inteiro
        System.out.println("\n======= CONTAGEM DE PALAVRAS =======");
        WordCountVisitor wordCounter = new WordCountVisitor();
        for (DocumentElement element : document) {
            element.accept(wordCounter);
        }
        System.out.println("Total de palavras contabilizadas no documento: " + wordCounter.getTotalWords());
    }
}