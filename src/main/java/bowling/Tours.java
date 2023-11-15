package bowling;

public class Tours {
	private int nbQuilles1; 
	private int nbQuilles2; 
	private Tours suivant; 
	
	
	/** Constructeurs */
	public Tours(int nbQuilles1, int nbQuilles2){
		this.nbQuilles1 = nbQuilles1; 
		this.nbQuilles2 = nbQuilles2; 
	}
	
	
	
	/** Les methodes de modifications*/ 
	public int scoreTours(int nbQuilles1, int nbQuilles2){
		int resultat = 0;
		if(nbQuilles1 < 10){
			if(nbQuilles1 + nbQuilles2 < 10){
				resultat = nbQuilles1 + nbQuilles2; 
			}
			if(nbQuilles1 + nbQuilles2 == 10){
				resultat = 10 + suivant.bonusPourSpare() ;
			}
			
		}
		else {
			resultat = 10 + suivant.bonusPourStrike();
		}
		return resultat; 
	}
	
	public int bonusPourSpare(){
		return getSuivant().nbQuilles1;
	}
	
	public int bonusPourStrike(){
		int bonus = 0;
		return bonus = getSuivant().nbQuilles1 + getSuivant().nbQuilles2;
	}
	
	
	/** Les methodes d'acces */
	public int getNbQuilles1(){
		return nbQuilles1; 
	}
	
	public int getNbQuilles2(){
		return nbQuilles2; 
	}
	
	public Tours getSuivant(){
		return suivant; 
	}
}
