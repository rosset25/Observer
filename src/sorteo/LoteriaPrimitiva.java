package sorteo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoteriaPrimitiva implements SubjectJugador{
	private List<Integer> combinacionGanadora;
	private ArrayList<ObserverLoteriaPrimitiva> observersLoteria;
	
	public LoteriaPrimitiva() {
		this.observersLoteria = new ArrayList<ObserverLoteriaPrimitiva>();
	}
	
	public void nuevoSorteo(){
		this.combinacionGanadora = new ArrayList<Integer>();
		
		Random generator = new Random(23);
		
		int num;
		while(combinacionGanadora.size() < 6) {
			 num = generator.nextInt(50);
			 if(!combinacionGanadora.contains(num)) {
				 combinacionGanadora.add(num);
			 } 
		}
		
		// [27, 48, 33, 47, 18, 43]
		//System.out.println("La combinación ganadora es: " + combinacionGanadora);
		this.notifyObservers();
	}

	@Override
	public void registerObserver(ObserverLoteriaPrimitiva o) {
		observersLoteria.add(o);
		
	}

	@Override
	public void removeObserver(ObserverLoteriaPrimitiva o) {
		int i = observersLoteria.indexOf(o);
		if (i >= 0) {
			observersLoteria.remove(i);
		}		
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observersLoteria.size(); i++) {
			ObserverLoteriaPrimitiva observer = (ObserverLoteriaPrimitiva)observersLoteria.get(i);
			observer.updateLoteria(combinacionGanadora); 
		} 
		
	}

	
	
	
	
}
