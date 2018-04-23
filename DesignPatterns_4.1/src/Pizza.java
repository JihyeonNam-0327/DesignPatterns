
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
		System.out.println("350�� ������ 20�е��� ������");
	}
	
	void cut() {
		System.out.println("���ڸ� �߶��");
	}
	
	void box() {
		System.out.println("���ڸ� ���� �ڽ��� �־��~");
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
