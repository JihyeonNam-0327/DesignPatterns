package WinnerPackage;

import java.util.Random;

public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis()); // 10%의 확률로 당첨여부를 결정하는 난수 발생기 추가
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
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

    public void dispense() {
        System.out.println("gumball 못나가요");
    }
    
    public void refill() { }
 
	public String toString() {
		return "손잡이 돌리기를 기다리고 있어요";
	}
}
