
public class DinerMenuIterator implements Iterator{
	MenuItem[] items;
	int position = 0;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			//���� �׸��� null������ Ȯ���ؾ� �մϴ�. �׷��� ���Ұ� �� �����ִ��� Ȯ���� �� �����ϱ��.
			return false;
		} else {
			//hasNext() �޼ҵ忡���� �迭�� �ִ� ��� ���Ҹ� ���Ҵ��� Ȯ���� ����
			//���� �� ���ƾ� �� ���Ұ� ������ true�� �����մϴ�.
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}

}
