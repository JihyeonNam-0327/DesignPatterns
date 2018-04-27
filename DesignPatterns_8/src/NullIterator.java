
import java.util.Iterator;
  
//널 객체 디자인 패턴을 적용한 클래스입니다.
//아무도 일하지 않는 반복자를 만든다고 생각하면 됩니다.
//세계에서 가장 게으른 반복자입니다.
//맨날 더 이상 반복작업을 처리할 객체가 없다고 튕기죠.
public class NullIterator implements Iterator<MenuComponent> {
   
	public MenuComponent next() {
		return null;
	}
  
	public boolean hasNext() {
		return false;
	}

}
