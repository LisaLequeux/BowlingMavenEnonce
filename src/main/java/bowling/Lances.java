package bowling;

public class Lances extends Tours{
	private int nbLances; 
	private int nbQuilles;
	
	/** Constructeurs */
	public Lances(int nbLances, int nbQuilles){
		this.nbLances = nbLances;
		this.nbQuilles = nbQuilles; 
	}
	
	
	/** Les méthodes de modifications */
	
	
	/** Les méthodes d'accès */
	public int getNbLances(){
		return nbLances; 
	}
	
	public int getNbQuilles(){
		return nbQuilles; 
	}
	
	
	
}
