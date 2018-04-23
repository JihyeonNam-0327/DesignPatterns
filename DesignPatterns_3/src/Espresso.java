
public class Espresso extends Beverage{

	public Espresso() {
		description = "에스프레소"; // 클래스 생성자에서 description 값을 설정합니다.
		// 이 description을 왜 인스턴스 변수라고 하지... 쒯더번역!!!!
	}
	
	@Override
	public double cost() {
		// 마지막으로 에스프레소 가격을 계산해야 합니다. 이 클래스에서는 첨가물 가격을 더하는 건 걱정할 필요가 없습니다.
		// 그냥 에스프레소 가격인 $1.99를 리턴하기만 하면 되죠.
		return 1.99;
	}

}
