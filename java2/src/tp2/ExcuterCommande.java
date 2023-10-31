package tp2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ExcuterCommande {
 
	public void executerCommande (String commande) throws InterruptedException {
		try {
			Process process =Runtime.getRuntime().exec(commande);
	
			if (process.waitFor(5, TimeUnit.SECONDS)==false) {
				process.destroy();
			}
			System.out.print(process.exitValue());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
