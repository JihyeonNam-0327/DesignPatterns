
public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("에단이 주문한 피자는~ " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("조엘이 주문한 피자는~ " + pizza + "\n");
		// 다른 종류의 피자는 생략~
	}
}
