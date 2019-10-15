package sorteo;

import java.util.ArrayList;
import java.util.List;


public class Jugador implements ObserverLoteriaPrimitiva, Subject{
	private String nombre;
	private List<Integer> combinacion;
	private ArrayList<ObserverLoteriaPrimitiva> observers;
	


	public Jugador(String nombre, List<Integer> combinacion) {
		this.nombre = nombre;
		this.combinacion = combinacion;
		this.observers = new ArrayList<ObserverLoteriaPrimitiva>();
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
		System.out.println("Soy " + nombre + ", \t aciertos: " + aciertos + ",\t combinación: " + combinacion);
		
	}

	@Override
	public void registerObserver(ObserverLoteriaPrimitiva o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(ObserverLoteriaPrimitiva o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			ObserverLoteriaPrimitiva observer = (ObserverLoteriaPrimitiva)observers.get(i);
			//observer.update(); 
		} 
	}
}
