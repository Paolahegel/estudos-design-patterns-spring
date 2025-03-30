package dio.estudos_design_patterns_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EstudosDesignPatternsSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudosDesignPatternsSpringApplication.class, args);
	}

}
