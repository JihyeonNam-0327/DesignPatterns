
public class StarbucksCoffee {

	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()
				+ " $" + beverage.cost());
		// �ƹ��͵� ���� ���� ���������Ҹ� �ֹ��ϰ� �� ���ῡ ���� ����, ������ ����մϴ�.
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);	//��ī�� ���Դϴ�.....!!
		beverage2 = new Soy(beverage2);		//������ ���ο�
		beverage2 = new Whip(beverage2);	//����ũ������ ���ο�
		System.out.println(beverage2.getDescription()
				+ " $" + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Mocha(beverage3);	
		beverage3 = new Mocha(beverage3);	
		beverage3 = new Mocha(beverage3);	
		System.out.println(beverage3.getDescription()
				+ " $" + beverage3.cost());
	}
}
