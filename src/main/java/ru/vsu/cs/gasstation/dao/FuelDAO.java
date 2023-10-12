package ru.vsu.cs.gasstation.dao;

import org.springframework.stereotype.Repository;
import ru.vsu.cs.gasstation.entity.Fuel;
import java.util.List;


public interface FuelDAO {

    public List<Fuel> getAllFuels();

    public void saveFuel(Fuel fuel);

    public Fuel getFuel(int id);

    public void deleteFuel(int id);

}
