
public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
			// 샘플 데이터로 치즈 피자만 생성
		} else return null;
	}

}
