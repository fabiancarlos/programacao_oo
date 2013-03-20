public class TesteDivisaoPorZero {
	
	public float dividir(float x, float y) throws Exception {
		if (y==0) throw new Exception("Erro de divis‹o por ZERO!");
		return x/y;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(new TesteDivisaoPorZero().dividir(2, 0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
