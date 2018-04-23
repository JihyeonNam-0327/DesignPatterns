
public class CeilingFan {
	String name;
	
	public CeilingFan(String name) {
		this.name = name;
	}
	
	void on() {
		System.out.println( name + "에 있는 선풍기를 켭니다");
	}
	void off() {
		System.out.println( name + "에 있는 선풍기를 끕니다");
	}

}
