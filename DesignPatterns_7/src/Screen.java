
public class Screen {
	String description;

	public Screen(String description) {
		this.description = description;
	}

	public void up() {
		System.out.println(description + " �ö󰨿�");
	}

	public void down() {
		System.out.println(description + " ��������");
	}


	public String toString() {
		return description;
	}
}
