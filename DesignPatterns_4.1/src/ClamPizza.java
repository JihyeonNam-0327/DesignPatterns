
public class ClamPizza extends Pizza {


	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	void prepare() {
		System.out.println("준비중..." + name);
		// 팩토리가 작동하는 부분
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSouce();
		cheese = ingredientFactory.createCheese();
	}
}
