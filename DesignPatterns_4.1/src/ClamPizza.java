
public class ClamPizza extends Pizza {


	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
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
