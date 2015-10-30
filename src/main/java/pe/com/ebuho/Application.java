package pe.com.ebuho;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pe.com.ebuho.model.AdmMenu;
import pe.com.ebuho.repository.AdmMenuRepository;

@SpringBootApplication
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    public CommandLineRunner demo(AdmMenuRepository repository) {
        return (args) -> {
            for (AdmMenu admMenu : repository.findAll()) {
                logger.info(admMenu.toString());
            }
        };
    }
}
