
public class ChicagoStyleCheesePizza extends Pizza {

	@SuppressWarnings("unchecked")
	public ChicagoStyleCheesePizza() {
		name = "시카고 스타일 딥 디쉬 치즈 피자";
		dough = "두꺼운 크러스트 도우";
		sauce = "플럼 토마토 소스";
		
		toppings.add("슈레드 모짜렐라 치즈 토핑");
	}
	
	void cut() {
		System.out.println("시카고 피자는 네모낳게 잘라요~");
	}
}
