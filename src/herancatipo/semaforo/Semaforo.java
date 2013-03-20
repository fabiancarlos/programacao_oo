






package herancatipo.semaforo;

import java.util.ArrayList;

public class Semaforo {
	
	private ArrayList<ISemaforo> dispositivos = new ArrayList<ISemaforo>();
	private SemaforoEnum status = SemaforoEnum.VERMELHO; 
	
	public Semaforo() {
	}
	
	public void addDispositivo(ISemaforo dispositivo) {
		dispositivos.add(dispositivo);
	}
	
	public void removeDispositivo(ISemaforo dispositivo) {
		dispositivos.remove(dispositivo);
	}
	
	public void mudaSinal() {
		switch(status) {
			case VERMELHO:
				for (ISemaforo i : dispositivos) i.verde();
				status = SemaforoEnum.VERDE;
				break;
			case VERDE:
				for (ISemaforo i : dispositivos) i.amarelo();
				status = SemaforoEnum.AMARELO;
				break;
			case AMARELO:
				for (ISemaforo i : dispositivos) i.vermelho();
				status = SemaforoEnum.VERMELHO;
				break;
		}
	}
}
