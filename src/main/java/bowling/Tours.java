package bowling;

public class Tours {
	private int numTours;
	private int nbQuilles = 10;
	private int nbQuillesTombees1; 
	private int nbQuillesTombees2;
	private int nbQuillesTombees3;
	private boolean estFini = false; 
	
	
	/** Constructeurs */
	public Tours(int numTours){
		this.numTours = numTours; 
	}
	

	/** Les methodes de modifications*/ 
	public int scoreTours(Tours suivant){
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
		return bonus = getSuivant().nbQuillesTombees1 + getSuivant().nbQuillesTombees2;
	}

	public boolean estFini(){
		return estFini;
	}



	/** Les methodes d'acces */
	public int getNbQuilles1(){
		return nbQuillesTombees1; 
	}
	
	public int getNbQuilles2(){
		return nbQuillesTombees2; 
	}
}
