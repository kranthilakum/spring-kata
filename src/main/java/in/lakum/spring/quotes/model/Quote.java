package in.lakum.spring.quotes.model;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Quote {


    @Id @GeneratedValue @Getter @Setter private Long id;
    @Getter @Setter private String quote;

    public Quote(String quote) {
        this.quote = quote;
    }

    protected Quote() {}

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Quote))
            return false;
        Quote quote1 = (Quote) o;
        return Objects.equals(id, quote1.id) && Objects.equals(quote, quote1.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quote);
    }

    @Override
    public String toString() {
        return "Quote{" + "id=" + id + ", quote='" + quote + '\'' + '}';
    }
}
