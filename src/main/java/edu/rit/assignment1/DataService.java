package edu.rit.assignment1;


import model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {
    private List<Car> cars = new ArrayList<>();

    public DataService() {
        Car AMDB12 = new Car("Aston Martin", "DB 12", 2022, 300000);
        Car P911GT = new Car("Porsche", "911 GT3", 2023, 300000);
        cars.add(AMDB12);
        cars.add(P911GT);
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public void addCars(Car newCar) {

        cars.add(newCar);
    }
}
