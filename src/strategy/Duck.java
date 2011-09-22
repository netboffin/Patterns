package strategy;

public class Duck {
	/**
	 *  OK so a Duck Object has methods. 
	 *  These methods are inherited by Ducks subclasses
	 *  Some subclasses shouldn't have the inherited methods
	 *  For example a rubber duck can't fly so it shouldn't have a
	 *  fly method inherited from Duck.
	 *  
	 *  What can we do?
	 *   
	 */
	
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	public void quack(){
		quackBehaviour.quack();
	};
	public void swim(){
		System.out.println("Paddle Paddle Paddle");
	};
	public void display(){
		System.out.println("Hi I'm a Duck");		
	};
	public void fly(){
		System.out.println("Flapping my wings");
	}

}
