package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> getCars();

    public List<Car> getSomeCars(int number);
}
