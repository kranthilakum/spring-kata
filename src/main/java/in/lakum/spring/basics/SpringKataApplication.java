package in.lakum.spring.basics;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * The Spring Boot application class.
 *
 * SpringBootApplication implies Configuration, EnableAutoConfiguration,
 * and ComponentScan
 */
@SpringBootApplication
public class SpringKataApplication {

    /**
     * The "main" method!!!
     * The main() method uses Spring Boot’s SpringApplication.run() method
     * to launch an application.
     * @param args argument list
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringKataApplication.class, args);
    }

    /**
     * Retrieve all the beans that were created by your application or
     * that were automatically added by Spring Boot.
     * It sorts them and prints them out.
     *
     * @param appCtx application context
     * @return arguments
     */
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext appCtx) {
        return ctxArgs -> {
            System.out.println("Beans provided by Spring Boot:");
            String[] beanNames = appCtx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }

}
