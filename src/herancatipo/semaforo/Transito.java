




package herancatipo.semaforo;

public class Transito {
	
	public static void main(String[] args) {
		Semaforo semaforo = new Semaforo();
		
		semaforo.mudaSinal();
		
		Carro carro = new Carro();
		semaforo.addDispositivo(carro);
		
		semaforo.mudaSinal();
		
		Bracelete bracelete = new Bracelete();
		semaforo.addDispositivo(bracelete);
		
		semaforo.mudaSinal();
		
		semaforo.removeDispositivo(bracelete);
		
		semaforo.mudaSinal();
		
		semaforo.removeDispositivo(carro);
		
		semaforo.mudaSinal();
		
	}

}
