package WinnerPackage;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("������ �����̽��ϴ�.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		System.out.println("������ �ȳ־��ݾƿ�");
	}
 
	public void turnCrank() {
		System.out.println("�����̴� ���ȴµ� ������ �ȳ־��׿�?��");
	 }
 
	public void dispense() { // gumball ��������
		System.out.println("������ ���� ��������!");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "������ �־��ֽñ� ��ٸ��� �ֽ��ϴ�...!";
	}
}
