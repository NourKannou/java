package tp1;

public class Calculateur {
 
	
	
	public <T extends Number> double somme (T[]tab) {
	 double total=0;
	 for(int i=0;i<tab.length;i++) {
		 total+=tab[i].doubleValue();
}
	 return total;
}
	











}
