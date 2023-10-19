package tp1;

public class Paire <P,T>{
	P contenu1;
	T contenu2;
    public P getContenu1() {
		return contenu1;
	}
	public void setContenu1(P contenu1) {
		this.contenu1 = contenu1;
	}
	public T getContenu2() {
		return contenu2;
	}
	public void setContenu2(T contenu2) {
		this.contenu2 = contenu2;
	}
	public Paire(P contenu1, T contenu2) {
		super();
		this.contenu1 = contenu1;
		this.contenu2 = contenu2;
	}
	
	

	

}
