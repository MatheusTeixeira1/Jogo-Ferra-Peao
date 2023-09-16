package model;

public class Carta {
	private int id, nome, naipe;

	public int visualizarId(int carta) {
		id = carta;
		return id;
	}
	public int visualizarNome(int carta) {
		nome = ((carta - 1) % 13 + 1);
		return nome;
	}
	public int visualizarNaipe(int carta) {
		naipe = (int) (carta / 13);
		return naipe;
	}
}
