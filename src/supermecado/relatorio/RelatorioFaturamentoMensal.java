package supermecado.relatorio;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;

import supermecado.BancoDeDados;
import supermecado.NotaFiscal;
import supermecado.Util;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class RelatorioFaturamentoMensal {

	public static void main (String args[]){
		try{
		Document documento = new Document ();
		File arquivo =  new File ("RelatorioFaturamentoMensal.pdf");
		PdfWriter.getInstance(documento, new FileOutputStream(arquivo));
		documento.open();
		
		int ano = Integer.parseInt(Util.getInput("Informe o ano a ser faturado"));
		
		Paragraph p = new Paragraph ("Relatorio de " + ano);
		p.setFont(new Font (FontFamily.TIMES_ROMAN,12f, Font.BOLDITALIC));
		p.setAlignment(Element.ALIGN_CENTER);
		documento.add(p);
		PdfPTable  tabela = new PdfPTable(new float []{0.5f, 0.5f});
		tabela.addCell("Mes");
		tabela.addCell("Valor Total (R$)");
		
		 float totalAno = 0;
         for (int mes = Calendar.JANUARY; mes <= Calendar.DECEMBER; mes++) {
                 tabela.addCell((mes+1)+" ");
                 float totalMes = 0;
                 ArrayList<NotaFiscal> nfs = BancoDeDados.getNotaFiscalByMonth(mes, ano);
                 for (NotaFiscal nf: nfs) {
                         totalMes += nf.getValorTotal();
                         
                 }
                 
                 tabela.addCell(totalMes+" ");
                 totalAno+=totalMes;
           
         }
         
         documento.add(tabela);
         p = new Paragraph("Total de " + ano + ": " + totalAno);
         documento.add(p);
         
         documento.close();        
         
         Desktop.getDesktop().open(new File("RelatorioFaturamentoMensal.pdf"));
 } catch (Exception e) {
         e.printStackTrace();
 }
		
	}
}
