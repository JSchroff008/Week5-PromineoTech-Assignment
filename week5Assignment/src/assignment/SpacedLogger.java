package assignment;

public class SpacedLogger implements Logger{

	public void Log(String log) {
		StringBuilder spaces = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			spaces.append(log.charAt(i)).append(" ");
		}
		System.out.println(spaces);
	}

	public void Error(String error) {
		StringBuilder spaces = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			spaces.append(error.charAt(i)).append(" ");
		}
		System.err.println("ERROR: " + spaces);
	}

}
