package supermecado;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BancoDeDados {

	public static ArrayList<Cliente> 		 		clientes = new ArrayList<Cliente>();
	public static ArrayList<Funcionario> 	 		funcionarios = new ArrayList<Funcionario>();
	public static ArrayList<PessoaJuridica> 		pessoasJuridicas = new ArrayList<PessoaJuridica>();
	public static ArrayList<TipoProduto> 	 		tiposProduto = new ArrayList<TipoProduto>();
	public static ArrayList<UnidadeMedida>  		unidadesMedida = new ArrayList<UnidadeMedida>();
	public static ArrayList<Produto> 		 		produtos = new ArrayList<Produto>();
	public static ArrayList<FormaPagamento> 		formasPagamento = new ArrayList<FormaPagamento>();
	public static ArrayList<NotaFiscal> 	 		notasFiscais = new ArrayList<NotaFiscal>();
	public static ArrayList<PessoaJuridicaProduto> fornecedores = new ArrayList<PessoaJuridicaProduto>();
	public static ArrayList<Estado>  				estados = new ArrayList<Estado>();
	public static ArrayList<Cidade> 		 		cidades = new ArrayList<Cidade>();
	
	static {
		//Cadastro de Unidades de Medida
		unidadesMedida.add(new UnidadeMedida("Caixa","CX",""));
		unidadesMedida.add(new UnidadeMedida("Quilograma","KG",""));
		unidadesMedida.add(new UnidadeMedida("Pacote","PC",""));
		unidadesMedida.add(new UnidadeMedida("Unidade","UN",""));
		
		//Cadastro de Tipos de Produto
		tiposProduto.add(new TipoProduto("LIMPEZA"));
		tiposProduto.add(new TipoProduto("CARNE"));
		tiposProduto.add(new TipoProduto("PADARIA"));
		tiposProduto.add(new TipoProduto("PAPELARIA"));
		
		//Cadastro de FormaPagamento
		formasPagamento.add(new FormaPagamento("Dinheiro",(byte)1));
		formasPagamento.add(new FormaPagamento("Débito",(byte)1));
		formasPagamento.add(new FormaPagamento("Cheque",(byte)3));
		formasPagamento.add(new FormaPagamento("Cartão de Crédito",(byte)4));
		
		//Cadastro de Estado
		estados.add(new Estado("Mato Grosso","MT","Centro-Oeste"));
		estados.add(new Estado("Mato Grosso do Sul","MS","Centro-Oeste"));
		estados.add(new Estado("Distrito Federal","DF","Centro-Oeste"));
		estados.add(new Estado("São Paulo","SP","Sudeste"));
		estados.add(new Estado("Rio de Janeiro","RJ","Sudeste"));
		
		//Cadastro de Cidade
		cidades.add(new Cidade("Cuiabá","65",estados.get(0)));
		cidades.add(new Cidade("Rondonópolis","65",estados.get(0)));
		cidades.add(new Cidade("São Paulo","11",estados.get(3)));
		
		//Cadastro de Cliente
		clientes.add(new Cliente("João Paulo",new Date(),"1234","123.456.789-00",1,0));
		clientes.get(0).setEndereco(new Endereco("Rua x","y","12345-000","apto 001","12",cidades.get(0)));
		
		clientes.add(new Cliente("Maria Cristina",new Date(),"4321","789.456.123-11",2,0));
		clientes.get(1).setEndereco(new Endereco("Rua da Maria","xyz","54321-000","apto 002","123",cidades.get(1)));
		
		//Cadastro de Funcionario
		funcionarios.add(new Funcionario("Pedro Paulo",new Date(),"1234","123.456.789-00",new Date(),800));
		funcionarios.get(0).setEndereco(new Endereco("Rua x","y","12345-000","apto 001","12",cidades.get(0)));
		
		//Cadastro de Pessoa Juridica
		pessoasJuridicas.add(new PessoaJuridica("Empresa sei la do que LTDA", new Date(), "12.123.123/0000-12", "12345", "Empresa sabe nada"));
		pessoasJuridicas.get(0).setEndereco(new Endereco("Rua da Empresa sei la","abc","00000-000","","321",cidades.get(0)));
		
		pessoasJuridicas.add(new PessoaJuridica("Empresa POO LTDA", new Date(), "22.111.333/0000-21", "44", "Empresa POO com Java"));
		pessoasJuridicas.get(1).setEndereco(new Endereco("Rua da Empresa POO","paradigma","11111-222","","888",cidades.get(0)));
		
		//Cadastro de Produto
		produtos.add(new Produto("Lápis",200,1.80f,"",getUnidadeMedidaBySigla("UN"),tiposProduto.get(3)));
		produtos.add(new Produto("Borracha",200,2.95f,"",getUnidadeMedidaBySigla("CX"),tiposProduto.get(3)));
		
		//Cadastro de Fornecedor
		fornecedores.add(new PessoaJuridicaProduto(pessoasJuridicas.get(0), produtos.get(0)));
		fornecedores.add(new PessoaJuridicaProduto(pessoasJuridicas.get(0), produtos.get(1)));
		fornecedores.add(new PessoaJuridicaProduto(pessoasJuridicas.get(1), produtos.get(0)));
		fornecedores.add(new PessoaJuridicaProduto(pessoasJuridicas.get(1), produtos.get(1)));
		
		//Emissão de Nota Fiscal
		ArrayList<ItemNotaFiscal> itens = new ArrayList<ItemNotaFiscal>();
		itens.add(new ItemNotaFiscal(2, produtos.get(0).getValorUnitario(), produtos.get(0)));
		itens.add(new ItemNotaFiscal(1, produtos.get(1).getValorUnitario(), produtos.get(1)));
		ArrayList<NotaFiscalFormaPagamento> pagamento = new ArrayList<NotaFiscalFormaPagamento>();
		pagamento.add(new NotaFiscalFormaPagamento(6.55f, formasPagamento.get(0)));
		notasFiscais.add(new NotaFiscal(clientes.get(0), funcionarios.get(0), new Date(), itens, pagamento));
		
		itens = new ArrayList<ItemNotaFiscal>();
		itens.add(new ItemNotaFiscal(4, produtos.get(0).getValorUnitario(), produtos.get(0)));
		pagamento = new ArrayList<NotaFiscalFormaPagamento>();
		pagamento.add(new NotaFiscalFormaPagamento(7.2f, formasPagamento.get(1)));
		notasFiscais.add(new NotaFiscal(clientes.get(1), funcionarios.get(0), new Date(), itens, pagamento));
		
	}
	
	public static UnidadeMedida getUnidadeMedidaBySigla(String sigla) {
		for (UnidadeMedida um : unidadesMedida)
			if (um.getSigla().equalsIgnoreCase(sigla)) return um;
		return null;
	}
	
	public static Cliente getClienteByCpf(String cpf) {
		for (Cliente c : clientes)
			if (c.getCpf().equals(cpf)) return c;
		return null;
	}
	
	public static ArrayList<NotaFiscal> getNotaFiscalByCliente(Cliente c) {
		ArrayList<NotaFiscal> notas = new ArrayList<NotaFiscal>();
		for (NotaFiscal nf : notasFiscais)
			if (nf.getCliente().equals(c)) notas.add(nf);
		return notas;
	}	

	public static Funcionario getFuncionarioByCpf(String cpf) {	
		for (Funcionario f : funcionarios)
			if (f.getCpf().equals(cpf)) return f;
		return null;		
	}
	
	public static PessoaJuridica getPessoaJuridicaByCnpj(String cnpj) {	
		for (PessoaJuridica pj : pessoasJuridicas)
			if (pj.getCnpj().equals(cnpj)) return pj;
		return null;
	}
	
	public static Estado getEstadoBySigla(String sigla) {
		for (Estado e : estados)
			if (e.getSigla().equalsIgnoreCase(sigla)) return e;
		return null;
	}
	
	public static Cidade getCidadeByNome(Estado estado, String nome) {
		for (Cidade c : cidades)
			if (c.getEstado().equals(estado) && c.getNome().equalsIgnoreCase(nome)) return c;
		return null;
	}
	
	public static ArrayList<Cidade> getCidadeByEstado(Estado estado) {
		ArrayList<Cidade> lCidade = new ArrayList<Cidade>();
		for (Cidade c : cidades)
			if (c.getEstado().equals(estado)) lCidade.add(c);
		return lCidade;
	}	
		
	public static ArrayList<NotaFiscal> getNotaFiscalByFuncionario(Funcionario f) {	
		ArrayList<NotaFiscal> notas = new ArrayList<NotaFiscal>();
		for (NotaFiscal nf : notasFiscais)
			if (nf.getFuncionario().equals(f)) notas.add(nf);
		return notas;
	}
		
	public static FormaPagamento getFormaPagamentoByNome(String nome) { 
		for (FormaPagamento fp : formasPagamento)
			if (fp.getNome().equalsIgnoreCase(nome)) return fp;
		return null;
	}
	
	public static ArrayList<Produto> getProdutoByNome(String nome) { 
		ArrayList<Produto> lProduto = new ArrayList<Produto>();
		for (Produto p : produtos)
			if (p.getNome().toUpperCase().indexOf(nome.toUpperCase())>=0) lProduto.add(p);
		return lProduto;
	}
	
	public static ArrayList<Produto> getProdutoByTipo(TipoProduto tipo) { 
		ArrayList<Produto> lProduto = new ArrayList<Produto>();
		for (Produto p : produtos)
			if (p.getTipoProduto().equals(tipo)) lProduto.add(p);
		return lProduto;
	}
	
	public static ArrayList<NotaFiscal> getNotaFiscalByMonth(int month, int year) {
		ArrayList<NotaFiscal> notas = new ArrayList<NotaFiscal>();
		GregorianCalendar calendar = new GregorianCalendar();
		for (NotaFiscal nf : notasFiscais){
			calendar.setTime(nf.getData());
			if (calendar.get(Calendar.MONTH)==month && calendar.get(Calendar.YEAR)==year)
				notas.add(nf);
		}
		return notas;
	}
	
	public static void main(String[] args) {
		System.out.println(getUnidadeMedidaBySigla("KG").getNome());
		
		for (NotaFiscal nf : getNotaFiscalByFuncionario(getFuncionarioByCpf("123.456.789-00")))
			System.out.println(nf.getData()+"\n"+nf.getFuncionario().getNome());
		
		for (Cidade c : getCidadeByEstado(getEstadoBySigla("MT")))
			System.out.println(c.getNome());
		
		System.out.println(getCidadeByNome(getEstadoBySigla("MT"), "Cuiabá").getDdd());
		
		System.out.println(getFormaPagamentoByNome("Cheque").getMaximoParcelas());
		
		for (Produto p : getProdutoByNome("rra"))
			System.out.println(p.getNome());
		
	}
}












