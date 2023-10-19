package compterendu;

import java.util.ArrayList;
import java.util.List;

public class Fournisseur<T> {
    private String nom;
    private int id;
    private List<Produit<T>> produitsFournis;

    public Fournisseur(String nom, int id) {
        this.nom = nom;
        this.id = id;
        this.produitsFournis = new ArrayList<>();
    }

    public void ajouterProduit(Produit<T> produit) {
        produitsFournis.add(produit);
    }

    public void afficherProduits() {
        System.out.println("Fournisseur: " + nom + " (ID: " + id + ")");
        System.out.println("Liste de produits fournis:");
        for (Produit<T> produit : produitsFournis) {
            System.out.println("Nom: " + produit.getNom() + ", Référence: " + produit.getReference() + ", Prix: " + produit.getPrix());
        }
    }
}
