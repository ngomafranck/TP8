
public class Test2 {
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("0---> Nombre de voitures en stock au départ : " + Voiture.stock);
		
		Voiture v1= new Voiture ("renault", "Clio", "diesel", 2010, 12000, 3500, 4, true);
		Voiture v2=new Voiture ("toyota","rav4", "essence", 2016, 15, 1500, 6, true);
		Voiture v3=new Voiture("Mazda","zzz","essence",2017,132000, 4000, 3, false);
		Voiture v4= new Voiture ("Mercedes", "benz", "diesel", 2011, 652000, 13500, 4, false);
		Voiture v5=new Voiture ("Toyota","corolla", "essence", 2016, 15, 1500, 6, true);
		Voiture v6=new Voiture("Peugeot","404","essence",2017,132000, 4000, 3, false);
		
		System.out.println("2---> Nombre de voitures en stock : " + Voiture.stock);
		System.out.println("3---> Nombre de voitures vendues : " + Voiture.nbvente);
		System.out.println("4---> Stock final : " + ((Voiture.stock) - Voiture.nbvente));
	
		System.out.println(v1.display());
		
}
}







