package assignment;

public class Application {

	public static void main(String[] args) {
		Logger logger1 = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		logger1.Log("Hello!");
		System.out.println();
		logger1.Error("Good Bye");
		
		System.out.println();
		
		logger2.Log("Howdy!");
		System.out.println();
		logger2.Error("STOP!");
	}

}
