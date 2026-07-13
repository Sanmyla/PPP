// Operação 3: Contador de palavras dentro do documento
class WordCountVisitor implements DocumentVisitor {
    private int totalWords = 0;

    public int getTotalWords() {
        return totalWords;
    }

    @Override
    public void visit(Paragraph paragraph) {
        // Divide o texto por espaços em branco para estimar o número de palavras
        if (paragraph.getText() != null && !paragraph.getText().trim().isEmpty()) {
            totalWords += paragraph.getText().trim().split("\\s+").length;
        }
    }

    @Override
    public void visit(Image image) {
        // Imagens não possuem palavras de corpo de texto, mas podemos optar por contar o texto alternativo
        if (image.getAltText() != null && !image.getAltText().trim().isEmpty()) {
            totalWords += image.getAltText().trim().split("\\s+").length;
        }
    }

    @Override
    public void visit(Table table) {
        // Varre todas as células da tabela contando as palavras contidas nelas
        for (String[] row : table.getContent()) {
            for (String cell : row) {
                if (cell != null && !cell.trim().isEmpty()) {
                    totalWords += cell.trim().split("\\s+").length;
                }
            }
        }
    }
}