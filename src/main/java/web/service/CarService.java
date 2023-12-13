package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMV", "Black", 1234));
        cars.add(new Car("Ferrari", "Yellow", 2345));
        cars.add(new Car("Honda", "Blue", 3456));
        cars.add(new Car("Skoda", "Silver", 4567));
        cars.add(new Car("Jaguar", "Black", 5678));
    }

    public List<Car> getCar(Integer count) {
        if (count == null || count <= 0) {
            return cars;
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }

}
