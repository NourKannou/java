package tp1;

import java.util.ArrayList;
import java.util.List;

public class ListeTableau<T> implements Listegenerique<T>{
	List<T> tab = new ArrayList<T>();
	@Override
	public void ajouter(T t) {
		tab.add(t);
		
	}

	@Override
	public T get() {
		// TODO Auto-generated method stub
		return tab.get(0);
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return tab.size();
	}
	
	
	public static void main(String[] args) {
		ListeTableau<Integer> lt = new ListeTableau<Integer>();
		lt.ajouter(5);
		lt.ajouter(5);
		lt.ajouter(5);
		System.out.println(lt.taille());
	}

}
