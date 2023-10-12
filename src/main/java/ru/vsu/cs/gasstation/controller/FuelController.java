package ru.vsu.cs.gasstation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.vsu.cs.gasstation.entity.Fuel;
import ru.vsu.cs.gasstation.service.FuelService;
import ru.vsu.cs.gasstation.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/fuels")
public class FuelController {

    @Autowired
    private FuelService fuelService;

    @GetMapping()
    public List<Fuel> showAllFuels() {
        List<Fuel> allFuels = fuelService.getAllFuels();

        return allFuels;
    }

    @GetMapping("/{id}")
    public Fuel getFuel(@PathVariable int id) {

        Fuel Fuel = fuelService.getFuel(id);

//        if (Fuel == null) {
//            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in Database!");
//        }

        return Fuel;
    }

    @PostMapping()
    public Fuel addNewFuel(@RequestBody Fuel Fuel){

        fuelService.saveFuel(Fuel);

        return Fuel;
    }

    @PutMapping()
    public Fuel updateFuel(@RequestBody Fuel Fuel) {

        fuelService.saveFuel(Fuel);

        return Fuel;
    }

    @DeleteMapping("/{id}")
    public String deleteFuel(@PathVariable int id){

        Fuel Fuel = fuelService.getFuel(id);

//        if(employee == null) {
//            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in database");
//        }

        fuelService.deleteFuel(id);

        return "Fuel with ID = " + id + " was deleted!";

    }
}
