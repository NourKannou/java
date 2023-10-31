 package tp2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomProcessBuilder {

public void main() throws IOException, InterruptedException {
	List<String> commandes=new ArrayList <String>();
	commandes.add("cmd.exe");
	commandes.add("/c");
	ProcessBuilder pb = new ProcessBuilder(commandes);
	Process p =pb.start();
	Scanner s = new Scanner(p.getInputStream());
	while (s.hasNextLine())
			{System.out.print(s.nextLine());}
	p.waitFor();	
}
}
