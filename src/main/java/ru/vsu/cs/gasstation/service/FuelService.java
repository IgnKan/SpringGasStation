package ru.vsu.cs.gasstation.service;

import ru.vsu.cs.gasstation.entity.Fuel;

import java.util.List;

public interface FuelService {

    public List<Fuel> getAllFuels();

    public void saveFuel(Fuel fuel);

    public Fuel getFuel(int id);

    public void deleteFuel(int id);
}
