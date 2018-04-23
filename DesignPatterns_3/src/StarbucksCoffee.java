
public class StarbucksCoffee {

	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()
				+ " $" + beverage.cost());
		// 아무것도 넣지 않은 에스프레소를 주문하고 그 음료에 대한 설명, 가격을 출력합니다.
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);	//모카로 감쌉니다.....!!
		beverage2 = new Soy(beverage2);		//두유로 감싸요
		beverage2 = new Whip(beverage2);	//휘핑크림으로 감싸요
		System.out.println(beverage2.getDescription()
				+ " $" + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Mocha(beverage3);	
		beverage3 = new Mocha(beverage3);	
		beverage3 = new Mocha(beverage3);	
		System.out.println(beverage3.getDescription()
				+ " $" + beverage3.cost());
	}
}
