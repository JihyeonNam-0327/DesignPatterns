
import java.util.Iterator;
import java.util.ArrayList;

public class MenuComposite extends MenuComponent {
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
  
	public MenuComposite(String name, String description) {
		this.name = name;
		this.description = description;
	}
 
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
 
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
 
	public MenuComponent getChild(int i) {
		return (MenuComponent)menuComponents.get(i);
	}
 
	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}
 
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
		// print()에서는 메뉴의 모든 구성요소들이 출력되어야 합니다.
		// 각 구성요소에서 자기 자신의 정보를 출력하는 방법이 있습니다. 재귀적인 방법으로 줄줄이 정보를 출력할 수 있죠.
		// 어떻게 하는지 한번 볼까요?
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = 
				(MenuComponent)iterator.next();
			menuComponent.print();
		}
	}
	
	public Iterator createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}
}
