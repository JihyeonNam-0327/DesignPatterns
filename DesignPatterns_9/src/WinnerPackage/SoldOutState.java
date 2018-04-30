package WinnerPackage;

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("솔드아웃이라 동전을 넣을 수 없습니다");
	}
 
	public void ejectQuarter() {
		System.out.println("동전도 안넣었으니.. 반환도 안되죠..");
	}
 
	public void turnCrank() {
		System.out.println("돌렸지만 솔드아웃이에요");
	}
 
	public void dispense() {
		System.out.println("gumball이 없어요");
	}
	
	public void refill() { 
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public String toString() {
		return "솔드아웃";
	}
}
