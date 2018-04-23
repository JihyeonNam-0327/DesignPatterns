// 모카는 Decorator이기 때문에 CondimentDecorator를 확장합니다.
public class Mocha extends CondimentDecorator{
							// CondimentDecorator에서는 Beverage를 확장하죠?
	Beverage beverage;		// Mocha 인스턴스에는 Beverage 에 대한 레퍼런스가 들어있습니다.
	// 감싸고자 하는 음료를 저장하기 위한 인스턴스 변수와
	public Mocha(Beverage beverage) {
		this.beverage = beverage; // 인스턴스 변수를 감싸고자 하는 객체로 설정하기 위한 생성자가 필요!
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
		// 설명에 음료 이름만 들어있으면 안되므로 첨가되는 각 아이템에 대한 설명도 추가.
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
		// 원래 음로 가격에 모카를 추가한 가격을 계산해야 합니다.
		// 우선 장식하고 있는 객체에 가격을 구하는 작엄을 '위임'해서 음료 자체의 값을 구한 다음,
		// 거기에 모카 가격을 더하고, 그 합을 리턴합니다.
	}

}
