package in.lakum.spring.cities;

import java.util.List;
import java.util.Optional;

import in.lakum.spring.cities.models.City;
import org.springframework.web.bind.annotation.*;

@RestController
public class CitiesController {

    private final CitiesService citiesService;

    public CitiesController(CitiesService citiesService) {
        this.citiesService = citiesService;
    }

    @GetMapping("/api/v1/cities")
    public List<City> getCities() {
        return citiesService.findCities();
    }

    @GetMapping("/api/v1/cities/{id}")
    public Optional<City> getCitiesById(@PathVariable Long id) {
        return citiesService.findCityById(id);
    }

    @PostMapping("/api/v1/cities/{city}")
    public City saveCity(@PathVariable City city) {
        return citiesService.saveCity(city);
    }

    @PatchMapping("/api/v1/cities/{id}/{city}")
    public City updateCity(@PathVariable Long id, @PathVariable City city) {
        return citiesService.updateCityById(id, city);
    }

    @DeleteMapping("/api/v1/cities/{id}")
    public void deleteCityByid(@PathVariable Long id) {
        citiesService.deleteCityById(id);
    }
}
