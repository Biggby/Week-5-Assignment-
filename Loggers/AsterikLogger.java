package Loggers;

public class AsterikLogger implements Logger {
	
	@Override
	public void log(String message) {
		System.out.println("****" + message + "****");
		
	}

	@Override
	public void error(String message) {
		String error = "****" + message + "****";
		System.out.println(error);
		
		
	}

}
