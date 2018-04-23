
public class CheesePizza extends Pizza{

	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	void prepare() {
		System.out.println("�غ���..." + name);
		// ���丮�� �۵��ϴ� �κ�
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSouce();
		cheese = ingredientFactory.createCheese();
	}
}
