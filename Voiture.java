
public class Voiture {

	private String marque; // Marque de la voiture
	private String type; // Type de  voiture
	private String moteur; // Moteur de la voiture exemple diesel
	private int annee; // Année de ise en circulation de la voiture
	private double nbKm; // Nombre de kilomètre déjà parcourus par la voiture
	private double argus; // Prix de la voiture
	private int nbCh; // Nombre de chevaux de la voiturenbvente
	private boolean vente=Boolean.FALSE;// Indique si oui ou non la voiture est vendue
	public static int stock=0; // Stock (ou nombre) de voitures sur parc
	public static int nbvente=0; // Les ventes réalisées
	
	public Voiture() {
		marque="";
		type="";
		moteur="";
		annee=0;
		nbKm=0;
		argus=0;
		nbCh=0;
		vente=Boolean.FALSE;
	}
	public Voiture(String ma, String t, String mo, int a, double k, double g, int c,boolean v) {
		marque =ma;
		type=t;
		moteur=mo;
		annee=a;
		nbKm=k;
		argus=g;
		nbCh=c;
		vente=v;
		stock++;
		if(vente == true ) {
			Voiture.nbvente=nbvente+1;
				
		}else {
			Voiture.nbvente=nbvente;
		}
			
	}
	
	public void setMarque(String marque) {
		this.marque=marque;
	}
	public String getMarque() {
		return this.marque;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return this.type;
	}
	public void setMoteur(String moteur) {
		this.moteur=moteur;
	}
	public String getMoteur() {
		return this.moteur;
	}
	public void setAnnee(int annee) {
		this.annee=annee;
	}
	public int getAnnee() {
		return this.annee;
	}
	public void setNbKm(int nbKm) {
		this.nbKm=nbKm;
	}
	public double getNbKm() {
		return this.nbKm;
	}
	public void setArgus(int argus) {
		this.argus=argus;
	}
	public double getArgus() {
		return this.argus;
	}
	public void setNbCh(int nbCh) {
		this.nbCh=nbCh;
	}
	public int getNbCh() {
		return this.nbCh;
	}
	
	public void setVente(boolean vente) {
		for(int i=0; i<= stock;i++) {
			if(vente= true ) {
				nbvente++;
				System.out.println(nbvente);
			}
		}
	}
	public boolean getVente() {
		return this.vente;
	}
	public String display(){
		return "la voiture de marque"+" " + this.getMarque()+" "+ "et de type" +" "+ this.getType()+" " +"a pour moteur"+ " "+ this.getMoteur()+" "+ "coute"+ " "+this.getArgus()+ " "+"euros"+ ""+this.vente;
	}
}













