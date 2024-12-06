package tayduong.com.demosendemail;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSendEmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSendEmailApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(EmailService emailService) {
        return args -> {
            emailService.sendEmail("ngocanha85@gmail.com");
        };
    }
}
