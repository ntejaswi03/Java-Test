package job.opening.javatest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavatestApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(JavatestApplication.class);

	public static void main(String[] args) {
		logger.info("Loading Java Test Application");
		
		SpringApplication.run(JavatestApplication.class, args);
	}

}
