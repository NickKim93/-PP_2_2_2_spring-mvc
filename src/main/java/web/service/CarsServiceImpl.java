package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarsServiceImpl implements CarsService{
    private final List<Car> cars;

    public CarsServiceImpl () {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 2010));
        cars.add(new Car("Toyota", "Camry", 2015));
        cars.add(new Car("Mitsubishi", "Pajero", 2012));
        cars.add(new Car("BMW", "X5", 2013));
        cars.add(new Car("Lexus", "LX570", 2020));
    }

    @Override
    public List<Car> getCars(Integer numberOfCars) {
        return cars.subList(0, numberOfCars);
    }
}
