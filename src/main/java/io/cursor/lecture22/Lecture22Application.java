package io.cursor.lecture22;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class Lecture22Application {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(Lecture22Application.class, args);

//		for (String name : run.getBeanDefinitionNames())
//			//System.out.println(" = = = = "+name   );
//			//log.info(" = = | = = "+name);
//	}
	}
}
