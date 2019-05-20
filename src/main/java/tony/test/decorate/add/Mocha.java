package tony.test.decorate.add;

import tony.test.decorate.Beverage;
import tony.test.decorate.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDesc() {
		
		return beverage.getDesc()+","+"Mocha";
	}

	@Override
	public double cost() {
		
		return 0.2+beverage.cost();
	}

}
