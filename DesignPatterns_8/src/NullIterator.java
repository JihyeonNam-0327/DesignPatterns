
import java.util.Iterator;
  
//�� ��ü ������ ������ ������ Ŭ�����Դϴ�.
//�ƹ��� ������ �ʴ� �ݺ��ڸ� ����ٰ� �����ϸ� �˴ϴ�.
//���迡�� ���� ������ �ݺ����Դϴ�.
//�ǳ� �� �̻� �ݺ��۾��� ó���� ��ü�� ���ٰ� ƨ����.
public class NullIterator implements Iterator<MenuComponent> {
   
	public MenuComponent next() {
		return null;
	}
  
	public boolean hasNext() {
		return false;
	}

}
