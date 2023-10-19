package compterendu;

public class Produit<T> {
    private String nom;
    private T reference;
    private double prix;

    public Produit(String nom, T reference, double prix) {
        this.nom = nom;
        this.reference = reference;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public T getReference() {
        return reference;
    }

    public double getPrix() {
        return prix;
    }
}

