package WinnerPackage;

public class WinnerState implements State {
	GumballMachine gumballMachine;
 
    public WinnerState(GumballMachine gumballMachine) {
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
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			System.out.println("***************������ ����*****************");
			System.out.println("���ϵ帳�ϴ�!!!! ball�� �ϳ� �� ������ �� �ֽ��ϴ�!!!");
			System.out.println("***************����������******************");
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
            	System.out.println("��, ���� ���׿�!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
 
	public void refill() { }
	
	public String toString() {
		return "��÷�����ϱ� ball �ΰ� �帱����!";
	}
}
