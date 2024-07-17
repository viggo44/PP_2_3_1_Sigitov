package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private List<Car> cars;

    public CarDAO() {
        cars = new ArrayList<Car>();
        cars.add(new Car("yellow", 10, "V8"));
        cars.add(new Car("black", 5, "V6"));
        cars.add(new Car("white", 3, "V4"));
        cars.add(new Car("pink", 1, "V8"));
        cars.add(new Car("blue", 2, "V6"));
    }

    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size() || count < 1) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }


    public int count() {
        return cars.size();
    }
}
