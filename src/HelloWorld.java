import java.util.logging.Logger;

class HelloWorld{

	public static void main(String[] args){

        Logger logger = Logger.getLogger(HelloWorld.class.getName()); 
		// sonarcloud considers writing on the standard output through the System.out.println() method a code smell to be corrected.
		logger.info("Hello, World");
	}

}