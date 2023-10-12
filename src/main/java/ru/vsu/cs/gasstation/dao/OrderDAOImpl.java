package ru.vsu.cs.gasstation.dao;

import org.springframework.stereotype.Repository;
import ru.vsu.cs.gasstation.entity.Order;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Order> getAllOrders() {
        return null;
    }

    public void saveOrder(Order order) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(order);
    }

    public Order getOrder(int id) {
        Session session = sessionFactory.getCurrentSession();

        Order order = session.get(Order.class, id);

        return order;
    }

    public void deleteOrder(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Order> query = session.createQuery("delete from Order " + "where id =:orderId");

        query.setParameter("orderId", id);
        query.executeUpdate();
    }
}
