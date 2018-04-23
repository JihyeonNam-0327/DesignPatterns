import java.util.ArrayList;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	void prepare() {
		System.out.println("준비중.." + name);
		System.out.println("Tossing 도우");
		System.out.println("소스 첨가중...");
		System.out.println("토핑 추가중...");
		for(int i = 0; i<toppings.size(); i++) {
			System.out.println("     " + toppings.get(i));
		}
	}
	
	void bake() {
		System.out.println("25분에서 30분정도 구워요");
	}
	
	void cut() {
		System.out.println("피자를 잘라요~");
	}
	
	void box() {
		System.out.println("피자를 상자에 담아요~");
	}
	
	public String getname() {
		return name;
	}
}
