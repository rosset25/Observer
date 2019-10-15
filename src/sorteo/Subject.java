package sorteo;

public interface Subject {
	
	public void registerObserver(ObserverLoteriaPrimitiva o);
	public void removeObserver(ObserverLoteriaPrimitiva o);
	public void notifyObservers();

}
