package WinnerPackage;

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
		System.out.println("동전을 안넣었잖아요");
	}
 
	public void turnCrank() {
		System.out.println("손잡이는 돌렸는데 동전은 안넣었네요?ㅋ");
	 }
 
	public void dispense() { // gumball 내보내기
		System.out.println("동전을 먼저 넣으세요!");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "동전을 넣어주시길 기다리고 있습니다...!";
	}
}
