class Image implements DocumentElement {
    private String sourcePath;
    private String altText;

    public Image(String sourcePath, String altText) {
        this.sourcePath = sourcePath;
        this.altText = altText;
    }

    public String getSourcePath() { return sourcePath; }
    public String getAltText() { return altText; }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}