
public class Espresso extends Beverage{

	public Espresso() {
		description = "����������"; // Ŭ���� �����ڿ��� description ���� �����մϴ�.
		// �� description�� �� �ν��Ͻ� ������� ����... �F������!!!!
	}
	
	@Override
	public double cost() {
		// ���������� ���������� ������ ����ؾ� �մϴ�. �� Ŭ���������� ÷���� ������ ���ϴ� �� ������ �ʿ䰡 �����ϴ�.
		// �׳� ���������� ������ $1.99�� �����ϱ⸸ �ϸ� ����.
		return 1.99;
	}

}
