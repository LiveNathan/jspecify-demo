package dev.nathanlively.jspecify_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JspecifyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JspecifyDemoApplication.class, args);

        NullnessDemo demo = new NullnessDemo();
        demo.printMessage(null);
	}

}
