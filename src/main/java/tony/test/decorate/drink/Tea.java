package tony.test.decorate.drink;

import tony.test.decorate.Beverage;

public class Tea extends Beverage{
	
	public Tea() {
		this.desc = "Tea";
	}

	@Override
	public double cost() {
	
		return 2.99;
	}
	
	

}
