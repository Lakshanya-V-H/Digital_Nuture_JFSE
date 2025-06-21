public class App {
    public static void main(String[] args) throws Exception {
        DocFactory wordFactory = new WordDocFactory();
        Doc word = wordFactory.createDocument();
        word.open();

        DocFactory pdfFactory = new PdfDocFactory();
        Doc pdf = pdfFactory.createDocument();
        pdf.open();

        DocFactory excelFactory = new ExcelDocFactory();
        Doc excel = excelFactory.createDocument();
        excel.open();
    }
}
