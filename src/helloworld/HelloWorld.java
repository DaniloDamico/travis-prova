package helloworld;

import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		
		final Logger logger = Logger.getLogger(HelloWorld.class.getName());


		logger.info("Hello World!");
	}

}
