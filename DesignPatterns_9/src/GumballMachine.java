
public class GumballMachine {

	final static int SOLD_OUT = 1;		// ball ����
	final static int NO_QUARTER = 2;	// ���� ����
	final static int HAS_QUARTER = 3;	// ���� ����
	final static int SOLD = 4;			// ball �Ǹ�
	
	int state = SOLD_OUT;				// ���� ���¸� �����ϴ� �ν��Ͻ� ����
										// �̱� ��踦 ��ġ�ϴ� �� ó�� �������� ball�� �����Ƿ� SOLD_OUT ����
	int count = 0;						// �ʱ� ball ����
	
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;			// �����ڿ��� �ʱ� ball ������ ���ڷ� �޾Ƽ� ���� �ֱ⸦ ��ٸ��� ���·� ��ȯ��ŵ�ϴ�.
		}
	}
	
	//���� ����
	public void insertQuarter() {
		if(state == HAS_QUARTER) {
			System.out.println("������ �� ���� �־� �ּ���.");
		} else if(state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("������ �־����ϴ�.");
		} else if(state == SOLD_OUT) {
			System.out.println("�����Ǿ����ϴ�. ���� ��ȸ�� �̿��� �ּ���");
			// ���� ���¿����� ������ �ٽ� ��ȯ�մϴ�.
		} else if(state == SOLD) {
			// ��� �����̸� ������ ���� ball�� �Ǹ����� ���¶�� �� ��ٷ��޶�� �޼����� ����մϴ�.
			System.out.println("��� ��ٷ� �ּ���. ball�� ������ ���ݾƿ�.");
		}
	}
	
	//���� ��ȯ�ϱ�
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("������ ��ȯ�˴ϴ�.");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("������ �־� �ּ���.");
		} else if (state == SOLD) {
			System.out.println("�̹� ball�� �����̳׿�.");
		} else if (state == SOLD_OUT) {
	    	System.out.println("������ ���� �ʾ��ݾƿ�. ������ ��ȯ���� �ʽ��ϴ�.");
		}
	}

	//������ ������
	public void turnCrank() {
		if (state == SOLD) {
			System.out.println("�ι� �����ٰ� �ؼ� �� �ٸ� gumball�� ������ �� �ƴ϶��ϴ�.");
		} else if (state == NO_QUARTER) {
			System.out.println("������ �־��ּ���. ������ ���µ� �����̸� �����̳׿�.");
		} else if (state == SOLD_OUT) {
			System.out.println("�����̴� ���������� gumballs�� �ƿ� �����. sold_out ���¿���.");
		} else if (state == HAS_QUARTER) {
			System.out.println("�����̸� �����̽��ϴ�.");
			state = SOLD;
			dispense();
		}
	}

	// gumball ������
	private void dispense() {
		if (state == SOLD) {
			System.out.println("Ball ������ �־��~");
			count = count - 1;
			if (count == 0) {
				System.out.println("Oops, gumballs �� ���������!");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("�������� �ְ� ����������?");
		} else if (state == SOLD_OUT) {
			System.out.println("�����Դϴ�. �����̿���.");
		} else if (state == HAS_QUARTER) {
			System.out.println("������ �ִµ� �ȵ��ȳ�. ���� ��������.");
		}
	}

	// gumballs ���ڸ� �Ű������� �޾Ƽ� �ٽ� �����մϴ�.
	public void refill(int numGumBalls) {
		this.count = numGumBalls;
		state = NO_QUARTER;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n����, Inc.");
		result.append("\nGumball ��迡 �ڹٸ� ���ʷ� �����ϴ�.\n");
		result.append("Gumball ��� : " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n��� ����: ");
		if (state == SOLD_OUT) {
			result.append("Gumball ����");
		} else if (state == NO_QUARTER) {
			result.append("������ ��ٸ��� ��..");
		} else if (state == HAS_QUARTER) {
			result.append("�����̸� �����ֱ⸦ ��ٸ��� ��..");
		} else if (state == SOLD) {
			result.append("Gumball�� �������� ��..");
		}
		result.append("\n");
		return result.toString();
	}
}





