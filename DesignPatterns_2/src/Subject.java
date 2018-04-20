
public interface Subject {
	//�Ʒ� �� �޼ҵ忡�� ��� Observer�� ���ڸ� �޽��ϴ�. ���� �������� ����ϰ� �����ϴ� ������ ����.
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	//���� ��ü�� ���°� ����Ǿ��� �� ��� ������������ �˸��� ���� ȣ��Ǵ� �޼ҵ��Դϴ�.
	public void notifyObservers();
}
