package WinnerPackage;

import java.util.Random;

public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis()); // 10%�� Ȯ���� ��÷���θ� �����ϴ� ���� �߻��� �߰�
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("�̹� ������ �־ �� ������ ���� �� �����ϴ�.");
	}
 
	public void ejectQuarter() {
		System.out.println("������ ��ȯ�ؿ�");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("�����̸� �����̱���...");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

    public void dispense() {
        System.out.println("gumball ��������");
    }
    
    public void refill() { }
 
	public String toString() {
		return "������ �����⸦ ��ٸ��� �־��";
	}
}
