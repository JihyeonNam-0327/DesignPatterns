
public class Light {
	String name;
	
	public Light(String name) {
		this.name = name;
	}
	
	void on() {
		System.out.println( name + " 전등을 켭니다");
	}
	void off() {
		System.out.println( name +" 전등을 끕니다");
	}
}
