package decorator;

public abstract class Beverage {
	protected String description;
	public boolean milk;
	public boolean soy;
	public boolean mocha;
	public boolean whip;
	
	public String getDescription(){
		return description;
	}
	public abstract double cost();
	
}
