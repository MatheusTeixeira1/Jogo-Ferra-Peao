package model;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Baralho {

	Random random = new Random();
	private List<Integer> listaDeCartas = new ArrayList<>();
	private int carta;
	
	public List<Integer> pegarNCarts(int nCartas) {
		
		for(int i = 0;i<nCartas;i++) {
			while(true) {
				carta = random.nextInt(54) + 1;
				if(!listaDeCartas.contains(carta)) {
					listaDeCartas.add(carta);				
					break;
				}
				
			}
		}
		
		//listaDeCartas.clear();
		return listaDeCartas;
	}
	public static void main(String[] args) {
		
	}
	
}

