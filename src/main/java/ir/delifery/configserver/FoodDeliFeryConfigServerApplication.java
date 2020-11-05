package ir.delifery.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FoodDeliFeryConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodDeliFeryConfigServerApplication.class, args);
	}

}
