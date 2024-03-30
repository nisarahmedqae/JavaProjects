package JavaMiscellaneous;

import java.io.File;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ImageToText {

	// tessdata link:
	// https://github.com/tesseract-ocr/tessdata/blob/main/eng.traineddata

	public static String crakImage(String filePath) throws TesseractException {
		File imgFile = new File(filePath);
		ITesseract instance = new Tesseract();
		instance.setDatapath("D:\\Nisar Ahmed\\QA Testing\\tessdata");

		String result = instance.doOCR(imgFile);
		return result;
	}

	public static void main(String[] args) throws TesseractException {
		String textData = ImageToText.crakImage("D:\\Nisar Ahmed\\QA Testing\\tessdata\\amazonImage.jpg");
		System.out.println(textData);

	}

}
