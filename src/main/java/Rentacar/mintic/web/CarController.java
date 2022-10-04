package Rentacar.mintic.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Rentacar.mintic.model.Car;
import Rentacar.mintic.service.CarService;

@RestController
@RequestMapping("/api/Car")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/all")
    public List<Car> getCar() {
        return carService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Car> getCar(@PathVariable("id") int id) {
        return carService.getCar(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Car save(@RequestBody Car p) {
        return carService.save(p);
    }
}
