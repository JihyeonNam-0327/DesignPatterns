
public class MallardDuck extends Duck {

	public MallardDuck () {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("저는 청둥오리 입니다.");
	}

}
