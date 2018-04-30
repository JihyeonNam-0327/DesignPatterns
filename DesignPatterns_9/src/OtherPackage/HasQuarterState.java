package OtherPackage;

//import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("이미 동전이 있어서 또 동전을 넣을 수 없습니다.");
	}
 
	public void ejectQuarter() {
		System.out.println("동전을 반환해요");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("손잡이를 돌리셨군요...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("gumball 못나가요");
    }
    
    public void refill() { }
 
	public String toString() {
		return "손잡이 돌리기를 기다리고 있어요";
	}
}
