
public class Map extends Item {

	private String name;
	private boolean isAvailable;
	private String location;
	private int id;

	public Map(String name, boolean isAvailable, int id, String location) {
		super(name, isAvailable, id);
		this.isAvailable = isAvailable;
		this.location = location;
	}
ssss
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailble(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
