package sorteo;

public interface SubjectJugador {
	
	public void registerObserver(ObserverLoteriaPrimitiva o);
	public void removeObserver(ObserverLoteriaPrimitiva o);
	public void notifyObservers();

}
