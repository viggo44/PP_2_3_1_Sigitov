package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String countCar(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = carService.getCars(count);
        model.addAttribute("carCount", cars.size());
        model.addAttribute("printCar", cars);
        System.out.println(cars);
        return "cars";
    }
}
