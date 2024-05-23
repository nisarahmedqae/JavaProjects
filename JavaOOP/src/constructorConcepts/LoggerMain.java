package constructorConcepts;

public class LoggerMain {

	// In this example, the Logger class has a private constructor, so you can't
	// create instances of Logger using new Logger(). Instead, you use the
	// getInstance() method to get the singleton instance. Then, you can log
	// messages using the logMessage() method. Finally, you can get the log using
	// the getLog() method and display it.
	
	public static void main(String[] args) {
		// Get the logger instance
		Logger logger = Logger.getInstance();

		// Log some messages
		logger.logMessage("Message 1");
		logger.logMessage("Message 2");
		logger.logMessage("Message 3");

		// Get and display the log
		String log = logger.getLog();
		System.out.println("Log:");
		System.out.println(log);
	}
}