import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator<Object>{

	Enumeration<?> enum1;
	
	public EnumerationIterator(Enumeration<?> enum1) {
		this.enum1 = enum1;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enum1.hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return enum1.nextElement();
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
