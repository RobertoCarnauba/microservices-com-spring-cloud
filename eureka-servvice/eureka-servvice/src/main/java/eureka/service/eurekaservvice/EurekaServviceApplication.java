package eureka.service.eurekaservvice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServviceApplication.class, args);
	}

}
