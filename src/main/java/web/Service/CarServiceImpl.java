package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDAO carDAO;

    @Override
    public int countCar() {
        return carDAO.count();
    }

    @Override
    public List<Car> getCars(Integer count) {
        return carDAO.getCars(count);
    }


}
