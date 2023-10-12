package ru.vsu.cs.gasstation.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.vsu.cs.gasstation.dao.OrderDAO;
import ru.vsu.cs.gasstation.data.dto.OrderCreateDto;
import ru.vsu.cs.gasstation.data.mapper.OrderMapper;
import ru.vsu.cs.gasstation.entity.Order;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderDAO orderDAO;
    @Autowired
    private OrderMapper orderMapper;

    @Transactional
    public List<Order> getAllOrders() {
        return orderDAO.getAllOrders();
    }

    @Transactional
    public void saveOrder(OrderCreateDto orderCreateDto) {
        Order order = orderMapper.orderCreateDtoToOrder(orderCreateDto);

        orderDAO.saveOrder(order);
    }

    @Transactional
    public Order getOrder(int id) {
        return orderDAO.getOrder(id);
    }

    @Transactional
    public void deleteOrder(int id) {
        orderDAO.deleteOrder(id);
    }
}
