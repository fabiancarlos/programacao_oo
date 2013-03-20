






package herancatipo;

public class B extends A {

	private int z;
	
	public B(int x, int y, int z) {
		super(x, y);			//Reaproveitou a interface e a implementa‹o
		this.z=z;
	}

	@Override
	public int soma() {
		return super.soma()+z; 	//Reaproveitou a interface e a implementa‹o
	}
	
	@Override
	public float media() {
		return soma()/3f;		//Reaproveitou apenas a interface
	}
}
