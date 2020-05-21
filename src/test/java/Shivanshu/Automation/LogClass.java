package Shivanshu.Automation;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogClass {

	
	private static Logger log = LogManager.getLogger(LogClass.class.getName());
	
	public static void main(String[] args) {
	
		log.debug("I am debugger");
		log.debug("I am priniting Dubug message: DEBUG");
		log.info("I am info messager:INFO");
		log.error("I am printing error :ERROR");
		log.fatal("i am printing Fatal: FATAL Error");
			
		}

}
