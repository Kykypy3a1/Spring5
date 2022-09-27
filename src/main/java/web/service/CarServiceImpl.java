package web.service;

import org.springframework.stereotype.Component;
import web.DAO.CarDao;
import web.DAO.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> getListOfCars(Integer count) {
        if (count == null || count >= 5) {
            return carDao.getCars();
        } else {
            return carDao.getSomeCars(count);
        }
    }
}
