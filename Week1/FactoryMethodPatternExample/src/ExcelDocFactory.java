public class ExcelDocFactory extends DocFactory{
    public Doc createDocument() {
        return new ExcelDoc();
    }
}
