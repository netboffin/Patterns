package singleton;

public class Settings {
static Settings instanceVariable;
public String db = "mysql";
public String user ="root";
public String password ="";


// private constructor can only be instantiated from 
// methods within this class
	private Settings(){} 
	public static Settings getInstance(){
		if(instanceVariable == null)
		{
			instanceVariable = new Settings();
			
		}
		return instanceVariable;		
	}
	public void sayHello(){System.out.println("Hi I'm a Singleton");}
	
	
}
