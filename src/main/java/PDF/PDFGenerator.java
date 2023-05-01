package PDF;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfReader;

import java.io.FileOutputStream;

public class PDFGenerator {

    public static void main(String[] args) {
        String sourceFile = "input.pdf";
        String destinationFile = "output.pdf";

        try {
            Document document = new Document();
            PdfCopy copy = new PdfCopy(document, new FileOutputStream(destinationFile));
            document.open();

            PdfReader reader = new PdfReader(sourceFile);

            int pageCount = reader.getNumberOfPages();
            for (int i = 0; i < pageCount; i++) {
                document.newPage();
                copy.addPage(copy.getImportedPage(reader, i + 1));
            }

            document.close();
            copy.close();
            reader.close();

            System.out.println("PDF документ успешно создан: " + destinationFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
