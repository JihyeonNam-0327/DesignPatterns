
public class Whip extends CondimentDecorator{
	
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", ÈÖÇÎÅ©¸²";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
}
