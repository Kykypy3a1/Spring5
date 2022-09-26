package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Toyota", 1457, 2015));
        cars.add(new Car("Land Cruiser", 200, 2016));
        cars.add(new Car("Nissan", 5247, 2010));
        cars.add(new Car("Lada", 7245, 2021));
        cars.add(new Car("Mercedes", 8854, 2020));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getSomeCars(int number) {
        return cars.subList(0, number - 1);
    }
}
