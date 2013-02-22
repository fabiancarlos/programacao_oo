package supermercado.test;

import static org.junit.Assert.*;

import org.junit.Test;

import supermecado.Produto;
import supermecado.Util;
import supermercado.exception.ValidaException;

public class TesteValidacao {

	@Test(expected=ValidaException.class)
	public void testCampoObrigatorio() throws ValidaException {
		Produto p = new Produto();
		Util.valida(p);
	}

}
