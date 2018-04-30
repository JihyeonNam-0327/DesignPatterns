package WinnerPackage;

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("�ֵ�ƿ��̶� ������ ���� �� �����ϴ�");
	}
 
	public void ejectQuarter() {
		System.out.println("������ �ȳ־�����.. ��ȯ�� �ȵ���..");
	}
 
	public void turnCrank() {
		System.out.println("�������� �ֵ�ƿ��̿���");
	}
 
	public void dispense() {
		System.out.println("gumball�� �����");
	}
	
	public void refill() { 
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public String toString() {
		return "�ֵ�ƿ�";
	}
}
