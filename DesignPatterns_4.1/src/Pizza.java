
public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("350도 열에서 20분동안 구워요");
	}
	
	void cut() {
		System.out.println("피자를 잘라요");
	}
	
	void box() {
		System.out.println("피자를 피자 박스에 넣어요~");
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
}
