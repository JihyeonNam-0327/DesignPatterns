
public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("베지테리안 BLT",
			"통밀 위에 식물성 베이컨, 토마토, 상추를 얹은 메뉴", true, 2.99);
		addItem("BLT",
			"통밀 위에 베이컨, 토마토, 상추를 얹은 메뉴", false, 2.99);
		addItem("오늘의 스프",
			"오늘의 스프와 감자 샐러드 한 접시", false, 3.29);
		addItem("핫도그",
			"사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그",
			false, 3.05);
		addItem("구운 야채와 브라운 라이스",
			"브라운 라이스 위에 구운 야채 덮밥", true, 3.99);
		addItem("파스타",
			"마리나라 소스 스파게티와 발효 빵 한조각",
			true, 3.89);
	}

	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("죄송한데, 메뉴가 다 찼그든요?! 더 추가 못합니다잉");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	//createIterator 메소드만 추가하면 기존의 코드를 변경하지 않고도 사용할 수 있습니다.
	public Iterator createIterator() {
		//이터레이터를 리턴합니다.
		return new DinerMenuIterator(menuItems);
	}

}

