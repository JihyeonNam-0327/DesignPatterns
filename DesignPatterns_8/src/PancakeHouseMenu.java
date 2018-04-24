
import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;
 
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
    
		addItem("K&B's ������ũ ��Ʈ �޴�", 
			"��ũ���� ����, ����ġ�佺Ʈ, ������ũ", true, 2.99);
 
		addItem("���ַ� ������ũ ��Ʈ �޴�", 
			"����Ķ���, �ҽ���, ������ũ", false, 2.99);
 
		addItem("��纣�� ������ũ",
			"�ż��� ��纣���� ���� ������ũ", true,	3.49);
 
		addItem("����",
			"��纣��, ���� �� �� 1 ����", true, 3.59);
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		//���ͷ����͸� �����մϴ�.
		return new PancakeHouseMenuIterator(menuItems);
	}
  
	public String toString() {
		return "��ü ������ ������ũ �Ͽ콺 �޴�~~";
	}

	// other menu methods here
}
