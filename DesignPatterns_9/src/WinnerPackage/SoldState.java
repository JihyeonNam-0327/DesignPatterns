package WinnerPackage;

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
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
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("웁스, gumball이 없어요!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
	
	public void refill() { }
 
	public String toString() {
		return "공들을 준비하고 있어요";
	}
}


