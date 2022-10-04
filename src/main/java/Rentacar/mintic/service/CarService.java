package Rentacar.mintic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Rentacar.mintic.model.Car;
import Rentacar.mintic.repository.CarRepository;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> getAll() {
        return carRepository.getAll();
    }

    public Optional<Car> getCar(int id) {
        return carRepository.getCar(id);
    }

    public Car save(Car p) {
        if (p.getId() == null) {
            return carRepository.save(p);
        } else {
            Optional<Car> paux = carRepository.getCar(p.getId());
            if (paux.isEmpty()) {
                return carRepository.save(p);
            } else {
                return p;
            }
        }
    }
}