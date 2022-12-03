package in.lakum.spring.basics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController is a Resource Controller.
 * HTTP requests are handled by a controller.
 * HelloController is a component identified by
 * the @RestController annotation
 *
 * With @RestController, HelloController is ready for use
 * by Spring MVC to handle web requests.
 *
 * The @RestController combines @Controller and @ResponseBody annotations.
 * With @RestController, web requests returning data rather than a view.
 */
@RestController
public class HelloController {

    /**
     * GetMapping maps path to method.
     * @see <a href="http://localhost:8080/api/v1/hello">/api/v1/hello</a>
     * @return String returns text
     */
    @GetMapping("/api/v1/hello")
    public String hello() {
        return "Greetings from Spring Boot!";
    }
}
