import java.util.ArrayList;

public class Storage {

	ArrayList<Item> Items;

	public Storage() {

		Item book1 = new Book("Think and Grow Rich", "Personal Development", true, "Napoleon Hil", 1);
		Item book2 = new Book("Rich Dad Poor Dad", "Motivation", true, "Robert Kiyosakl", 2);
		Item book3 = new Book("YUSA Guide to Balance, Mind, Body, and Spirit", "Self-Help", true, "YusaLife", 3);

		Item magazine1 = new Magazine("Vanity Fair", true, 4, "Radhika Jones", "culture & fashion");
		Item magazine2 = new Magazine("Men's Fitness", true, 5, "Michael Pare", "Men's Health");
		Item magazine3 = new Magazine("F1 Racing", true, 6, "Anthony Rowlinson", "motor sports");

		Item map1 = new Map("London Map", true, 7, "google maps");
		Item map2 = new Map("Coventry Map", true, 8, "google maps");
		Item map3 = new Map("Manchester Map", true, 9, "google maps");

		Items = new ArrayList<Item>();

		Items.add(book1);
		Items.add(book2);
		Items.add(book3);

		Items.add(magazine1);
		Items.add(magazine2);
		Items.add(magazine3);

		Items.add(map1);
		Items.add(map2);
		Items.add(map3);

	}

	public void addBook(String name, String genre, boolean isAvailble, String author, int id) {

		Item item = new Book(name, genre, isAvailble, author, id);
		Items.add(item);

	}
	
	public void removeBook (String name, String genre, boolean isAvailble, String author, int id)
	{
		// 
	}
}
