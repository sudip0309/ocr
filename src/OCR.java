import java.io.*;
import net.sourceforge.tess4j.*;

public class OCR {
    public static void main(String[] args) {
        File imageFile = new File("web/test-image.png");
        Tesseract instance = new Tesseract();
        instance.setLanguage("eng");

        try {

            String result = instance.doOCR(imageFile);
            System.out.println(result);

        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}