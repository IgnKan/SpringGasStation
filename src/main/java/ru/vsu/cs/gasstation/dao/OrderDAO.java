package ru.vsu.cs.gasstation.dao;

import org.springframework.stereotype.Repository;
import ru.vsu.cs.gasstation.entity.Order;

import java.util.List;


public interface OrderDAO {

    public List<Order> getAllOrders();

    public void saveOrder(Order order);

    public Order getOrder(int id);

    public void deleteOrder(int id);
}
