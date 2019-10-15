package sorteo;

import java.util.ArrayList;
import java.util.List;

public class Periodico implements ObserverJugador, ObserverLoteriaPrimitiva {
	private ArrayList<Integer> combGandora;
	private int numeroAcertantes;
	
	
	public Periodico() {
		this.numeroAcertantes = 0;
		this.combGandora = new ArrayList<Integer>();
		
	}

	
	@Override
	public void updateLoteria(List<Integer> combinacionGanadora) {
		this.combGandora = (ArrayList<Integer>) combinacionGanadora;
	}

	@Override
	public void updateJugador(List<Integer> combinacionJugador) {
		// TODO Auto-generated method stub
		
	}

	public void Show() {
		// TODO Auto-generated method stub
		
	}

}
