package OtherPackage;

public class GumballMachine {

	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;

	State state;
	int count = 0;

	public GumballMachine(int numberGumballs) {
		
		// 각 State 생성자에 들어가는 매개변수는 GumballMachine 입니다. 현재 클래스이죠. 따라서 this를 씁니다.
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
 			// 0보다 많은 ball이 있다면 상태는 noQuarterState
			state = noQuarterState;
		} else {
			// 0이거나 그보다 적다면 당연히 솔드아웃 상태이겠죠
			state = soldOutState;
		}
	}
 
	public void insertQuarter() {
		// 모든 상태는 state를 implements하고 있으니까
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
 
	void releaseBall() {
		System.out.println("gumball이 나오고 있어요...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("머신이 채워졌어요; 방금 채워진 재고 숫자는: " + this.count);
		state.refill();
	}

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n시토, Inc.");
		result.append("\nGumball 기계에 자바를 최초로 도입하다.\n");
		result.append("Gumball 재고 : " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("머신은... " + state + "\n");
		return result.toString();
	}
}
