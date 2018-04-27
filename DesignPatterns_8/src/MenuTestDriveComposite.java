
public class MenuTestDriveComposite {
	
	public static void main(String args[]) {
		MenuComponent pancakeHouseMenu = new MenuComposite("PANCAKE HOUSE MENU", "��ħ �޴�");
		MenuComponent dinerMenu = new MenuComposite("DINER MENU", "���� �޴�");
		MenuComponent cafeMenu = new MenuComposite("CAFE MENU", "���� �޴�");
		MenuComponent dessertMenu = new MenuComposite("DESSERT MENU", "����Ʈ�� ��ܺ�����!");
		MenuComponent coffeeMenu = new MenuComposite("COFFEE MENU", "Stuff to go with your afternoon coffee");
		//�ֻ��� �޴��� ����� �ݴϴ�.
		MenuComponent allMenus = new MenuComposite("ALL MENUS", "��� �޴����� ���յǾ� �־��. ��ü �޴���.");
  
		//�ֻ��� �޴��� �̷��� �߰��� ���ݴϴ�. ��ü����
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
  
		pancakeHouseMenu.add(new MenuItemsComposite("K&B's ������ũ ��Ʈ", "��ũ������, ����ġ �佺Ʈ�� ��鿩�� ������ũ", true, 2.99));
		pancakeHouseMenu.add(new MenuItemsComposite("Regular Pancake Breakfast", "����Ķ��̿� �Ҽ����� ��鿩�� ������ũ", false,	2.99));
		pancakeHouseMenu.add(new MenuItemsComposite("Blueberry Pancakes", "�ż��� ��纣��, ��纣�� �÷��� ��鿩�� ������ũ", true,	3.49));
		pancakeHouseMenu.add(new MenuItemsComposite("Waffles", "����, ���⿡ ���� ��纣���� ���⸦ ���� �� �ֽ��ϴ�.", true, 3.59));

		dinerMenu.add(new MenuItemsComposite("Vegetarian BLT", "��� ���� �Ĺ��� ������, ����, ����̷θ� ���� �޴�", true, 2.99));
		dinerMenu.add(new MenuItemsComposite("BLT","��л��� ������, ����, �丶�� ���� �޴�", false, 2.99));
		dinerMenu.add(new MenuItemsComposite("������ ����","�丶�� ������ ���̵� �𽬿� �Բ� ���� ������ �ֹ��� ����", false, 3.29));
		dinerMenu.add(new MenuItemsComposite("Hotdog","���ũ���Ʈ, ����, ġ� �ö� �ֵ���",false, 3.05));
		dinerMenu.add(new MenuItemsComposite("�����ä�� ������̽�","������̽� ���� ���� ��ä", true, 3.99));
		dinerMenu.add(new MenuItemsComposite("Pasta","�������� �ҽ� ���İ�Ƽ�� ȿ��",true, 3.89));
   
		//�̷��� ��ü�� ��ü�� �߰��� ���ݴϴ�. �׷��� dinerMenu�� ���հ�ü�� �ǰ���?
		dinerMenu.add(dessertMenu);
		//�߰���Ų �� ���� ����մϴ�.
  
		dessertMenu.add(new MenuItemsComposite("Apple Pie","�ٴҶ� ���̽�ũ�� ���� �ٻ�ٻ��� ��������",true,1.59));
		dessertMenu.add(new MenuItemsComposite("Cheesecake","��ġ��....",true,1.99));
		dessertMenu.add(new MenuItemsComposite("Sorbet(�Ҹ���)","����� �� ����, ���� �� ����",true,1.89));

		cafeMenu.add(new MenuItemsComposite("Veggie Burger and Air Fries","��л�, ����, �丶��, ����Ƣ���� �Բ��ϴ� ��������",true, 3.99));
		cafeMenu.add(new MenuItemsComposite("������ ����","������ ���̵� �𽬶� ������ ����",false, 3.69));
		cafeMenu.add(new MenuItemsComposite("�θ���","ƾ����, ���, ��ī���� ��鿩�� Ǫ���� �θ���",true, 4.29));

		//���������� ��ü�� ��ü�� ���� �� �߰��մϴ�. �׷��� cafeMenu�� ���հ�ü�� �ǰ���?
		cafeMenu.add(coffeeMenu);

		coffeeMenu.add(new MenuItemsComposite("Ŀ�� ����ũ...Ƽ��̽������ǰ�?","�ó���, ȣ�� ���ε� Ŀ�� ����ũ",true,1.59));
		coffeeMenu.add(new MenuItemsComposite("����","����, ��ͺ� ����(?), �ó��� ������, ȣ���� ǳ�̸� ���� �� ����",false,0.69));
		coffeeMenu.add(new MenuItemsComposite("Biscotti(���ڶ�)","�Ƹ��� ������� biscotti ��Ű 3��",true,0.89));
 
		WaitressComposite waitress = new WaitressComposite(allMenus);
   
		waitress.printMenu();
		
		System.out.println("------����~-------");
		
		waitress.printVegetarianMenu();
	}
}
