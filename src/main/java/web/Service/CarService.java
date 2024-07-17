package web.Service;

import web.model.Car;

import java.util.List;

public interface CarService {
     int countCar();

     List<Car> getCars(Integer count);

}
