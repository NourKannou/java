package tp2;

import java.util.Scanner;

public class Maintp2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ExcuterCommande ex =new ExcuterCommande();
System.out.print("inserez votre commande");
Scanner s  = new Scanner(System.in);
String commande = s.nextLine();
ex.executerCommande(commande);
		
		
	}

}
