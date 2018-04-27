
public class MenuTestDriveComposite {
	
	public static void main(String args[]) {
		MenuComponent pancakeHouseMenu = new MenuComposite("PANCAKE HOUSE MENU", "아침 메뉴");
		MenuComponent dinerMenu = new MenuComposite("DINER MENU", "점심 메뉴");
		MenuComponent cafeMenu = new MenuComposite("CAFE MENU", "저녁 메뉴");
		MenuComponent dessertMenu = new MenuComposite("DESSERT MENU", "디저트를 즐겨보세요!");
		MenuComponent coffeeMenu = new MenuComposite("COFFEE MENU", "Stuff to go with your afternoon coffee");
		//최상위 메뉴를 만들어 줍니다.
		MenuComponent allMenus = new MenuComposite("ALL MENUS", "모든 메뉴들이 결합되어 있어요. 전체 메뉴죠.");
  
		//최상위 메뉴에 이렇게 추가를 해줍니다. 객체들을
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
  
		pancakeHouseMenu.add(new MenuItemsComposite("K&B's 팬케이크 셋트", "스크램블에그, 프렌치 토스트가 곁들여진 팬케이크", true, 2.99));
		pancakeHouseMenu.add(new MenuItemsComposite("Regular Pancake Breakfast", "계란후라이와 소세지가 곁들여진 팬케이크", false,	2.99));
		pancakeHouseMenu.add(new MenuItemsComposite("Blueberry Pancakes", "신선한 블루베리, 블루베리 시럽이 곁들여진 팬케이크", true,	3.49));
		pancakeHouseMenu.add(new MenuItemsComposite("Waffles", "와플, 취향에 따라 블루베리나 딸기를 얹을 수 있습니다.", true, 3.59));

		dinerMenu.add(new MenuItemsComposite("Vegetarian BLT", "통밀 위에 식물성 베이컨, 상추, 토매이로를 얹은 메뉴", true, 2.99));
		dinerMenu.add(new MenuItemsComposite("BLT","통밀빵에 베이컨, 상추, 토마토 얹은 메뉴", false, 2.99));
		dinerMenu.add(new MenuItemsComposite("오늘의 스프","토마토 샐러드 사이드 디쉬와 함께 즐기는 오늘의 주방장 스프", false, 3.29));
		dinerMenu.add(new MenuItemsComposite("Hotdog","사워크라우트, 양파, 치즈가 올라간 핫도그",false, 3.05));
		dinerMenu.add(new MenuItemsComposite("구운야채와 브라운라이스","브라운라이스 위에 구운 야채", true, 3.99));
		dinerMenu.add(new MenuItemsComposite("Pasta","마리나라 소스 스파게티와 효모빵",true, 3.89));
   
		//이렇게 객체에 객체를 추가를 해줍니다. 그러면 dinerMenu도 복합객체가 되겠죠?
		dinerMenu.add(dessertMenu);
		//추가시킨 애 먼저 출력합니다.
  
		dessertMenu.add(new MenuItemsComposite("Apple Pie","바닐라 아이슈크림 얹은 바삭바삭한 애플파이",true,1.59));
		dessertMenu.add(new MenuItemsComposite("Cheesecake","뉴치케....",true,1.99));
		dessertMenu.add(new MenuItemsComposite("Sorbet(소르베)","라즈베리 한 스쿱, 라임 한 스쿱",true,1.89));

		cafeMenu.add(new MenuItemsComposite("Veggie Burger and Air Fries","통밀빵, 상추, 토마토, 감자튀김이 함께하는 베지버거",true, 3.99));
		cafeMenu.add(new MenuItemsComposite("오늘의 스프","샐러드 사이드 디쉬랑 오늘의 스프",false, 3.69));
		cafeMenu.add(new MenuItemsComposite("부리또","틴토콩, 살사, 과카몰이 곁들여진 푸짐한 부리또",true, 4.29));

		//마찬가지로 객체에 객체를 새로 또 추가합니다. 그러면 cafeMenu도 복합객체가 되겠죠?
		cafeMenu.add(coffeeMenu);

		coffeeMenu.add(new MenuItemsComposite("커피 케이크...티라미슈같은건가?","시나몬, 호두 토핑된 커피 케이크",true,1.59));
		coffeeMenu.add(new MenuItemsComposite("바질","참깨, 양귀비 씨앗(?), 시나몬 건포도, 호박의 풍미를 느낄 수 있음",false,0.69));
		coffeeMenu.add(new MenuItemsComposite("Biscotti(비스코띠)","아몬드와 헤이즐넛 biscotti 쿠키 3개",true,0.89));
 
		WaitressComposite waitress = new WaitressComposite(allMenus);
   
		waitress.printMenu();
		
		System.out.println("------구분~-------");
		
		waitress.printVegetarianMenu();
	}
}
