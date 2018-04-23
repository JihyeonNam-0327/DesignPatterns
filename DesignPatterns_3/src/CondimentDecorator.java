
public abstract class CondimentDecorator extends Beverage{
	// 모든 데코레이터에서 getDescription 메소드를 구현하게 해놓았는데...
	// 이유는 아직 잘 모르겠다.
	public abstract String getDescription();
	// abstract class 니까 cost()를 구현하지 않은것인가? oo
	// 그런데 왜 getDescription()을 또 추상메소드로 만든걸까? 데코레이터 서브클래스에서 다시 구현하라고!

}
