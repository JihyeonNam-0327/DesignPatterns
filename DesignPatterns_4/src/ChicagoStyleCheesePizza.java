
public class ChicagoStyleCheesePizza extends Pizza {

	@SuppressWarnings("unchecked")
	public ChicagoStyleCheesePizza() {
		name = "��ī�� ��Ÿ�� �� �� ġ�� ����";
		dough = "�β��� ũ����Ʈ ����";
		sauce = "�÷� �丶�� �ҽ�";
		
		toppings.add("������ ��¥���� ġ�� ����");
	}
	
	void cut() {
		System.out.println("��ī�� ���ڴ� �׸𳺰� �߶��~");
	}
}
