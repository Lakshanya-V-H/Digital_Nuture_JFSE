public class PdfDocFactory extends DocFactory{
    public Doc createDocument() {
        return new PdfDoc();
    }
}
