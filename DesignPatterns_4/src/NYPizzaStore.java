
public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
			// ���� �����ͷ� ġ�� ���ڸ� ����
		} else return null;
	}

}
