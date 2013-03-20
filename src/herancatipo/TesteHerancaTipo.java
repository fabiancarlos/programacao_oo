package herancatipo;






public class TesteHerancaTipo {
	
	public static void main(String[] args) {
		A a = new A(2,3);				
		B b = new B(2,3,5);
		C c = new C(new int[]{1,2,3,4,5,6});
		
		CalculoBasico[] vetor = new CalculoBasico[3];
		vetor[0] = a;
		vetor[1] = b;
		vetor[2] = c;
		
		for (CalculoBasico i : vetor) {
			System.out.println(i.soma());
			System.out.println(i.media());
			System.out.println();
		}
	}

}
