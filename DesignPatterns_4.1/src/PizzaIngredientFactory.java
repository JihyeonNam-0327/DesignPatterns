
public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSouce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
	
	//재료마다 하나씩 클래스를 만들어야 합니다.
}
