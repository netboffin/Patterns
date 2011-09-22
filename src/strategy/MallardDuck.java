package strategy;

public class MallardDuck extends Duck{
	
	
	public MallardDuck(){
		flyBehaviour = new FlyingWithWings();
		quackBehaviour = new Quack();
	}
}
