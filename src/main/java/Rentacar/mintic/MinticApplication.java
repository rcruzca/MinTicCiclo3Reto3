package Rentacar.mintic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = { "Rentacar.mintic" })
@SpringBootApplication
public class MinticApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinticApplication.class, args);
	}

}
