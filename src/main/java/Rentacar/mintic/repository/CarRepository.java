package Rentacar.mintic.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;

import Rentacar.mintic.model.Car;
import Rentacar.mintic.repository.crud.CarCrudRepository;
@Repository
public class CarRepository {
        @Autowired
    private CarCrudRepository carCrudRepository;
    public List<Car> getAll(){
        return (List<Car>)carCrudRepository.findAll();
    }
    public Optional<Car> getCar(int id){
        return carCrudRepository.findById(id);
    }
    public Car save(Car p){
        return carCrudRepository.save(p);
    }


}
