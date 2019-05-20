package tony.test.decorate;

import tony.test.decorate.add.Mocha;
import tony.test.decorate.drink.Tea;

public class DecorateTest {
	
	public static void main(String[] args) {
		Beverage tea = new Tea();
		Beverage mocha = new Mocha(tea);
		Beverage mocha2 = new Mocha(mocha);
		
		System.out.println(mocha.getDesc());
		System.out.println(mocha.cost());
		System.out.println(mocha2.getDesc());
		System.out.println(mocha2.cost()); 
	}

}
