
import java.util.*;

public class CafeMenu implements Menu {
	HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();
  
	public CafeMenu() {
		addItem("���� ���ſ� ����������", "��л�, ����, ����̷�, ����Ƣ���� ÷���� ���� ����", true, 3.99);
		addItem("������ ����", "�����尡 ��鿩�� ������ ����", false, 3.69);
		addItem("������", "�� ������� ���, ��ī������ ��鿩�� Ǫ���� ������", true, 4.29);
	}
 
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
 
	public Map<String, MenuItem> getItems() {
		return menuItems;
	}
  
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator(); // ���̺� ��ü�� �ݺ��ڰ� �ƴ� �ؽ����̺��� ���� �ݺ��ڸ� ������!!
	}
}
