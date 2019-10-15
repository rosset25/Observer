package sorteo;

import java.util.ArrayList;
import java.util.List;


public class Jugador implements ObserverLoteriaPrimitiva, SubjectPeriodico{
	private String nombre;
	private List<Integer> combinacion;
	private ObserverJugador observer;
	

	public Jugador(String nombre, List<Integer> combinacion) {
		this.nombre = nombre;
		this.combinacion = combinacion;
		this.observer = null;
	}
	
	public int numeroAciertos(List<Integer> combinacionGanadora) {
		List<Integer> copia = new ArrayList<Integer>();
		for (int numero : combinacion) {
			copia.add(numero);
		}
		
		copia.retainAll(combinacionGanadora);
		return copia.size();
	}

	@Override
	public void updateLoteria(List<Integer> combinacionGanadora) {
		int aciertos = numeroAciertos(combinacionGanadora);
		//System.out.println("Soy " + nombre + ", \t aciertos: " + aciertos + ",\t combinación: " + combinacion);
		notifyObservers(aciertos);
	}

	@Override
	public void registerObserver(ObserverJugador o) {
		this.observer = o;
		
	}

	@Override
	public void removeObserver(ObserverJugador o) {
		this.observer = null;
		
	}

	@Override
	public void notifyObservers(int aciertos) {
		observer.updateJugador(aciertos); 
	}

}
