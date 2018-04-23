// �켱 ������ų ������ �������̽��� �����ؾ� �մϴ�. Ŭ���̾�Ʈ���� ���ϴ� �������̽��� �����ؾߵ�����.
public class TurkeyAdapter implements Duck{
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		// ���� ������ ��ü�� ���� ���۷����� �ʿ�! �����ڿ��� ���۷��� �޾ƿ��� �۾�
		this.turkey = turkey;
	}
	@Override
	public void quack() {
		turkey.gobble(); //�׳� gobble() �޼ҵ带 ȣ��
	}

	@Override
	public void fly() {
		for(int i = 0; i<5; i++) {
			turkey.fly();	// ĥ������ ���� �����ϱ� ������ ���� �ؼ� ������ ������Ŵ....(;)
		}
	}

}
