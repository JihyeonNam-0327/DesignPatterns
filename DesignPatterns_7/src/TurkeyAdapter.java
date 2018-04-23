// 우선 적응시킬 형식의 인터페이스를 구현해야 합니다. 클라이언트에서 원하는 인터페이스를 구현해야되지요.
public class TurkeyAdapter implements Duck{
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		// 원래 형식의 객체에 대한 레퍼런스가 필요! 생성자에서 레퍼런스 받아오는 작업
		this.turkey = turkey;
	}
	@Override
	public void quack() {
		turkey.gobble(); //그냥 gobble() 메소드를 호출
	}

	@Override
	public void fly() {
		for(int i = 0; i<5; i++) {
			turkey.fly();	// 칠면조는 많이 못나니까 여러번 날게 해서 오리에 대응시킴....(;)
		}
	}

}
