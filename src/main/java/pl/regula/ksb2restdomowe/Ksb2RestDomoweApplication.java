package pl.regula.ksb2restdomowe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Ksb2RestDomoweApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ksb2RestDomoweApplication.class, args);
	}
}
