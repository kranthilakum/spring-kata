package in.lakum.spring.basics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * With RestController, HelloController is ready for use
 * by Spring MVC to handle web requests.
 *
 * RestController combines Controller and ResponseBody annotations.
 * With RestController, web requests returning data rather than a view.
 */
@RestController
public class HelloController {

    /**
     * GetMapping maps path to method
     * @return String returns text
     */
    @GetMapping("/api/v1/hello")
    public String hello() {
        return "Greetings from Spring Boot!";
    }
}
