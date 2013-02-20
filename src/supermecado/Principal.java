package supermecado;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		// Criando Objeto usando construtor default
//		Pessoa p = new Pessoa();
//		p.setNome("Maria Cristina");
//		p.setDataNascimento(new Date());
//		System.out.println(p);
//	
//
//		// Criando objeto usando construtor com todos os atributos
//		PessoaFisica pf = new PessoaFisica("Maria Cristina", new Date(),"123456", "654321");
//		System.out.println(pf);

		//Criando objeto usando construtor com todos os atributos
//		PessoaJuridica pj1 = new PessoaJuridica("Maria Cristina LTDA.", new Date(), "123456", "654321", "Total Consultoria");
//		PessoaJuridica pj2 = new PessoaJuridica("Maria Cristina LTDA.", new Date(), "123456", "654321", "Total Consultoria");
//		System.out.println(pj1);
//		System.out.println();
//		System.out.println(pj2);
//		System.out.println();
//		System.out.println(pj1 == pj2);
//		System.out.println(pj1.equals(pj2));
//		
//		pj1 = null;
//		System.gc();
		
		Cliente c = new Cliente("Jo‹o Paulo", new Date(), "123 SSP/MT", "000.000.000-00", 1, 1000);
		System.out.println(c);
	}

}
