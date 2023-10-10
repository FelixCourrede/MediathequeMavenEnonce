package mediatheque;

import java.util.LinkedList;
import java.util.List;



public class Mediatheque {
	private final List<Item> items = new LinkedList<>();
	private final visitorCD visitorcd = new visitorCD();
	private final visitorBook visitorBook = new visitorBook();
	private final visitorMain visitorMain = new visitorMain();
	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			System.out.println(i.accept(visitorMain));
	}
	
	public void printOnlyBooks() {
				for (Item i : items)
			System.out.println(i.accept(visitorBook));

	}

	public void printOnlyCDs() {
				for (Item i : items)
			System.out.println(i.accept(visitorcd));
	}

}
