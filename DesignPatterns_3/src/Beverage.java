
public abstract class Beverage {
	String description = "�������";
	
	// �� �޼ҵ�� �̹� �����Ǿ� ������,
	public String getDescription() {
		return description;
	}
	
	// �� �޼ҵ�� Beverage�� ��ӹ޴� ����Ŭ�������� �����ؾ� �մϴ�.
	public abstract double cost();

}
