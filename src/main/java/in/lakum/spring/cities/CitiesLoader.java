package in.lakum.spring.cities;

import in.lakum.spring.cities.models.City;
import in.lakum.spring.cities.repository.CitiesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class CitiesLoader implements CommandLineRunner {
    private static final Logger logger = Logger.getLogger(CitiesLoader.class.getName());

    private final CitiesRepository repository;

    public CitiesLoader(CitiesRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();
        repository.save(new City("Bratislava", 432000));
        repository.save(new City("Budapest", 1759000));
        repository.save(new City("Prague", 1280000));
        repository.findAll().forEach((city) -> {
            logger.log(Level.INFO, String.valueOf(city));
        });
    }
}