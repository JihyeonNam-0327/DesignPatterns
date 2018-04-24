
public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("�����׸��� BLT",
			"��� ���� �Ĺ��� ������, �丶��, ���߸� ���� �޴�", true, 2.99);
		addItem("BLT",
			"��� ���� ������, �丶��, ���߸� ���� �޴�", false, 2.99);
		addItem("������ ����",
			"������ ������ ���� ������ �� ����", false, 3.29);
		addItem("�ֵ���",
			"���ũ���Ʈ, ���� ���, ����, ġ� ��鿩�� �ֵ���",
			false, 3.05);
		addItem("���� ��ä�� ���� ���̽�",
			"���� ���̽� ���� ���� ��ä ����", true, 3.99);
		addItem("�Ľ�Ÿ",
			"�������� �ҽ� ���İ�Ƽ�� ��ȿ �� ������",
			true, 3.89);
	}

	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("�˼��ѵ�, �޴��� �� á�׵��?! �� �߰� ���մϴ���");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	//createIterator �޼ҵ常 �߰��ϸ� ������ �ڵ带 �������� �ʰ� ����� �� �ֽ��ϴ�.
	public Iterator createIterator() {
		//���ͷ����͸� �����մϴ�.
		return new DinerMenuIterator(menuItems);
	}

}

