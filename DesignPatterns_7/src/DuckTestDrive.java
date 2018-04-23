
public class DuckTestDrive {
	public static void main(String argsp[]) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		//Turkey는 TurkeyAdapter로 감싸서 Duck처럼 보이게 만듭니다 푸핳
		Turkey duckAdapter = new DuckAdapter(duck);
		
		System.out.println("The Turkey says...터키가뭐라냐며는");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...오리는뭐라냐며는");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says...오리인척하는터키는...땀땀");
		testDuck(turkeyAdapter);
		
		System.out.println("\n이번엔 터키로 변신한 오리인데 잘 안날아 얘는");
		testTurkey(duckAdapter);
		// 여러번 run 하면 개중에 한 번은 날아...
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
	static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}
}
