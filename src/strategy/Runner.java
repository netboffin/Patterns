/**
 * 
 */
package strategy;

/**
 * @author michael
 *
 */
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Duck d1 = new Duck();
		Duck d2 = new MallardDuck();
		
		d2.display();
		d2.fly();
		d2.swim();
		d2.quack();
		
		
	}

}
