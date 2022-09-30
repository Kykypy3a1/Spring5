package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.DAO.CarDao;
import web.DAO.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarDao carDao;

    @Override
    public List<Car> getListOfCars(Integer count) {
        if (count == null || count >= 5) {
            return carDao.getCars();
        } else {
            return carDao.getSomeCars(count);
        }
    }
}
