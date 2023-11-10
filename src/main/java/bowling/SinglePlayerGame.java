package bowling;

/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancés successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class SinglePlayerGame {

	/**
	 * Constructeur
	 */
	public SinglePlayerGame() {
	}

	/**
	 * Cette méthode doit être appelée à chaque lancé de boule
	 *
	 * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de
	 *                                ce lancé
	 */
	public void lancer(int nombreDeQuillesAbattues) {

	}

	/**
	 * Cette méthode donne le score du joueur
	 *
	 * @return Le score du joueur
	 */
	public int score() {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

	/**
	 * @return vrai si le jeu est finin faux sinon
	 */
	public boolean isFinished() {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

	/**
	 * @return vrai si le dernier lancer à terminé le tour précédent
	 */
	public boolean hasCompletedFrame() {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

	/**
	 * @return Le numéro du tour courant [1..10], ou 0 si le jeu est fini
	 */
	public int getFrameNumber() {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

	/**
	 * @return Le numéro du prochain lancer pour tour courant [1..3], ou 0 si le jeu
	 *         est fini
	 */
	public int getNextBallNumber() {
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

}
