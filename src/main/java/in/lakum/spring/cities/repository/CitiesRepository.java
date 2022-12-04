package in.lakum.spring.cities.repository;

import in.lakum.spring.cities.models.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitiesRepository extends CrudRepository<City, Long> {
}
