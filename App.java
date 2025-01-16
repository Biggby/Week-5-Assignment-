package Loggers;

public class App {
	
	public static void main(String[] args) {
        // Create instances of each logger
        Logger asteriskLogger = new AsterikLogger();
        Logger spacedLogger = new SpacedLogger();

        // Test AsteriskLogger
        System.out.println("Testing AsteriskLogger:");
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        // Test SpacedLogger
        System.out.println("\nTesting SpacedLogger:");
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }

}
