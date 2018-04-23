
public class Screen {
	String description;

	public Screen(String description) {
		this.description = description;
	}

	public void up() {
		System.out.println(description + " 올라감요");
	}

	public void down() {
		System.out.println(description + " 내려감요");
	}


	public String toString() {
		return description;
	}
}
