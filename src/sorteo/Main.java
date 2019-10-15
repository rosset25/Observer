package sorteo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		LoteriaPrimitiva loteria = new LoteriaPrimitiva();	
		Periodico periodico = new Periodico();	
			 	
		List<Jugador> jugadores = new ArrayList<Jugador>();	
		ArrayList<Integer> combJug;
		Random generator = new Random(23);
		int num;
		Jugador jugador;
		
		for( int i = 0; i < 1000000; i++) {
			combJug = new ArrayList<Integer>();
			while(combJug.size() < 6) {
				 num = generator.nextInt(50);
				 if(!combJug.contains(num)) {
					 combJug.add(num);
				 } 
			}
			
			jugador = new Jugador ("Player" + i, combJug);	
			jugadores.add(jugador);
		}
		
			 	
		// el periodico se registra a la loteria (IMPORTANTE: primero que nadie)
		loteria.registerObserver(periodico);
			 	
		// los jugadores se registran a la loteria
		for (Jugador j: jugadores) loteria.registerObserver(j);
			 	
		// el periodico se registra a los jugadores
		for (Jugador j: jugadores) j.registerObserver(periodico);
						
		loteria.nuevoSorteo();
		periodico.Show();
	}

}
