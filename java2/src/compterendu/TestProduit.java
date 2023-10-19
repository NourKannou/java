package compterendu;

public class TestProduit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Fournisseur<Integer> fournisseur1 = new Fournisseur<>("Fournisseur A", 1);
		        Fournisseur<String> fournisseur2 = new Fournisseur<>("Fournisseur B", 2);

		        Produit<Integer> produit1 = new Produit<>("Produit 1", 101, 10.99);
		        Produit<Integer> produit2 = new Produit<>("Produit 2", 102, 15.49);
		        Produit<String> produit3 = new Produit<>("Produit 3", "ABC123", 5.99);

		        fournisseur1.ajouterProduit(produit1);
		        fournisseur1.ajouterProduit(produit2);
		        fournisseur2.ajouterProduit(produit3);

		        fournisseur1.afficherProduits();
		        fournisseur2.afficherProduits();
		    }
		

	}


