package in.lakum.spring.cities;

import java.util.List;
import java.util.Optional;

import in.lakum.spring.cities.models.City;
import in.lakum.spring.cities.repository.CitiesRepository;
import org.springframework.stereotype.Service;

@Service
public class CitiesService {
    private final CitiesRepository citiesRepository;

    private final static City city = new City();

    public CitiesService(CitiesRepository citiesRepository) {
        this.citiesRepository = citiesRepository;
    }

    public List<City> findCities() {
        return (List<City>) citiesRepository.findAll();
    }

    public Optional<City> findCityById(Long id) {
        return citiesRepository.findById(id);
    }

    public City saveCity(City city) {
        return citiesRepository.save(city);
    }

    public City updateCityById(Long id, City city) {
        return citiesRepository.save(city);
    }

    public void deleteCityById(Long id) {
        citiesRepository.deleteById(id);
    }
}
