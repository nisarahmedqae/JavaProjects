package constructorConcepts;

public class Logger {
	private static Logger instance;
	private String log;

	// Private constructor prevents instantiation from outside the class
	private Logger() {
		// Initialize log
		log = "";
	}

	// Static method to get the singleton instance
	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	// Method to log messages
	public void logMessage(String message) {
		log += message + "\n";
	}

	// Method to get the log
	public String getLog() {
		return log;
	}
}
