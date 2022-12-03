package in.lakum.spring.quotes.repository;

import in.lakum.spring.quotes.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
}
