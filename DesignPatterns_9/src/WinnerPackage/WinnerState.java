package WinnerPackage;

public class WinnerState implements State {
	GumballMachine gumballMachine;
 
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		System.out.println("잠시만 기다려주세요! gumball 나가요!");
	}
 
	public void ejectQuarter() {
		System.out.println("이미 gamball을 뽑으셨잖아요!");
	}
 
	public void turnCrank() {
		System.out.println("두번 돌린다고 gamball 더 안줌");
		}
 
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			System.out.println("***************딴딴딴 딴딴*****************");
			System.out.println("축하드립니다!!!! ball을 하나 더 받으실 수 있습니다!!!");
			System.out.println("***************딴따란따라******************");
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
            	System.out.println("웁스, 공이 없네요!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
 
	public void refill() { }
	
	public String toString() {
		return "당첨됐으니까 ball 두개 드릴께요!";
	}
}
