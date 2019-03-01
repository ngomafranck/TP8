
public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Nombre d'instances créées : " + Ville.nombre);
		
		 Ville v1 =new Ville ("Toulouse", "France", 25000000);
		 Ville v2 =new Ville ("New York", "USA", 15000000);
		 Ville v3 =new Ville ("Brazzaville", "CONGO", 4000000);
		 System.out.println("Nombre d'instances crées : " + Ville.nombre);
		
		 System.out.println(v1.display());

		// v1.setNbHabitants(-200); 
		//System.out.println("ma ville est:"+"  "+ v1.nom);	
		//System.out.println("mon pays est:"+"  "+ v1.pays);
		//System.out.println("ma ville est:"+"  "+ v1.nom + "  "+ "le nom du pays est:" +v1.pays +" "+ " le nombre d'habitants est:" + v1.nbHabitants);
		 //System.out.println("le nombre d'habitants est:"+"  "+ v1.getNbHabitants());
		//System.out.println("ma ville est:"+"  "+ v2.nom + "  "+ "le nom du pays est:" +v2.pays +" "+ " le nombre d'habitants est:" + v2.nbHabitants);
		//System.out.println("ma ville est:"+"  "+ v3.nom + "  "+ "le nom du pays est:" +v3.pays +" "+ " le nombre d'habitants est:" + v3.nbHabitants);
			
		
	}

}

