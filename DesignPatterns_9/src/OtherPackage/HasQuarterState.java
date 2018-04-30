package OtherPackage;

//import java.util.Random;

public class HasQuarterState implements State {
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
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("gumball ��������");
    }
    
    public void refill() { }
 
	public String toString() {
		return "������ �����⸦ ��ٸ��� �־��";
	}
}
