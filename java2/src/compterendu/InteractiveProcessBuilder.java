package compterendu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InteractiveProcessBuilder {
    public static void main(String[] args) {
              // Créez une liste de chaînes pour stocker la commande système
        List<String> commands = new ArrayList<>();

             // Demandez à l'utilisateur d'entrer un paramètre
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un paramètre pour la commande (ex: google.com) : ");
        String parameter = scanner.nextLine();

             // Exemple de commande "ping" pour tester la connectivité réseau avec le paramètre entré
        commands.add("ping");
        commands.add(parameter);

        try {
              // Créez un objet ProcessBuilder en utilisant la liste de commandes
            ProcessBuilder processBuilder = new ProcessBuilder(commands);

              // Démarrez le processus
            Process process = processBuilder.start();

              // Créez un objet BufferedReader pour lire la sortie standard du processus
            InputStream inputStream = process.getInputStream();
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;

              // Lisez la sortie standard du processus ligne par ligne et affichez-la en temps réel
            while ((line = inputReader.readLine()) != null) {
                System.out.println(line);
            }

            // Attendez que le processus se termine et affichez le code de sortie
            int exitCode = process.waitFor();
            System.out.println("Le processus s'est terminé avec le code de sortie : " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

