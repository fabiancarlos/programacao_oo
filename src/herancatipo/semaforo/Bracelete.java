






package herancatipo.semaforo;

public class Bracelete implements ISemaforo {

	@Override
	public void verde() {
		System.out.println("Vibra!");
	}

	@Override
	public void amarelo() {
		System.out.println("Vibra!");		
	}

	@Override
	public void vermelho() {
		System.out.println("N‹o Vibra!");				
	}

	@Override
	public void intermitente() {
		System.out.println("Vibra!");				
	}

}
