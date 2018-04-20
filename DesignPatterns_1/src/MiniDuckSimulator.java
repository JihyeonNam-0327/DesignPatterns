
public class MiniDuckSimulator {
	public static void main(String args[]) {
		Duck mallard = new MallardDuck();
		
		mallard.performFly();
		mallard.performQuack();
		
		mallard.display();
		
		//------//
		System.out.println("----����-----");
		//------//
		
		Duck rubber = new RubberDuck();
		
		rubber.performFly();
		rubber.performQuack();
		
		rubber.display();
		
		//------//
		System.out.println("----����-----");
		//------//
		
		
		Duck model = new ModelDuck();
		model.performFly();
		//�ν��Ͻ��� ������ Ŭ������ �̷��� �����Ͽ� �ν��Ͻ� ������ �Ű������� ���� �� �ֽ��ϴ�.
		FlyBehavior frp = new FlyRocketPowered();
		model.setFlyBehavior(frp);
		//�Ǵ� model.setFlyBehavior(new FlyRocketPowered()); ��� �� �� �ֽ��ϴ�.
		model.performFly();
		model.performQuack();
		QuackBehavior qb = new MuteQuack();
		model.setQuackBehavior(qb);
		model.performQuack();
		
		//------//
		System.out.println("----�극���Ŀ� : ��ɲ��� ���� ȣ���-----");
		//------//
		
		CallQuack ��ɲ� = new CallQuack();
		��ɲ�.quack();
		
	}
}