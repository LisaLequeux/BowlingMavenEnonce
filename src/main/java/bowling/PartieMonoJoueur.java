package bowling;

import java.util.ArrayList;

/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancers successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class PartieMonoJoueur {
	private int points; 
	private int numeroTour = 1;
	private static int nbTours = 10; 
	private static int nbQuilles = 10; 
	
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
		partie.get(numeroTour-1).scoreTours(nombreDeQuillesAbattues);
		if(!partie.get(numeroTour-1).estFini()){
			response = true;
		}
		else {
			response = false; 
		}
		if(numeroTour < nbTours) {
			nbTours++;
		}
		return response; 
	}
	
	 
	/**
	 * Cette méthode donne le score du joueur.
	 * Si la partie n'est pas terminée, on considère que les lancers restants
	 * abattent 0 quille.
	 * @return Le score du joueur
	 */
	public int score() {
		int total = 0;
		int quillesTombees = Tours.getNbQuillesTombees1() + Tours.getNbQuillesTombees2();
		for(int i=1; i< 9; i++) {
			Tours tours = partie.get(i);	
			total += total + tours.scoreTours(quillesTombees);
		}
		return total;
	}
	

	/**
	 * @return vrai si la partie est terminée pour ce joueur, faux sinon
	 */
	public boolean estTerminee() {
		
		return partie.get(nbTours-1).estFini();
	}


	/**
	 * @return Le numéro du tour courant [1..10], ou 0 si le jeu est fini
	 */
	public int numeroTourCourant() {
		if (estTerminee()) return 0;
		return numeroTour;
	}

	/**
	 * @return Le numéro du prochain lancer pour tour courant [1..3], ou 0 si le jeu
	 *         est fini
	 */
	public int numeroProchainLancer() {
		if (estTerminee()) return 0;
		else if (numeroTour == nbTours) return partie.get(nbTours-1).getNumCoup() + 1;
		else return partie.get(numeroTour).getNumCoup();
	}

}
