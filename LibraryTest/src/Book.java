
public class Book extends Item {
	String name;
	String genre;
	Boolean isAvailble;
	String author;

	public Book(String name, String genre, Boolean isAvailble, String author, int id) {
		super(name, isAvailble, id);
		this.name = name;
		this.genre = genre;
		this.isAvailble = isAvailble;
		this.author = author;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Boolean getisAvailble() {
		return isAvailble;
	}

	public void setisAvailble(Boolean isAvailble) {
		this.isAvailble = isAvailble;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
