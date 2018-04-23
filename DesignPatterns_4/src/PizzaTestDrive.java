
public class PizzaTestDrive {

	public static void main(String args[]) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("에단은 "+pizza.getname()+"을 주문했고 \n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("조엘은 "+pizza.getname()+"를 주문했습니다. \n");
	}
}
