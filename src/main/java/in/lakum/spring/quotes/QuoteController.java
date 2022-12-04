package in.lakum.spring.quotes;

import in.lakum.spring.quotes.model.Quote;
import in.lakum.spring.quotes.model.QuoteResource;
import in.lakum.spring.quotes.repository.QuoteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Resource Controller
 */
@RestController
public class QuoteController {
    private final QuoteRepository quoteRepository;
    private final static Quote NONE = new Quote("None");
    private final static Random RANDOMIZER = new Random();

    public QuoteController(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @GetMapping("/api/v1/quotes")
    public List<QuoteResource> getAllQuote() {
        return quoteRepository.findAll().stream()
                .map(quote -> new QuoteResource(quote, "success"))
                .collect(Collectors.toList());
    }

    @GetMapping("/api/v1/quote/{id}")
    public QuoteResource getQuoteById(@PathVariable Long id) {
        return quoteRepository.findById(id)
                .map(quote -> new QuoteResource(quote, "success"))
                .orElse(new QuoteResource(NONE, "Quote " + id + " does not exist"));
    }

    @GetMapping("api/v1/quote")
    public QuoteResource getRandomQuote() {
        return getQuoteById(nextLong(1, quoteRepository.count() + 1));
    }

    public long nextLong(long lowerRange, long upperRange) {
        return (long) (RANDOMIZER.nextDouble() * (upperRange - lowerRange) + lowerRange);
    }
 }
