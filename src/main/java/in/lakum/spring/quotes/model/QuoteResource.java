package in.lakum.spring.quotes.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * Representation class.
 */
public class QuoteResource {

    @Getter
    @Setter
    private String type;
    @Getter
    @Setter
    private Quote value;

    public QuoteResource(Quote value, String type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof QuoteResource))
            return false;
        QuoteResource that = (QuoteResource) o;
        return Objects.equals(type, that.type) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }

    @Override
    public String toString() {
        return "QuoteResource{" + "type='" + type + '\'' + ", value=" + value + '}';
    }
}
