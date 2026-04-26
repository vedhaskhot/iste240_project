// Author: Mohammed Saneeh - 421005948
package org.example.elitedrive.services;

import org.example.elitedrive.entities.Car;
import org.example.elitedrive.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    public List<Car> searchCars(String keyword) {
        return carRepository.searchByKeyword(keyword);
    }

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(Long id, Car updatedCar) {
        updatedCar.setId(id);
        return carRepository.save(updatedCar);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}