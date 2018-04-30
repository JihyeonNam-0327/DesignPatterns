package OtherPackage;

public class GumballMachine {

	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;

	State state;
	int count = 0;

	public GumballMachine(int numberGumballs) {
		
		// �� State �����ڿ� ���� �Ű������� GumballMachine �Դϴ�. ���� Ŭ��������. ���� this�� ���ϴ�.
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
 			// 0���� ���� ball�� �ִٸ� ���´� noQuarterState
			state = noQuarterState;
		} else {
			// 0�̰ų� �׺��� ���ٸ� �翬�� �ֵ�ƿ� �����̰���
			state = soldOutState;
		}
	}
 
	public void insertQuarter() {
		// ��� ���´� state�� implements�ϰ� �����ϱ�
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
 
	void releaseBall() {
		System.out.println("gumball�� ������ �־��...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("�ӽ��� ä�������; ��� ä���� ��� ���ڴ�: " + this.count);
		state.refill();
	}

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n����, Inc.");
		result.append("\nGumball ��迡 �ڹٸ� ���ʷ� �����ϴ�.\n");
		result.append("Gumball ��� : " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("�ӽ���... " + state + "\n");
		return result.toString();
	}
}
