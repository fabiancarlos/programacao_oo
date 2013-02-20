package supermecado.relatorio;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

import supermecado.BancoDeDados;
import supermecado.Produto;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class RelatorioProdutos {

	public static void main(String args[]) {
		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(new File("RelatorioProdutos.pdf")));
			document.open();
			// adicionando metadados ao documento
			document.addTitle("Relatorio de Todos os Produtos");
			document.addSubject("Assunto XXXXX");
			document.addKeywords("A, B, C");
			document.addAuthor("Felipe");
			document.addCreator("Felipe");

			// adicionando conteœdo ao documento
			Paragraph p = new Paragraph("Relatorio de Todos os Produtos!");
			document.add(p);

			// linha em branco
			p = new Paragraph(" ");
			document.add(p);

			PdfPTable table = new PdfPTable(new float[] { 0.5f, 0.2f, 0.3f });

			PdfPCell coluna = new PdfPCell(new Phrase("Nome"));
			coluna.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(coluna);

			coluna = new PdfPCell(new Phrase("Qtde."));
			coluna.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(coluna);
			
			coluna = new PdfPCell(new Phrase("Vlr. Unit‡rio (R$)"));
			coluna.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(coluna);
			
			for (Produto pr : BancoDeDados.produtos) {
				table.addCell(pr.getNome());
				table.addCell(pr.getQtde()+"");
				table.addCell(pr.getValorUnitario()+"");
			}

			document.add(table);
			
			document.close();
			
			Desktop.getDesktop().open(new File("RelatorioProdutos.pdf"));
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}	
}



