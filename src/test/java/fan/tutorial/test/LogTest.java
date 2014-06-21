package fan.tutorial.test;

import org.junit.Test;
import fan.core.log.Logger;

public class LogTest {

	@Test
	public void info(){
		Logger log = Logger.getLogger(LogTest.class);
		log.info("---- This is info message ---");
	}
	
	@Test
	public void error(){
		Logger log = Logger.getLogger(LogTest.class);
		log.error("---- This is error message ---", new RuntimeException());
	}
	
	@Test
	public void debug(){
		Logger log = Logger.getConsoleLogger(LogTest.class);
		log.debug(new RuntimeException(), "---- This is ? message ---", "debug");
	}
}