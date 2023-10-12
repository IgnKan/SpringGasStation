package ru.vsu.cs.gasstation.service;

import ru.vsu.cs.gasstation.dao.FuelDAO;
import ru.vsu.cs.gasstation.entity.Fuel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FuelServiceImpl implements FuelService {

    @Autowired
    private FuelDAO fuelDAO;

    @Transactional
    public List<Fuel> getAllFuels() {
        return fuelDAO.getAllFuels();
    }

    @Transactional
    public void saveFuel(Fuel fuel) {
        fuelDAO.saveFuel(fuel);
    }

    @Transactional
    public Fuel getFuel(int id) {
        return fuelDAO.getFuel(id);
    }

    @Transactional
    public void deleteFuel(int id) {
        fuelDAO.deleteFuel(id);
    }
}
