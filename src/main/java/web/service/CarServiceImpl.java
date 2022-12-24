package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", "Focus", 1));
        cars.add(new Car("Mazda", "6", 2));
        cars.add(new Car("Toyota", "Tundra", 3));
        cars.add(new Car("VAZ", "2121", 0));
        cars.add(new Car("Skoda", "Octavia", 4));
    }

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
