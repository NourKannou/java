package tp1;

public class Boite <B> {
B contenu;

public Boite(B contenu) {
	super();
	this.contenu = contenu;
}

public B getContenu() {
	return contenu;
}

public void setContenu(B contenu) {
	this.contenu = contenu;
}

}
