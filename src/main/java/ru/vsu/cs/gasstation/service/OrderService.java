package ru.vsu.cs.gasstation.service;

import ru.vsu.cs.gasstation.data.dto.OrderCreateDto;
import ru.vsu.cs.gasstation.entity.Order;

import java.util.List;

public interface OrderService {

    public List<Order> getAllOrders();

    public void saveOrder(OrderCreateDto orderCreateDto);

    public Order getOrder(int id);

    public void deleteOrder(int id);
}
