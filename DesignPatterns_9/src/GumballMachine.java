
public class GumballMachine {

	final static int SOLD_OUT = 1;		// ball 매진
	final static int NO_QUARTER = 2;	// 동전 없음
	final static int HAS_QUARTER = 3;	// 동전 있음
	final static int SOLD = 4;			// ball 판매
	
	int state = SOLD_OUT;				// 현재 상태를 저장하는 인스턴스 변수
										// 뽑기 기계를 설치하는 맨 처음 시점에는 ball이 없으므로 SOLD_OUT 상태
	int count = 0;						// 초기 ball 개수
	
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;			// 생성자에서 초기 ball 개수를 인자로 받아서 동전 넣기를 기다리는 상태로 전환시킵니다.
		}
	}
	
	//동전 투입
	public void insertQuarter() {
		if(state == HAS_QUARTER) {
			System.out.println("동전은 한 개만 넣어 주세요.");
		} else if(state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("동전을 넣었습니다.");
		} else if(state == SOLD_OUT) {
			System.out.println("매진되었습니다. 다음 기회에 이용해 주세요");
			// 매진 상태에서는 동전을 다시 반환합니다.
		} else if(state == SOLD) {
			// 방금 손잡이를 돌려서 아직 ball을 판매중인 상태라면 좀 기다려달라는 메세지를 출력합니다.
			System.out.println("잠깐만 기다려 주세요. ball이 나가고 있잖아요.");
		}
	}
	
	//동전 반환하기
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("동전이 반환됩니다.");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("동전을 넣어 주세요.");
		} else if (state == SOLD) {
			System.out.println("이미 ball을 뽑으셨네요.");
		} else if (state == SOLD_OUT) {
	    	System.out.println("동전을 넣지 않았잖아요. 동전이 반환되지 않습니다.");
		}
	}

	//손잡이 돌리기
	public void turnCrank() {
		if (state == SOLD) {
			System.out.println("두번 돌린다고 해서 또 다른 gumball이 나오는 게 아니랍니다.");
		} else if (state == NO_QUARTER) {
			System.out.println("동전을 넣어주세요. 동전도 없는데 손잡이를 돌리셨네요.");
		} else if (state == SOLD_OUT) {
			System.out.println("손잡이는 돌리셨지만 gumballs가 아예 없어요. sold_out 상태에요.");
		} else if (state == HAS_QUARTER) {
			System.out.println("손잡이를 돌리셨습니다.");
			state = SOLD;
			dispense();
		}
	}

	// gumball 꺼내기
	private void dispense() {
		if (state == SOLD) {
			System.out.println("Ball 나가고 있어요~");
			count = count - 1;
			if (count == 0) {
				System.out.println("Oops, gumballs 다 떨어졌어요!");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("동전부터 넣고 시작하자잉?");
		} else if (state == SOLD_OUT) {
			System.out.println("매진입니다. 매진이에요.");
		} else if (state == HAS_QUARTER) {
			System.out.println("동전은 있는데 안돌렸네. 먼저 돌려야죠.");
		}
	}

	// gumballs 숫자를 매개변수로 받아서 다시 셋팅합니다.
	public void refill(int numGumBalls) {
		this.count = numGumBalls;
		state = NO_QUARTER;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n시토, Inc.");
		result.append("\nGumball 기계에 자바를 최초로 도입하다.\n");
		result.append("Gumball 재고 : " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n기계 상태: ");
		if (state == SOLD_OUT) {
			result.append("Gumball 없음");
		} else if (state == NO_QUARTER) {
			result.append("동전을 기다리는 중..");
		} else if (state == HAS_QUARTER) {
			result.append("손잡이를 돌려주기를 기다리는 중..");
		} else if (state == SOLD) {
			result.append("Gumball을 내보내는 중..");
		}
		result.append("\n");
		return result.toString();
	}
}





