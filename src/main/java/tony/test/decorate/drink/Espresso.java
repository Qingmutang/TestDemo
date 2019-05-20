package tony.test.decorate.drink;

import tony.test.decorate.Beverage;

public class Espresso extends Beverage {
	
 public Espresso() {
		desc = "Espresso";
	}

	@Override
	public double cost() {
		
		return 1.99;
	}

}
