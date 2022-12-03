package in.lakum.spring.basics;

import lombok.Getter;

/**
 * Greeting is a resource representation class.
 * It models the greeting representation.
 *
 * This is a plain old Java object (POJO) with
 * fields, constructor, and accessor methods.
 *
 * Instead of writing accessor methods for id and content,
 * we used Lombok annotations on the fields to
 * let Lombok generate the default getter automatically.
 *
 * @see <a href="https://projectlombok.org/features/GetterSetter">Lombok's GetterSetter</a>
 */
public class Greeting {
    @Getter
    private final long id;
    @Getter
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
