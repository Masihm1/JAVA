
public class Magazine extends Item {

	String name;
	boolean isAvailble;
	String editor;
	String genre;
	int id;

	public Magazine(String name, boolean isAvailble, int id, String editor, String genre) {
		super(name, isAvailble, id);
		this.editor = editor;
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAvailble() {
		return isAvailble;
	}

	public void setAvailble(boolean isAvailble) {
		this.isAvailble = isAvailble;
	}

	public String geteditor() {
		return editor;
	}

	public void seteditor(String editor) {
		this.editor = editor;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
