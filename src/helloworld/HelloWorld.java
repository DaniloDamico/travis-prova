package helloworld;

import com.sun.istack.internal.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		
		final Logger logger = Logger.getLogger(HelloWorld.class);
		// System.out.println("Hello world!");

		logger.info("Hello World!");
	}

}
