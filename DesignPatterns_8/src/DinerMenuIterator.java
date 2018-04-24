
public class DinerMenuIterator implements Iterator{
	MenuItem[] items;
	int position = 0;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			//다음 항목이 null인지도 확인해야 합니다. 그래야 원소가 더 남아있는지 확인할 수 있으니까요.
			return false;
		} else {
			//hasNext() 메소드에서는 배열에 있는 모든 원소를 돌았는지 확인한 다음
			//아직 더 돌아야 할 원소가 있으면 true를 리턴합니다.
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
