package az.kindergarten.kindergartenspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class KindergartenSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(KindergartenSpringBootApplication.class, args);
    }

}
