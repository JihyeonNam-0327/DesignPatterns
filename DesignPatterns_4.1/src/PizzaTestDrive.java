
public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("������ �ֹ��� ���ڴ�~ " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("������ �ֹ��� ���ڴ�~ " + pizza + "\n");
		// �ٸ� ������ ���ڴ� ����~
	}
}
