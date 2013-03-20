






package herancatipo;

public class C implements CalculoBasico {
	
	private int[] numeros;
		
	public C(int[] numeros) {
		this.numeros = numeros;
	}
	
	public int soma() {
		int soma = 0;
		for (int n : numeros) {
			soma += n;
		}
		return soma;
	}

	public float media() {
		return soma()/numeros.length;
	}
}
