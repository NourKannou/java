package tp1;

public class Testtp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Boite<Integer> b = new Boite<Integer>(2);
     Boite<Double>  a = new Boite<Double>(2.3);
     
     Paire<Integer,String> P= new Paire<Integer,String>(5,"g");
     Double tab1[]  = {1.3,1.2};
     Integer tab2[]= {1,2,3};
     
     Calculateur c1 = new Calculateur();
     Calculateur c2 = new Calculateur();
     
     c1.somme(tab1);
     c2.somme(tab2);
	
	
	}

}
