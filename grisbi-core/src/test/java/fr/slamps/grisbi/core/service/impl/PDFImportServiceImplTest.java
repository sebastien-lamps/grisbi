package fr.slamps.grisbi.core.service.impl;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by slamps on 31/05/16.
 */
public class PDFImportServiceImplTest {

	@Test
	public void testImport() {
		try {
			String pdf = "/home/slamps/personnel/cloud/drive/Document/Banque/CM/Extraits de comptes/Extrait de comptes 10278 06012 000205604.. au 2016-05-02.pdf";
			PdfReader reader = new PdfReader(pdf);
			System.out.println("This PDF has " + reader.getNumberOfPages() + " pages.");
			String page = PdfTextExtractor.getTextFromPage(reader, 2);
			System.out.println("Page Content:\n\n" + page + "\n\n");
			System.out.println("Is this document tampered: " + reader.isTampered());
			System.out.println("Is this document encrypted: " + reader.isEncrypted());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
