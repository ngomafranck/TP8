
public class Fraction {

	private int num; // Numérateur de la fraction
	private int den; //Dénominateur de la fraction
	private double quot;// Quotient de la division
	private int rest; // Reste de la division
	
	public Fraction() {
		num=0;
		den=1;
		quot=0;
		rest=0;
	}
	public Fraction(int n, int d, double q, int r) {
		num = n;
		den = d;
		quot= q;
		rest = r;
		quot= num/den;
		rest= (int) (num - (quot * den));
		if (den==0) {
			System.out.println("Impossible de diviser un nombre par zero");
		}else {
			quot= num/den;
		}
	}
	public void setNum (int num) {
		this.num =num;
	}
	public int getNum() {
		return this.num;
	}
	public void setDen(int den) {
		this.den =den;
	}
	public int getDen() {
		return this.den;
	}
	public void setQuot(double quot) {
		
		this.quot =quot;
	}
	public double getQuot() {
		return this.quot;
	}
	public void setRest(int rest) {
		this.rest =rest;
	}
	public int getRest() {
		return this.rest;
	}
	
	public Fraction somme(Fraction uneFraction){
		  int numF2= uneFraction.num;
		  int denF2= uneFraction.den;
		  int num=this.num*denF2 + numF2*this.den;
		  int den=this.den*denF2;
		  Fraction frac=new Fraction();
		  return frac;
		 }
	
	public String display(){
		return "la fraction"+" " + (this.getNum()+"/"+this.getDen())+" "+ "donne"+" "+ this.getQuot();
	}

}







