package model;

import java.util.ArrayList;

public class Jogador {
	private int vidas, palpitesDeVitoria, vitorias;
	private ArrayList<Integer> cartasNaMao = new ArrayList<>();

	public int getPalpitesDeVitoria() {
		return palpitesDeVitoria;
	}

	public void setPalpitesDeVitoria(int palpitesDeVitoria) {
		this.palpitesDeVitoria = palpitesDeVitoria;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}


	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public ArrayList<Integer> getCartasNaMao() {
		return cartasNaMao;
	}

	public void darCartaAoJogador(int carta) {
		cartasNaMao.add(carta);
	}

	public void devolverCartas() {
		cartasNaMao.clear();
	}
}
