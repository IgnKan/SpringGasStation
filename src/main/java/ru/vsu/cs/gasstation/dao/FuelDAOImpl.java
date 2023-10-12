package ru.vsu.cs.gasstation.dao;

import org.springframework.stereotype.Repository;
import ru.vsu.cs.gasstation.entity.Fuel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Repository
public class FuelDAOImpl implements FuelDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Fuel> getAllFuels() {
        Session session = sessionFactory.getCurrentSession();

        Query<Fuel> query = session.createQuery("from Fuel", Fuel.class);

        List<Fuel> allFuels = query.getResultList();

        return allFuels;
    }

    public void saveFuel(Fuel fuel) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(fuel);
    }

    public Fuel getFuel(int id) {
        Session session = sessionFactory.getCurrentSession();

        Fuel fuel = session.get(Fuel.class, id);

        return fuel;
    }

    public void deleteFuel(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Fuel> query = session.createQuery("delete from Fuel" + "where id =:fuelId");

        query.setParameter("fuelId", id);
        query.executeUpdate();
    }
}
