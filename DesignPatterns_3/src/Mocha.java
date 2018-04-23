// ��ī�� Decorator�̱� ������ CondimentDecorator�� Ȯ���մϴ�.
public class Mocha extends CondimentDecorator{
							// CondimentDecorator������ Beverage�� Ȯ������?
	Beverage beverage;		// Mocha �ν��Ͻ����� Beverage �� ���� ���۷����� ����ֽ��ϴ�.
	// ���ΰ��� �ϴ� ���Ḧ �����ϱ� ���� �ν��Ͻ� ������
	public Mocha(Beverage beverage) {
		this.beverage = beverage; // �ν��Ͻ� ������ ���ΰ��� �ϴ� ��ü�� �����ϱ� ���� �����ڰ� �ʿ�!
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", ��ī";
		// ���� ���� �̸��� ��������� �ȵǹǷ� ÷���Ǵ� �� �����ۿ� ���� ���� �߰�.
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
		// ���� ���� ���ݿ� ��ī�� �߰��� ������ ����ؾ� �մϴ�.
		// �켱 ����ϰ� �ִ� ��ü�� ������ ���ϴ� �۾��� '����'�ؼ� ���� ��ü�� ���� ���� ����,
		// �ű⿡ ��ī ������ ���ϰ�, �� ���� �����մϴ�.
	}

}
