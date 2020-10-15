package Repository;

import Model.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CarRepository extends CrudRepository<Car, Long> {

    Optional<Car> findByHorsePower(int horsepower);
    Optional<Car> findByType(String type);

    boolean create(Car c);
    Car read(String car_id);
    List<Car> readAll();

}
