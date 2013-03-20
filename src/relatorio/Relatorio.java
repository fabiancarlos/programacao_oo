package relatorio;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Relatorio {
	
	public static void exibirRelatorioClientesNomeTelefone() {
		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(new File("Relatorio.pdf")));
			document.open();
			// adicionando metadados ao documento
			document.addTitle("Relatório XXXXX");
			document.addSubject("Assunto XXXXX");
			document.addKeywords("A, B, C");
			document.addAuthor("JOAO");
			document.addCreator("JOAO");

			Paragraph p = new Paragraph("Relação de Clientes e Telefones!");
			document.add(p);

			// linha em branco
			p = new Paragraph(" ");
			document.add(p);

			PdfPTable table = new PdfPTable(new float[] { 0.8f, 0.2f });

			PdfPCell coluna = new PdfPCell(new Phrase("Nome"));
			coluna.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(coluna);

			coluna = new PdfPCell(new Phrase("Telefone"));
			coluna.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(coluna);

			table.addCell("Joao");
			table.addCell("1234-4567");
			table.addCell("Maria");
			table.addCell("1234-4567");
			table.addCell("Pedro");
			table.addCell("1234-4567");
			table.addCell("Ricardo");
			table.addCell("1234-4567");

			document.add(table);

			document.close();

			Desktop.getDesktop().open(new File("Relatorio.pdf"));
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	public static void main(String[] args) {
		exibirRelatorioClientesNomeTelefone();
	}

}
