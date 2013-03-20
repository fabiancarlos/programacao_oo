








package herancatipo;

public class A implements CalculoBasico {
	
	private int x, y;
	
	public A (int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public int soma() {
		return x+y;
	}
	@Override
	public float media() {
		return soma()/2f;
	}

}
