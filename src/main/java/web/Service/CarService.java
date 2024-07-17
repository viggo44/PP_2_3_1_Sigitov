package web.Service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public int countCar();

    public List<Car> getCars(Integer count);

}
