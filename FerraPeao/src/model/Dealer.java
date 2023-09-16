package model;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dealer {
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	private int numeroDeCartasPorJogador, incrementoDeNumeroDeCartas;
	private List<Integer> listaDeCartas;
	private int primeiroJogador;

	private Jogador jogador1;
	private Jogador jogador2;
	private Jogador jogador3;
	private Jogador jogador4;
	private Jogador jogador5;
	private Jogador jogador6;
	private Jogador jogador7;
	private Jogador jogador8;
	private Jogador jogador9;
	private Jogador jogador10;

	public void instanciarJogadores(int numeroDeJogadores) {
		for (int i = 1; i <= numeroDeJogadores; i++) {
			if (i == 1) {
				jogador1 = new Jogador();
			} else if (i == 2) {
				jogador2 = new Jogador();

			} else if (i == 3) {
				jogador3 = new Jogador();

			} else if (i == 4) {
				jogador4 = new Jogador();

			} else if (i == 5) {
				jogador5 = new Jogador();

			} else if (i == 6) {
				jogador6 = new Jogador();

			} else if (i == 7) {
				jogador7 = new Jogador();

			} else if (i == 8) {
				jogador8 = new Jogador();

			} else if (i == 9) {
				jogador9 = new Jogador();

			} else if (i == 10) {
				jogador10 = new Jogador();

			}
		}
	}

	public void distribuirCartas(List<Integer> listaDeCartas, int numeroDeJogadores) {
		int nDecartaNaMao = listaDeCartas.size() / numeroDeJogadores;
		for (int i = 0; i < numeroDeJogadores; i++) {
			if (i == 0) {

				for (int j = 0; j < nDecartaNaMao; j++) {
					jogador1.darCartaAoJogador(listaDeCartas.get(0));
					listaDeCartas.remove(0);
				}
			} else if (i == 1) {
				for (int j = 0; j < nDecartaNaMao; j++) {
					jogador2.darCartaAoJogador(listaDeCartas.get(0));
					listaDeCartas.remove(0);
				}
			} else if (i == 2) {
				for (int j = 0; j < nDecartaNaMao; j++) {
					jogador3.darCartaAoJogador(listaDeCartas.get(0));
					listaDeCartas.remove(0);
				}
			} else if (i == 3) {
				for (int j = 0; j < nDecartaNaMao; j++) {
					jogador4.darCartaAoJogador(listaDeCartas.get(0));
					listaDeCartas.remove(0);
				}
			} else if (i == 4) {
				for (int j = 0; j < nDecartaNaMao; j++) {
					jogador5.darCartaAoJogador(listaDeCartas.get(0));
					listaDeCartas.remove(0);
				}
			} else if (i == 5) {
				for (int j = 0; j < nDecartaNaMao; j++) {
					jogador6.darCartaAoJogador(listaDeCartas.get(0));
					listaDeCartas.remove(0);
				}
			} else if (i == 6) {
				for (int j = 0; j < nDecartaNaMao; j++) {
					jogador7.darCartaAoJogador(listaDeCartas.get(0));
					listaDeCartas.remove(0);
				}
			} else if (i == 7) {
				for (int j = 0; j < nDecartaNaMao; j++) {
					jogador8.darCartaAoJogador(listaDeCartas.get(0));
					listaDeCartas.remove(0);
				}
			} else if (i == 8) {
				for (int j = 0; j < nDecartaNaMao; j++) {
					jogador9.darCartaAoJogador(listaDeCartas.get(0));
					listaDeCartas.remove(0);
				}
			} else if (i == 9) {
				for (int j = 0; j < nDecartaNaMao; j++) {
					jogador10.darCartaAoJogador(listaDeCartas.get(0));
					listaDeCartas.remove(0);
				}
			}

		}
	}

	public void faseDePalpite(int jogadorInicial, int numeroDeJogadores, int numeroDeCartasPorJogador) {
		int jogadorAtual = jogadorInicial;
		int palpite = 0;
		int totalDePalpites = 0;
		for (int i = 0; i < numeroDeJogadores; i++) {

			if (jogadorAtual == 1) {
				while (true) {
					System.out.println("Digite quantas rodadas voce acha que consegue ganhar jogador, " + jogadorAtual);
					palpite = sc.nextInt();
					if (palpite + totalDePalpites == numeroDeCartasPorJogador && i == numeroDeJogadores - 1) {
						System.out
								.println("O total de palpites não pode ser equivalente com o numero de cartas na mão");
					} else {
						totalDePalpites = totalDePalpites + palpite;
						jogador1.setPalpitesDeVitoria(palpite);
						break;
					}
				}
			} else if (jogadorAtual == 2) {
				while (true) {
					System.out.println("Digite quantas rodadas voce acha que consegue ganhar jogador, " + jogadorAtual);
					palpite = sc.nextInt();
					if (palpite + totalDePalpites == numeroDeCartasPorJogador && i == numeroDeJogadores - 1) {
						System.out
								.println("O total de palpites não pode ser equivalente com o numero de cartas na mão");
					} else {
						totalDePalpites = totalDePalpites + palpite;
						jogador2.setPalpitesDeVitoria(palpite);
						break;
					}
				}
			} else if (jogadorAtual == 3) {
				while (true) {
					System.out.println("Digite quantas rodadas voce acha que consegue ganhar jogador, " + jogadorAtual);
					palpite = sc.nextInt();
					if (palpite + totalDePalpites == numeroDeCartasPorJogador && i == numeroDeJogadores - 1) {
						System.out
								.println("O total de palpites não pode ser equivalente com o numero de cartas na mão");
					} else {
						totalDePalpites = totalDePalpites + palpite;
						jogador3.setPalpitesDeVitoria(palpite);
						break;
					}
				}
			} else if (jogadorAtual == 4) {
				while (true) {
					System.out.println("Digite quantas rodadas voce acha que consegue ganhar jogador, " + jogadorAtual);
					palpite = sc.nextInt();
					if (palpite + totalDePalpites == numeroDeCartasPorJogador && i == numeroDeJogadores - 1) {
						System.out
								.println("O total de palpites não pode ser equivalente com o numero de cartas na mão");
					} else {
						totalDePalpites = totalDePalpites + palpite;
						jogador4.setPalpitesDeVitoria(palpite);
						break;
					}
				}
			} else if (jogadorAtual == 5) {
				while (true) {
					System.out.println("Digite quantas rodadas voce acha que consegue ganhar jogador, " + jogadorAtual);
					palpite = sc.nextInt();
					if (palpite + totalDePalpites == numeroDeCartasPorJogador && i == numeroDeJogadores - 1) {
						System.out
								.println("O total de palpites não pode ser equivalente com o numero de cartas na mão");
					} else {
						totalDePalpites = totalDePalpites + palpite;
						jogador5.setPalpitesDeVitoria(palpite);
						break;
					}
				}
			} else if (jogadorAtual == 6) {
				while (true) {
					System.out.println("Digite quantas rodadas voce acha que consegue ganhar jogador, " + jogadorAtual);
					palpite = sc.nextInt();
					if (palpite + totalDePalpites == numeroDeCartasPorJogador && i == numeroDeJogadores - 1) {
						System.out
								.println("O total de palpites não pode ser equivalente com o numero de cartas na mão");
					} else {
						totalDePalpites = totalDePalpites + palpite;
						jogador6.setPalpitesDeVitoria(palpite);
						break;
					}
				}
			} else if (jogadorAtual == 7) {
				while (true) {
					System.out.println("Digite quantas rodadas voce acha que consegue ganhar jogador, " + jogadorAtual);
					palpite = sc.nextInt();
					if (palpite + totalDePalpites == numeroDeCartasPorJogador && i == numeroDeJogadores - 1) {
						System.out
								.println("O total de palpites não pode ser equivalente com o numero de cartas na mão");
					} else {
						totalDePalpites = totalDePalpites + palpite;
						jogador7.setPalpitesDeVitoria(palpite);
						break;
					}
				}
			} else if (jogadorAtual == 8) {
				while (true) {
					System.out.println("Digite quantas rodadas voce acha que consegue ganhar jogador, " + jogadorAtual);
					palpite = sc.nextInt();
					if (palpite + totalDePalpites == numeroDeCartasPorJogador && i == numeroDeJogadores - 1) {
						System.out
								.println("O total de palpites não pode ser equivalente com o numero de cartas na mão");
					} else {
						totalDePalpites = totalDePalpites + palpite;
						jogador8.setPalpitesDeVitoria(palpite);
						break;
					}
				}
			} else if (jogadorAtual == 9) {
				while (true) {
					System.out.println("Digite quantas rodadas voce acha que consegue ganhar jogador, " + jogadorAtual);
					palpite = sc.nextInt();
					if (palpite + totalDePalpites == numeroDeCartasPorJogador && i == numeroDeJogadores - 1) {
						System.out
								.println("O total de palpites não pode ser equivalente com o numero de cartas na mão");
					} else {
						totalDePalpites = totalDePalpites + palpite;
						jogador9.setPalpitesDeVitoria(palpite);
						break;
					}
				}
			} else if (jogadorAtual == 10) {
				while (true) {
					System.out.println("Digite quantas rodadas voce acha que consegue ganhar jogador, " + jogadorAtual);
					palpite = sc.nextInt();
					if (palpite + totalDePalpites == numeroDeCartasPorJogador && i == numeroDeJogadores - 1) {
						System.out
								.println("O total de palpites não pode ser equivalente com o numero de cartas na mão");
					} else {
						totalDePalpites = totalDePalpites + palpite;
						jogador10.setPalpitesDeVitoria(palpite);
						break;
					}
				}
			}

			jogadorAtual++;
			if (jogadorAtual == numeroDeJogadores + 1) {
				jogadorAtual = 1;
			}
		}
		System.out.println("fim");
	}

	public void faseDeCombate(int jogadorInicial, int numeroDeJogadores, int numeroDeCartasPorJogador) {
		for (int i = 0; i < numeroDeCartasPorJogador; i++) {
			
		}
	}
	
	public void controleDoNumeroDeCartas() {
		if (numeroDeCartasPorJogador == 5) {
			incrementoDeNumeroDeCartas = -1;
		} else if (numeroDeCartasPorJogador == 1) {
			incrementoDeNumeroDeCartas = 1;
		}
		
		numeroDeCartasPorJogador = numeroDeCartasPorJogador + incrementoDeNumeroDeCartas;
	}

	public void controleDaVezDoJogador(int numeroDeJogadores) {
		if (primeiroJogador == numeroDeJogadores) {
			primeiroJogador = 0;
		}
		primeiroJogador++;		
	}
	
	public void iniciarJogo(int numeroDeJogadores) {
		Baralho baralho = new Baralho();
		numeroDeCartasPorJogador = 1;
		primeiroJogador = random.nextInt(numeroDeJogadores) + 1;
		
		instanciarJogadores(numeroDeJogadores);
		
		while (numeroDeJogadores > 1) {

			listaDeCartas = baralho.pegarNCarts(numeroDeJogadores * numeroDeCartasPorJogador);

			distribuirCartas(listaDeCartas, numeroDeJogadores);
			faseDePalpite(primeiroJogador, numeroDeJogadores, numeroDeCartasPorJogador);
			faseDeCombate(primeiroJogador, numeroDeJogadores, numeroDeCartasPorJogador);

			controleDoNumeroDeCartas();
			controleDaVezDoJogador(numeroDeJogadores);
			
		}
	}

}
