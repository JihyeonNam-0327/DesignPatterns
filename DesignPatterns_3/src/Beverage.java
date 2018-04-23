
public abstract class Beverage {
	String description = "제목없음";
	
	// 이 메소드는 이미 구현되어 있지만,
	public String getDescription() {
		return description;
	}
	
	// 이 메소드는 Beverage를 상속받는 서브클래스에서 구현해야 합니다.
	public abstract double cost();

}
