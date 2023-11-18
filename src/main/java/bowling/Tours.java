package bowling;

public class Tours {
	private int numTours;
	private int numCoup = 1;
	private int nbQuilles = 10;
	private static int nbQuillesTombees1; 
	private static int nbQuillesTombees2;
	private static int nbQuillesTombees3;
	private Tours suivant;
	private boolean estFini = false; 
	
	
	/** Constructeurs */
	public Tours(int numTours){
		this.numTours = numTours; 
	}
	

	/** Les methodes de modifications*/ 
	public int scoreTours(int valeur){
		int resultat = 0;
		if(nbQuillesTombees1 < nbQuilles){
			if(nbQuillesTombees1 + nbQuillesTombees2 < nbQuilles){
				resultat = nbQuillesTombees1 + nbQuillesTombees2; 
			}
			if(nbQuillesTombees1 + nbQuillesTombees2 == nbQuilles){
				resultat = 10 + suivant.pourSpare() ;
			}
			
		}
		else {
			resultat = 10 + suivant.pourStrike();
		}
		return resultat; 
	}
	
	public int pourSpare(){
		
		return getSuivant().nbQuillesTombees1;
	}
	
	public int pourStrike(){
		int bonus = 0;
		if(numTours < 10){
			 bonus = getSuivant().nbQuillesTombees1 + getSuivant().nbQuillesTombees2;
		}
		else{
			 bonus = getSuivant().nbQuillesTombees2 + getSuivant().nbQuillesTombees3;
		}
		return bonus;
	}

	public boolean estFini(){
		return estFini;
	}



	/** Les methodes d'acces */
	public static int getNbQuillesTombees1(){
		return nbQuillesTombees1; 
	}
	
	public static int getNbQuillesTombees2(){
		return nbQuillesTombees2; 
	}

	public static int getNbQuillesTombees3() {
		return nbQuillesTombees3;
	}
	
	public int getNumTours(){
		return numTours; 
	}
	
	public Tours getSuivant(){
		return suivant; 
	}

	public int getNumCoup() {
		return numCoup;
	}
}
