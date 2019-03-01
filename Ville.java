
public class Ville {
	private String nom; // nom de la ville
	private String pays; //nom du pays
	private int nbHabitants; // nombre d'habitants
	public static int nombre  = 0; // nombre d'instances de la classe
	
	public Ville() {
		nom="";
		pays="";
		nbHabitants=0;
	}
	public Ville (String n, String p, int nb) {
		nom=n;
		pays=p;
		nbHabitants=nb;
		nombre++;
	}
	
	public void setNbHabitants(int nbHabitants) {
		if(nbHabitants<0) {
			this.nbHabitants=0;	
			System.out.println("Le nombre d'habitants ne peut pas etre négatif");
		}else {
			this.nbHabitants = nbHabitants;
		}
	}
	public int getNbHabitants() {
		return this.nbHabitants;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return this.nom;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getPays() {
		return this.pays;
	}
	public String display(){
		return "ville de"+" " + this.getNom()+" "+ "en" +" "+ this.getPays()+" " +"avec"+ " "+ this.getNbHabitants()+" "+ "habitants" ;
	}
	
	
}


















