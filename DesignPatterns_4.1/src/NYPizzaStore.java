
public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
				new NYPizzaIngredientFactory();
		
		if(item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("뉴욕스타일 치이즈 피자");
		}
		
		return pizza;
	}

}
