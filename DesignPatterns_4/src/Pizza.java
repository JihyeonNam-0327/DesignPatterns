import java.util.ArrayList;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	void prepare() {
		System.out.println("�غ���.." + name);
		System.out.println("Tossing ����");
		System.out.println("�ҽ� ÷����...");
		System.out.println("���� �߰���...");
		for(int i = 0; i<toppings.size(); i++) {
			System.out.println("     " + toppings.get(i));
		}
	}
	
	void bake() {
		System.out.println("25�п��� 30������ ������");
	}
	
	void cut() {
		System.out.println("���ڸ� �߶��~");
	}
	
	void box() {
		System.out.println("���ڸ� ���ڿ� ��ƿ�~");
	}
	
	public String getname() {
		return name;
	}
}
