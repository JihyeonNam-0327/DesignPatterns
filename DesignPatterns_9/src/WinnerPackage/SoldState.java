package WinnerPackage;

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		System.out.println("��ø� ��ٷ��ּ���! gumball ������!");
	}
 
	public void ejectQuarter() {
		System.out.println("�̹� gamball�� �������ݾƿ�!");
	}
 
	public void turnCrank() {
		System.out.println("�ι� �����ٰ� gamball �� ����");
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("��, gumball�� �����!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
	
	public void refill() { }
 
	public String toString() {
		return "������ �غ��ϰ� �־��";
	}
}


