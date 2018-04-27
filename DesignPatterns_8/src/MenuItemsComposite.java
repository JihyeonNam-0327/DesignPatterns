import java.util.Iterator;

public class MenuItemsComposite extends MenuComponent {
	String name;
	String description;
	boolean vegetarian;
	double price;
    
	public MenuItemsComposite(String name, String description, boolean vegetarian, double price) { 
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public boolean isVegetarian() {
		return vegetarian;
	}
  
	//print 메소드를 오버라이드 합니다. 메뉴에 수록해야 할 내용들이 나타나게 됩티다.
	public void print() {
		System.out.print("  " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("     -- " + getDescription());
	}
	
	public Iterator createIterator() {
		return new NullIterator();
	}
}
