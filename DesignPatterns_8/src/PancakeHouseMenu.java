
import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;
 
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
    
		addItem("K&B's 팬케이크 셋트 메뉴", 
			"스크램블 에그, 프렌치토스트, 팬케이크", true, 2.99);
 
		addItem("레귤러 팬케이크 셋트 메뉴", 
			"계란후라이, 소시지, 팬케이크", false, 2.99);
 
		addItem("블루베리 팬케이크",
			"신선한 블루베리를 얹은 팬케이크", true,	3.49);
 
		addItem("와플",
			"블루베리, 딸기 중 택 1 와플", true, 3.59);
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
		//이터레이터를 리턴합니다.
		return new PancakeHouseMenuIterator(menuItems);
	}
  
	public String toString() {
		return "객체 마을의 팬케이크 하우스 메뉴~~";
	}

	// other menu methods here
}
