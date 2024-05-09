package br.com.source.knowledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Consumer;

@SpringBootApplication
public class ApplicationModuleApplication {

	static Consumer<String[]> runner = args -> SpringApplication.run(ApplicationModuleApplication.class, args);

	public static void main(String[] args) {
		runner.accept(args);
	}

}
