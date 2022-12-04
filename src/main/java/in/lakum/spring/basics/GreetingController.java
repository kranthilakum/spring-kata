package in.lakum.spring.basics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * GreetingController - RESTful web service controller.
 * The controller populates and returns a Greeting object.
 * The object data will be written directly to the HTTP response as JSON.
 * Every method of the controller returns a domain object instead of a view (HTML as in MVC).
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /**
     * Greeting method.
     *
     * The `@GetMapping` annotation ensures that HTTP GET requests to
     * /greeting are mapped to the `greeting()` method.
     * You can also use `@RequestMapping(method=GET)`.
     *
     * The @RequestParam binds the value of the query string parameter `name` into
     * the `name` parameter of the `greeting()` method.
     * If the `name` parameter is absent in the request, the defaultValue is used.
     *
     * Spring use the Jackson JSON library to
     * automatically marshal instances of type Greeting into JSON.
     * Spring's MappingJackson2HttpMessageConverter is automatically chosen to
     * convert the Greeting instance to JSON.
     *
     * counter field is incremented on each call to same GreetingController instance.
     *
     * @see <a href="http://localhost:8080/api/v1/greeting">/api/v1/greeting</a>
     * @see <a href="http://localhost:8080/api/v1/greeting?name=Hello">/api/v1/greeting?name=Hello</a>
     * @see <a href="http://localhost:8080/api/v1/greeting?name="Hello">/api/v1/greeting?name="Hello"</a>
     *
     * @param name Name
     * @return Greeting object
     */
    @GetMapping("/api/v1/greeting")
    public Greeting Greeting(
            @RequestParam(value = "name", defaultValue = "Spring") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
