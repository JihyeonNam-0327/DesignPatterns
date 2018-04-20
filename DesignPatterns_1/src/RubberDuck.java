
public class RubberDuck extends Duck{

	public RubberDuck () {
		quackBehavior = new Squack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("저는 러버덕 입니다.");
	}

}
