package edu.trinity.personal_library.config;

import edu.trinity.personal_library.services.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CommandLineRunner initializeDB(@Autowired bookService service) {
        return args -> service.initializeDatabase();
    }
}
