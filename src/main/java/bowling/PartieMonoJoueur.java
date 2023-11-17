package bowling;

import java.util.ArrayList;

/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancers successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class PartieMonoJoueur {
	private int points; 
	private int nbTours = 10; 
	
	ArrayList<Tours> partie = new ArrayList<>();
	
	/**
	 * Constructeur
	 */
	public PartieMonoJoueur() {
		for(int i = 1 ; i<= nbTours ; i++){
			partie.add(new Tours(i));
		}
	}

	/**
	 * Cette méthode doit être appelée à chaque lancer de boule
	 *
	 * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de ce lancer
	 * @throws IllegalStateException si la partie est terminée
	 * @return vrai si le joueur doit lancer à nouveau pour continuer son tour, faux sinon	
	 */
	public boolean enregistreLancer(int nombreDeQuillesAbattues) {
		if(estTerminee())
			throw new IllegalStateException("La partie est terminée!");
		boolean response = true; 
		int i = 10; 
		if(nombreDeQuillesAbattues < i){
			response = true; 
		}
		else {
			response = false; 
		}
		return response; 
	}
	
	/** regarder replit pour voir comment metre throw new Illegal ...

	 
	 
	/**
	 * Cette méthode donne le score du joueur.
	 * Si la partie n'est pas terminée, on considère que les lancers restants
	 * abattent 0 quille.
	 * @return Le score du joueur
	 */
	public int score() {
		int total = 0;
		for(int i=1; i< 9; i++) {
			Tours tours = partie.get(i);	
			total += tours.scoreTours(partie.get(i+1));
		}
		return total;
	}

	/**
	 * @return vrai si la partie est terminée pour ce joueur, faux sinon
	 */
	public boolean estTerminee() {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}


	/**
	 * @return Le numéro du tour courant [1..10], ou 0 si le jeu est fini
	 */
	public int numeroTourCourant() {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

	/**
	 * @return Le numéro du prochain lancer pour tour courant [1..3], ou 0 si le jeu
	 *         est fini
	 */
	public int numeroProchainLancer() {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

}
