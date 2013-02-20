package supermecado.relatorio;

import com.itextpdf.text.Document;

public class RelatorioCliente {

    public static void main(String args[]) {
            try {
                    Document documento = new Document();
                    PdfWriter.getInstance(documento, new FileOutputStream(new File("RelatorioCliente.pdf")));
                    documento.open();

                    String cpf = Util.getInput("Digite o CPF do Cliente");
                    
                    Cliente c = BancoDeDados.getClienteByCpf(cpf);
                    
                    Paragraph p = new Paragraph(c.toString());
                    
                    documento.add(p);
                    
                    
                    documento.close();        
                    
                    Desktop.getDesktop().open(new File("RelatorioCliente.pdf"));
            } catch (Exception e) {
                    e.printStackTrace();
            }                
    }        
}