package OtherPackage;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("동전을 넣으셨습니다.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense() { // gumball 내보내기
		System.out.println("동전을 먼저 넣으세요!");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "동전을 넣어주시길 기다리고 있습니다...!";
	}
}
