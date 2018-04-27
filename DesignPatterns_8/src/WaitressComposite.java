import java.util.Iterator;

public class WaitressComposite {

	MenuComponent allMenus;
 
	public WaitressComposite(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
	
	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		System.out.println("\n베지테리안을 위한 메뉴\n----------");
		while(iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			try {
				if(menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			}catch(UnsupportedOperationException e) {
				
			}
		}
	}
}
