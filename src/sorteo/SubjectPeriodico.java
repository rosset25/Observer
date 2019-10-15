package sorteo;

public interface SubjectPeriodico {

	public void registerObserver(ObserverJugador o);
	public void removeObserver(ObserverJugador o);
	public void notifyObservers(int aciertos);
}
