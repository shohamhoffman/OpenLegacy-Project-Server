package OpenLegacyApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OpenLegacyApp {

	// Here is the main method. From here all of the application is getting started.
	public static void main(String[] args) {
		
		SpringApplication.run(OpenLegacyApp.class, args);	
		
	}

}
