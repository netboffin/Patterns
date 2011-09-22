package singleton;

public class SingletonRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Settings s1 = Settings.getInstance();
		s1.sayHello();
		Settings s2 = Settings.getInstance();
		s2.sayHello();
		System.out.println("s1.user = " + s1.user + "  s2.user = " + s2.user);
		s2.user = "Johnny Depp";
		System.out.println("s1.user = " + s1.user + "  s2.user = " + s2.user);
		
		System.out.println("s1.db = "  +  s1.db +  "  s2.db  =  " + s2.db);
		System.out.println("s1.password = "  +  s1.password +  "  s2.password  =  " + s2.password);
		
		
	}

}
