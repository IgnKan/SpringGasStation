package ru.vsu.cs.gasstation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.vsu.cs.gasstation.data.dto.OrderCreateDto;
import ru.vsu.cs.gasstation.entity.Client;
import ru.vsu.cs.gasstation.entity.Fuel;
import ru.vsu.cs.gasstation.entity.Order;
import ru.vsu.cs.gasstation.service.ClientService;
import ru.vsu.cs.gasstation.service.FuelService;
import ru.vsu.cs.gasstation.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private FuelService fuelService;
    @Autowired
    private ClientService clientService;

    @GetMapping()
    public List<Order> showAllOrders() {
        List<Order> allOrders = orderService.getAllOrders();

        return allOrders;
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable int id) {

        Order Order = orderService.getOrder(id);

//        if (Order == null) {
//            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in Database!");
//        }

        return Order;
    }

    @PostMapping()
    public String addNewOrder(@RequestBody OrderCreateDto orderCreateDto){

        orderService.saveOrder(orderCreateDto);

        return "Order was created!";
    }

    @PutMapping()
    public String updateOrder(@RequestBody OrderCreateDto orderCreateDto) {

        orderService.saveOrder(orderCreateDto);

        return "Order was updated!";
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable int id){

        Order Order = orderService.getOrder(id);

//        if(employee == null) {
//            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in database");
//        }

        orderService.deleteOrder(id);

        return "Order with ID = " + id + " was deleted!";

    }
    
}
