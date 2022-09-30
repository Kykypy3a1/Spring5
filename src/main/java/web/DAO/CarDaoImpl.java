package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", 1457, 2015));
        cars.add(new Car("Land Cruiser", 200, 2016));
        cars.add(new Car("Nissan", 5247, 2010));
        cars.add(new Car("Lada", 7245, 2021));
        cars.add(new Car("Mercedes", 8854, 2020));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getSomeCars(int number) {
        return cars.subList(0, number);
    }
}
