package sorteo;

import java.util.ArrayList;
import java.util.List;

public class Periodico implements ObserverJugador, ObserverLoteriaPrimitiva {
	private ArrayList<Integer> combGandora;
	private int[] acertantes;
	
	
	public Periodico() {
		this.combGandora = new ArrayList<Integer>();
		this.acertantes = new int[4];
	}

	
	@Override
	public void updateLoteria(List<Integer> combinacionGanadora) {
		this.combGandora = (ArrayList<Integer>) combinacionGanadora;
	}


	public void Show() {
		System.out.println("Combinación ganadora: " + this.combGandora);
		System.out.println("Cantidad de personas que han acertado 3: " + acertantes[0]);
		System.out.println("Cantidad de personas que han acertado 4: " + acertantes[1]);
		System.out.println("Cantidad de personas que han acertado 5: " + acertantes[2]);
		System.out.println("Cantidad de personas que han acertado 6: " + acertantes[3]);
		
	}


	@Override
	public void updateJugador(int aciertosJugador) {
		switch(aciertosJugador) {
			case 3: 
				acertantes[0]++;
				break;
			case 4:
				acertantes[1]++;
				break;
			case 5:
				acertantes[2]++;
				break;
			case 6:
				acertantes[3]++;
			}
		
	}

}
