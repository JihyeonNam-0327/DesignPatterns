
public class MiniDuckSimulator {
	public static void main(String args[]) {
		Duck mallard = new MallardDuck();
		
		mallard.performFly();
		mallard.performQuack();
		
		mallard.display();
		
		//------//
		System.out.println("----구분-----");
		//------//
		
		Duck rubber = new RubberDuck();
		
		rubber.performFly();
		rubber.performQuack();
		
		rubber.display();
		
		//------//
		System.out.println("----구분-----");
		//------//
		
		
		Duck model = new ModelDuck();
		model.performFly();
		//인스턴스를 구현한 클래스를 이렇게 생성하여 인스턴스 변수를 매개변수로 넣을 수 있습니다.
		FlyBehavior frp = new FlyRocketPowered();
		model.setFlyBehavior(frp);
		//또는 model.setFlyBehavior(new FlyRocketPowered()); 라고 할 수 있습니다.
		model.performFly();
		model.performQuack();
		QuackBehavior qb = new MuteQuack();
		model.setQuackBehavior(qb);
		model.performQuack();
		
		//------//
		System.out.println("----브레인파워 : 사냥꾼의 오리 호출기-----");
		//------//
		
		CallQuack 사냥꾼 = new CallQuack();
		사냥꾼.quack();
		
	}
}