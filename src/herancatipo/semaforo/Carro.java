






package herancatipo.semaforo;

public class Carro implements ISemaforo {

	@Override
	public void verde() {
		System.out.println("Carro não faz nada!");
	}

	@Override
	public void amarelo() {
		System.out.println("Carro indica no painel ATENCAO!");
	}

	@Override
	public void vermelho() {
		System.out.println("Carro impede aceleração!");
	}

	@Override
	public void intermitente() {
		System.out.println("Carro indica no painel ATENCAO!");
	}

}
