
public class DuckTestDrive {
	public static void main(String argsp[]) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		//Turkey�� TurkeyAdapter�� ���μ� Duckó�� ���̰� ����ϴ� Ǫ�K
		Turkey duckAdapter = new DuckAdapter(duck);
		
		System.out.println("The Turkey says...��Ű������ĸ��");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...�����¹���ĸ��");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says...������ô�ϴ���Ű��...����");
		testDuck(turkeyAdapter);
		
		System.out.println("\n�̹��� ��Ű�� ������ �����ε� �� �ȳ��� ���");
		testTurkey(duckAdapter);
		// ������ run �ϸ� ���߿� �� ���� ����...
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
